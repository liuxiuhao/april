package com.pudding.april.service.in.impl;

import com.pudding.april.dao.entity.InWarehouseOrder;
import com.pudding.april.dao.mapper.InWarehouseOrderMapper;
import com.pudding.april.service.in.IInWarehouseOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 入库单 服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Service
public class InWarehouseOrderServiceImpl extends ServiceImpl<InWarehouseOrderMapper, InWarehouseOrder> implements IInWarehouseOrderService {

}
