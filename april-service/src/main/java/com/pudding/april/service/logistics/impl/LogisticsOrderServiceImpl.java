package com.pudding.april.service.logistics.impl;

import com.pudding.april.dao.entity.LogisticsOrder;
import com.pudding.april.dao.mapper.LogisticsOrderMapper;
import com.pudding.april.service.logistics.ILogisticsOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 配送信息表 服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Service
public class LogisticsOrderServiceImpl extends ServiceImpl<LogisticsOrderMapper, LogisticsOrder> implements ILogisticsOrderService {

}
