package com.pudding.april.shiro.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pudding.april.shiro.entity.SysRole;
import com.pudding.april.shiro.req.EditRoleReq;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
public interface ISysRoleService extends IService<SysRole> {
    /**
     * 新增角色
     * @param editRoleReq
     */
    void addRole(EditRoleReq editRoleReq);

    void updateRole(EditRoleReq editRoleReq);

    @Transactional(rollbackFor = Exception.class)
    void deleteRole(Long roleId);
}
