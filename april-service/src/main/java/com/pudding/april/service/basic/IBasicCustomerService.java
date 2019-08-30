package com.pudding.april.service.basic;

import com.pudding.april.dao.entity.BasicCustomer;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pudding.april.service.basic.req.CustomerReq;

/**
 * <p>
 * 客户信息表 服务类
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
public interface IBasicCustomerService extends IService<BasicCustomer> {
    /**
     * 新增客户
     * @param customerReq
     */
    void addCustomer(CustomerReq customerReq);
}
