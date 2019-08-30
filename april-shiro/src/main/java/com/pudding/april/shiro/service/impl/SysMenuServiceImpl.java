package com.pudding.april.shiro.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.pudding.april.common.exception.BusinessException;
import com.pudding.april.shiro.entity.SysMenu;
import com.pudding.april.shiro.entity.SysRoleMenu;
import com.pudding.april.shiro.mapper.SysMenuMapper;
import com.pudding.april.shiro.mapper.SysRoleMenuMapper;
import com.pudding.april.shiro.req.EditMenuReq;
import com.pudding.april.shiro.req.QueryMenuReq;
import com.pudding.april.shiro.resp.Tree;
import com.pudding.april.shiro.service.ISysMenuService;
import com.pudding.april.shiro.utils.TreeUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  菜单服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements ISysMenuService {
    @Autowired
    SysRoleMenuMapper sysRoleMenuMapper;
    /**
     * 新增菜单
     * @param editMenuReq
     */
    @Override
    public void addMenu(EditMenuReq editMenuReq){
            SysMenu sysMenu = new SysMenu();
            BeanUtils.copyProperties(editMenuReq,sysMenu);
            sysMenu.setCreateTime(LocalDateTime.now());
            sysMenu.setModifyTime(LocalDateTime.now());
            save(sysMenu);
        }

    /**
     *  修改菜单
      * @param editMenuReq
     */
    @Override
    public void updateMenu(EditMenuReq editMenuReq){
        SysMenu sysMenu = baseMapper.selectById(editMenuReq.getMenuId());
        if (sysMenu == null) {
            throw new BusinessException("菜单不存在");
        }
        BeanUtils.copyProperties(editMenuReq,sysMenu);
        sysMenu.setModifyTime(LocalDateTime.now());
        updateById(sysMenu);
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteMenu(Long menuId){
        SysMenu sysMenu = baseMapper.selectById(menuId);
        if (sysMenu == null) {
            return;
        }
        sysRoleMenuMapper.delete(new QueryWrapper<SysRoleMenu>().lambda().eq(SysRoleMenu::getMenuId,menuId));
        baseMapper.deleteById(menuId);
    }
    /**
     * 查询菜单列表
     * @param queryMenuReq
     * @return
     */
    @Override
    public List<SysMenu> selectList(QueryMenuReq queryMenuReq){
        QueryWrapper<SysMenu> queryWrapper = new QueryWrapper<>();
        if (!StringUtils.isEmpty(queryMenuReq.getMenuName())){
            queryWrapper.lambda().eq(SysMenu::getMenuName,queryMenuReq.getMenuName());
        }
        if (!StringUtils.isEmpty(queryMenuReq.getType())){
            queryWrapper.lambda().eq(SysMenu::getType,queryMenuReq.getType());
        }
        if (!StringUtils.isEmpty(queryMenuReq.getPerms())){
            queryWrapper.lambda().like(SysMenu::getPerms,queryMenuReq.getPerms());
        }
        return baseMapper.selectList(queryWrapper);
    }

    @Override
    public List<Tree<SysMenu>> selectTreeByUser(Long userId) {
        List<SysMenu> menus = baseMapper.selectList(new QueryWrapper<>());
        ArrayList<Tree<SysMenu>> trees = Lists.newArrayList();
        if (menus == null) {
            return trees;
        }
        return TreeUtils.buildList(buildMenuTree(menus),"0");
    }
    /**
     * 封装菜单树
     * @param menus
     * @return
     */
    private List<Tree<SysMenu>> buildMenuTree(List<SysMenu> menus) {
        List<Tree<SysMenu>> trees = Lists.newArrayList();
        menus.forEach(menu -> {
            if (menu.getType().equals("0")){
                Tree<SysMenu> tree = new Tree<>();
                tree.setId(menu.getMenuId().toString());
                tree.setParentId(menu.getParentId().toString());
                tree.setText(menu.getMenuName());
                tree.setIcon(menu.getIcon());
                tree.setUrl(menu.getUrl());
                trees.add(tree);
            }
        });
        return trees;
    }
}
