package com.pudding.april.service.check.impl;

import com.pudding.april.dao.entity.CheckOrder;
import com.pudding.april.dao.mapper.CheckOrderMapper;
import com.pudding.april.service.check.ICheckOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 质检单 服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Service
public class CheckOrderServiceImpl extends ServiceImpl<CheckOrderMapper, CheckOrder> implements ICheckOrderService {

}
