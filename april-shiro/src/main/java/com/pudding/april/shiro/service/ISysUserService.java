package com.pudding.april.shiro.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pudding.april.shiro.entity.SysUser;
import com.pudding.april.shiro.req.EditUserReq;
import com.pudding.april.shiro.req.QueryUserReq;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
public interface ISysUserService extends IService<SysUser> {
    /**
     * 根据用户名查询用户信息
     * @param userName
     * @return
     */
    SysUser findByUserName(String userName);

    /**
     * 新增用户
     * @param user
     */
    void addUser(EditUserReq user);

    /**
     * 分页查询
     * @param queryUserReq
     */
    IPage<SysUser> selectByPage(QueryUserReq queryUserReq);

    void updateUser(EditUserReq editUserReq);

    /**
     * 修改用户密码
     * @param user
     */
    void updatePassword(EditUserReq user);

    /**
     * 重置密码 123456
     * @param userId 用户id
     */
    void resetPassword(Long userId);

    @Transactional(rollbackFor = Exception.class)
    void deleteUser(Long userId);
}
