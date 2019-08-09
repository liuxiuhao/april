package com.pudding.april.shiro.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Sets;
import com.pudding.april.shiro.entity.SysRoleMenu;
import com.pudding.april.shiro.entity.SysUserRole;
import com.pudding.april.shiro.mapper.SysRoleMenuMapper;
import com.pudding.april.shiro.service.ISysRoleMenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * <p>
 *  角色菜单服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
@Service
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements ISysRoleMenuService {
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addRoleMenus(Long roleId, List<Long> menuIds) {
        QueryWrapper<SysRoleMenu> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysRoleMenu::getRoleId,roleId);
        //删除
        remove(queryWrapper);
        //新增
        Set<SysRoleMenu> roleMenus = Sets.newHashSet();
        menuIds.forEach(x->{
            SysRoleMenu sysRoleMenu = new SysRoleMenu();
            sysRoleMenu.setMenuId(x);
            sysRoleMenu.setRoleId(roleId);
            roleMenus.add(sysRoleMenu);
        });
        saveBatch(roleMenus);
    }
}
