package com.pudding.april.service.out.impl;

import com.pudding.april.dao.entity.PickOrder;
import com.pudding.april.dao.mapper.PickOrderMapper;
import com.pudding.april.service.out.IPickOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pudding.april.service.out.IPickOrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 拣货单 服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Service
public class PickOrderServiceImpl extends ServiceImpl<PickOrderMapper, PickOrder> implements IPickOrderService {

}
