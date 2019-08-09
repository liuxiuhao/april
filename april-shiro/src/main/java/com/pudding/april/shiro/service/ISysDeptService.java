package com.pudding.april.shiro.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pudding.april.shiro.entity.SysDept;
import com.pudding.april.shiro.req.EditDeptReq;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
public interface ISysDeptService extends IService<SysDept> {

    void addDept(EditDeptReq editDeptReq);

    void updateDept(EditDeptReq editDeptReq);

    abstract void deleteDept(Long deptId);
}
