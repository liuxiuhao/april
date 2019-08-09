package com.pudding.april.service.in.impl;

import com.pudding.april.dao.entity.ReceiveOrder;
import com.pudding.april.dao.mapper.ReceiveOrderMapper;
import com.pudding.april.service.in.IReceiveOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 收货单 服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Service
public class ReceiveOrderServiceImpl extends ServiceImpl<ReceiveOrderMapper, ReceiveOrder> implements IReceiveOrderService {

}
