package com.pudding.april.service.stock.impl;

import com.pudding.april.dao.entity.StockBatchInfo;
import com.pudding.april.dao.mapper.StockBatchInfoMapper;
import com.pudding.april.service.stock.IStockBatchInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 批次信息表 服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Service
public class StockBatchInfoServiceImpl extends ServiceImpl<StockBatchInfoMapper, StockBatchInfo> implements IStockBatchInfoService {

}
