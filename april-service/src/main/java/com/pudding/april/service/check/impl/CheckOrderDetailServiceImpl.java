package com.pudding.april.service.check.impl;

import com.pudding.april.dao.entity.CheckOrderDetail;
import com.pudding.april.dao.mapper.CheckOrderDetailMapper;
import com.pudding.april.service.check.ICheckOrderDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 质检单明细表 服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Service
public class CheckOrderDetailServiceImpl extends ServiceImpl<CheckOrderDetailMapper, CheckOrderDetail> implements ICheckOrderDetailService {

}
