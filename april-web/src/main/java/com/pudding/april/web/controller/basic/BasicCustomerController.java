package com.pudding.april.web.controller.basic;


import com.pudding.april.common.bean.APIResponse;
import com.pudding.april.service.basic.IBasicCustomerService;
import com.pudding.april.service.basic.req.CustomerReq;
import com.pudding.april.shiro.req.QueryUserReq;
import com.pudding.april.shiro.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 客户信息表 前端控制器
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Api(value = "客户操作Controller",tags = "CustomerController", description = " 客户,供应商,货主管理")
@RestController
@RequestMapping("/webApi/basic/customer")
public class BasicCustomerController {
    @Autowired
    IBasicCustomerService basicCustomerService;
    @Autowired
    ISysUserService sysUserService;
    @PostMapping("/add")
    public void addCustomer(CustomerReq customerReq){
        basicCustomerService.addCustomer(customerReq);
    }
    @ApiOperation(value = "查询用户列表",notes = "分页查询用户列表")
    @GetMapping("/select")
    public APIResponse selectByPage(){
        QueryUserReq queryUserReq = new QueryUserReq();
        return APIResponse.success(sysUserService.selectByPage(queryUserReq));
    }

}

