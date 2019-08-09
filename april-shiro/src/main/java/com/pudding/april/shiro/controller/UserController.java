package com.pudding.april.shiro.controller;


import com.pudding.april.common.bean.APIResponse;
import com.pudding.april.shiro.req.EditUserReq;
import com.pudding.april.shiro.req.QueryUserReq;
import com.pudding.april.shiro.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * <p>
 *  用户管理相关
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
@Api(value = "用户controller",tags = {"UserController"}, description = "用户操作")
@RestController
@RequestMapping("/shiro/user")
@Valid
public class UserController {
    @Autowired
    ISysUserService sysUserService;

    @ApiOperation(value = "新增用户",notes = "用户名不能为空")
    @PostMapping("/add")
    public APIResponse addUser(@RequestBody EditUserReq user){
        sysUserService.addUser(user);
        return APIResponse.success();
    }
    @ApiOperation(value = "查询用户列表",notes = "分页查询用户列表")
    @PostMapping("/select")
    public APIResponse selectByPage(@RequestBody QueryUserReq queryUserReq){
        return APIResponse.success(sysUserService.selectByPage(queryUserReq));
    }
    @ApiOperation(value = "修改用户",notes = "修改用户")
    @PostMapping("/update")
    public APIResponse updateUser(@RequestBody EditUserReq user){
        sysUserService.updateUser(user);
        return APIResponse.success();
    }
    @ApiOperation(value = "修改用户密码",notes = "修改用户密码")
    @PostMapping("/updatePassword")
    public APIResponse updatePassword(@RequestBody EditUserReq user){
        sysUserService.updatePassword(user);
        return APIResponse.success();
    }
    @ApiOperation(value = "重置用户密码",notes = "重置用户密码为123456")
    @PostMapping("/resetPassword")
    public APIResponse resetPassword(@RequestParam("userId") Long userId){
        sysUserService.resetPassword(userId);
        return APIResponse.success();
    }
}

