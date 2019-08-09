package com.pudding.april.shiro.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pudding.april.shiro.entity.SysUserRole;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
public interface ISysUserRoleService extends IService<SysUserRole> {
    /**
     * 新增用户角色关系
     * @param userId 用户id
     * @param roleIds 角色Id列表
     */
    void addUserRoles(Long userId, List<Long> roleIds);

    /**
     * 删除用户角色
     * @param userId
     * @param roleId
     */
    void deleteUserRole(Long userId, Long roleId);
}
