package com.pudding.april.service.basic.impl;

import com.pudding.april.dao.entity.BasicCustomer;
import com.pudding.april.dao.mapper.BasicCustomerMapper;
import com.pudding.april.service.basic.IBasicCustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pudding.april.service.basic.req.CustomerReq;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户信息表 服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Service
public class BasicCustomerServiceImpl extends ServiceImpl<BasicCustomerMapper, BasicCustomer> implements IBasicCustomerService {

        @Override
        public void addCustomer(CustomerReq customerReq){
                BasicCustomer customer = new BasicCustomer();
                BeanUtils.copyProperties(customerReq,customer);
                save(customer);
        }
}
