package com.pudding.april.service.inventory.impl;

import com.pudding.april.dao.entity.InventoryOrder;
import com.pudding.april.dao.mapper.InventoryOrderMapper;
import com.pudding.april.service.inventory.IInventoryOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pudding.april.service.inventory.IInventoryOrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 盘点单 服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Service
public class InventoryOrderServiceImpl extends ServiceImpl<InventoryOrderMapper, InventoryOrder> implements IInventoryOrderService {

}
