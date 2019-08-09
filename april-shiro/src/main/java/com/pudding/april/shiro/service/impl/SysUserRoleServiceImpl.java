package com.pudding.april.shiro.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Sets;
import com.pudding.april.shiro.entity.SysUserRole;
import com.pudding.april.shiro.mapper.SysUserRoleMapper;
import com.pudding.april.shiro.service.ISysUserRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements ISysUserRoleService {

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addUserRoles(Long userId, List<Long> roleIds) {
        QueryWrapper<SysUserRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysUserRole::getUserId,userId);
        //删除
        remove(queryWrapper);
        //新增
        Set<SysUserRole> userRoles = Sets.newHashSet();
        roleIds.forEach(x->{
            SysUserRole sysUserRole = new SysUserRole();
            sysUserRole.setUserId(userId);
            sysUserRole.setRoleId(x);
            userRoles.add(sysUserRole);
        });
        saveBatch(userRoles);
    }

    @Override
    public void deleteUserRole(Long userId, Long roleId) {
        QueryWrapper<SysUserRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysUserRole::getUserId,userId);
        queryWrapper.lambda().eq(SysUserRole::getRoleId,roleId);
        remove(queryWrapper);
    }

}
