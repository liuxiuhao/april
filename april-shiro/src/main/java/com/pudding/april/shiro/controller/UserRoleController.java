package com.pudding.april.shiro.controller;


import com.pudding.april.common.bean.APIResponse;
import com.pudding.april.shiro.service.ISysUserRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  用户角色关系
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
@Api(value = "用户角色关系")
@RestController
@RequestMapping("/shiro/sysUserRole")
public class UserRoleController {
    @Autowired
    ISysUserRoleService sysUserRoleService;
    @ApiOperation(value = "新增用户角色关系",tags = {"addUserRoles"},notes = "为用户分配0或多个角色")
    public APIResponse addUserRoles(@RequestParam("userId") Long userId, @RequestParam("roleIds") List<Long> roleIds){
        sysUserRoleService.addUserRoles(userId,roleIds);
        return  APIResponse.success();
    }
}

