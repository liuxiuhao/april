package com.pudding.april.service.inventory.impl;

import com.pudding.april.dao.entity.InventoryOrderDetail;
import com.pudding.april.dao.mapper.InventoryOrderDetailMapper;
import com.pudding.april.service.inventory.IInventoryOrderDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 盘点单明细 服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Service
public class InventoryOrderDetailServiceImpl extends ServiceImpl<InventoryOrderDetailMapper, InventoryOrderDetail> implements IInventoryOrderDetailService {

}
