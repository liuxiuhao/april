package com.pudding.april.web.controller.basic;


import com.pudding.april.service.basic.IBasicCustomerService;
import com.pudding.april.service.basic.req.CustomerReq;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping("/add")
    public void addCustomer(CustomerReq customerReq){
        basicCustomerService.addCustomer(customerReq);
    }
}

