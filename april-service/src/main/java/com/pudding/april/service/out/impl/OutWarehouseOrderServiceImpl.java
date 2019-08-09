package com.pudding.april.service.out.impl;

import com.pudding.april.dao.entity.OutWarehouseOrder;
import com.pudding.april.dao.mapper.OutWarehouseOrderMapper;
import com.pudding.april.service.out.IOutWarehouseOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 出库单 服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Service
public class OutWarehouseOrderServiceImpl extends ServiceImpl<OutWarehouseOrderMapper, OutWarehouseOrder> implements IOutWarehouseOrderService {

}
