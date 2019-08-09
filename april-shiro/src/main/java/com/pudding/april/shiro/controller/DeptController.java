package com.pudding.april.shiro.controller;


import com.pudding.april.common.bean.APIResponse;
import com.pudding.april.shiro.req.EditDeptReq;
import com.pudding.april.shiro.service.ISysDeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  部门管理前端控制器
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
@Api(description = "部门管理")
@RestController
@RequestMapping("/shiro/dept")
public class DeptController {
    @Autowired
    ISysDeptService sysDeptService;
    @ApiOperation(value = "新增部门",notes = "新增部门")
    @PostMapping("/add")
    public APIResponse addDept(@RequestBody @ApiParam(value = "部门操作对象") EditDeptReq editDeptReq){
        sysDeptService.addDept(editDeptReq);
        return APIResponse.success();
    }
    @ApiOperation(value = "修改部门",notes = "修改部门")
    @PostMapping("/update")
    public APIResponse updateDept(@RequestBody  @ApiParam(value = "部门操作对象") EditDeptReq editDeptReq){
        sysDeptService.updateDept(editDeptReq);
        return APIResponse.success();
    }
    @ApiOperation(value = "删除部门",notes = "删除部门")
    @GetMapping("/delete")
    public APIResponse updateDept(@RequestParam("deptId") @ApiParam(value = "部门ID")  Long deptId){
        sysDeptService.deleteDept(deptId);
        return APIResponse.success();
    }
}

