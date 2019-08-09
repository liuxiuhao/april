package com.pudding.april.shiro.controller;


import com.pudding.april.common.bean.APIResponse;
import com.pudding.april.shiro.req.EditRoleReq;
import com.pudding.april.shiro.service.ISysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * <p>
 *  角色前端控制器
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
@Api(value = "用户角色controller",tags = {"RoleController"}, description = "用户角色操作")
@RestController
@RequestMapping("/shiro/role")
@Valid
public class RoleController {
    @Autowired
    ISysRoleService sysRoleService;
    @ApiOperation(value = "新增角色",notes = "新增角色")
    @PostMapping("/add")
    public APIResponse addRole(@RequestBody @ApiParam(value = "角色操作对象",required = true) EditRoleReq editRoleReq){
        sysRoleService.addRole(editRoleReq);
        return APIResponse.success();
    }
    @ApiOperation(value = "修改角色",notes = "修改角色")
    @PostMapping("/update")
    public APIResponse updateRole(@RequestBody @ApiParam(value = "角色操作对象",required = true) EditRoleReq editRoleReq){
        sysRoleService.updateRole(editRoleReq);
        return APIResponse.success();
    }
    @ApiOperation(value = "删除角色",notes = "删除角色")
    @GetMapping("/delete")
    public APIResponse updateRole(@RequestParam("roleId") @ApiParam(value = "角色ID",required = true) Long roleId){
        sysRoleService.deleteRole(roleId);
        return APIResponse.success();
    }
}

