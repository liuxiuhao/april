package com.pudding.april.service.out.impl;

import com.pudding.april.dao.entity.OutWarehouseJob;
import com.pudding.april.dao.mapper.OutWarehouseJobMapper;
import com.pudding.april.service.out.IOutWarehouseJobService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 出库作业表 服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Service
public class OutWarehouseJobServiceImpl extends ServiceImpl<OutWarehouseJobMapper, OutWarehouseJob> implements IOutWarehouseJobService {

}
