package com.pudding.april.service.logistics.impl;

import com.pudding.april.dao.entity.LogisticsOrderDetail;
import com.pudding.april.dao.mapper.LogisticsOrderDetailMapper;
import com.pudding.april.service.logistics.ILogisticsOrderDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 配送单明细表 服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Service
public class LogisticsOrderDetailServiceImpl extends ServiceImpl<LogisticsOrderDetailMapper, LogisticsOrderDetail> implements ILogisticsOrderDetailService {

}
