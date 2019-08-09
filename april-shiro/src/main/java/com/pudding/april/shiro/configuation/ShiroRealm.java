package com.pudding.april.shiro.configuation;

import com.pudding.april.common.enums.YesNoEnum;
import com.pudding.april.shiro.entity.SysUser;
import com.pudding.april.shiro.service.ISysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: liuxh
 * @Date: 2019/2/19 14:07
 * @Description:
 */
public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    ISysUserService userService;
    /**
     * 用户认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        String name = token.getUsername();
        if (name == null) {
            return null;
        }//这里验证authenticationToken和simpleAuthenticationInfo的信息
        SysUser sysUser = userService.findByUserName(name);
        if (sysUser==null){
            return  null;
        }
        //用户禁用
        if (String.valueOf(YesNoEnum.NO.getCode()).equals(sysUser.getStatus()) ){
            throw new LockedAccountException();
        }
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(sysUser, sysUser.getPassword(), getName());
        return simpleAuthenticationInfo;
    }

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        return simpleAuthorizationInfo;
    }


}
