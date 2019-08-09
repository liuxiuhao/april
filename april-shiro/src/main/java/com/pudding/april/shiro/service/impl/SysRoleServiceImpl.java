package com.pudding.april.shiro.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pudding.april.common.exception.BusinessException;
import com.pudding.april.shiro.entity.SysRole;
import com.pudding.april.shiro.entity.SysRoleMenu;
import com.pudding.april.shiro.entity.SysUserRole;
import com.pudding.april.shiro.mapper.SysRoleMapper;
import com.pudding.april.shiro.mapper.SysRoleMenuMapper;
import com.pudding.april.shiro.mapper.SysUserRoleMapper;
import com.pudding.april.shiro.req.EditRoleReq;
import com.pudding.april.shiro.service.ISysRoleMenuService;
import com.pudding.april.shiro.service.ISysRoleService;
import com.pudding.april.shiro.service.ISysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * <p>
 *  角色服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {
    @Autowired
    SysUserRoleMapper sysUserRoleMapper;
    @Autowired
    SysRoleMenuMapper sysRoleMenuMapper;
    @Autowired
    ISysRoleMenuService sysRoleMenuService;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addRole(EditRoleReq editRoleReq) {
        QueryWrapper<SysRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysRole::getRoleName,editRoleReq.getRoleName());
        int count = baseMapper.selectCount(queryWrapper);
        if (count>0){
            throw new BusinessException("角色名:"+editRoleReq.getRoleName()+"已存在");
        }
        SysRole sysRole = new SysRole();
        sysRole.setRoleName(editRoleReq.getRoleName());
        sysRole.setCreateTime(LocalDateTime.now());
        sysRole.setModifyTime(LocalDateTime.now());
        sysRole.setRemark(editRoleReq.getRemark());
        save(sysRole);
        sysRoleMenuService.addRoleMenus(sysRole.getRoleId(),editRoleReq.getMenuList());
    }

    /**
     * 修改角色
     * @param editRoleReq
     */
    @Override
    public void updateRole(EditRoleReq editRoleReq) {
        SysRole role = baseMapper.selectById(editRoleReq.getRoleId());
        if (role == null) {
            throw new BusinessException("角色不存在");
        }
        QueryWrapper<SysRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysRole::getRoleName,editRoleReq.getRoleName());
        queryWrapper.lambda().ne(SysRole::getRoleId,editRoleReq.getRoleId());
        int count = baseMapper.selectCount(queryWrapper);
        if (count>0){
            throw new BusinessException("角色名:"+editRoleReq.getRoleName()+"已存在");
        }
        role.setRoleName(editRoleReq.getRoleName());
        role.setModifyTime(LocalDateTime.now());
        role.setRemark(editRoleReq.getRemark());
        updateById(role);
        sysRoleMenuService.addRoleMenus(editRoleReq.getRoleId(),editRoleReq.getMenuList());
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteRole(Long roleId) {
        SysRole role = baseMapper.selectById(roleId);
        if (role == null) {
            throw new BusinessException("角色不存在");
        }
        sysUserRoleMapper.delete(new QueryWrapper<SysUserRole>().lambda().eq(SysUserRole::getRoleId,roleId));
        sysRoleMenuMapper.delete(new QueryWrapper<SysRoleMenu>().lambda().eq(SysRoleMenu::getRoleId,roleId));
        baseMapper.deleteById(roleId);
    }
}
