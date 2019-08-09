package com.pudding.april.shiro.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pudding.april.common.exception.BusinessException;
import com.pudding.april.shiro.entity.SysDept;
import com.pudding.april.shiro.entity.SysUser;
import com.pudding.april.shiro.mapper.SysDeptMapper;
import com.pudding.april.shiro.mapper.SysUserMapper;
import com.pudding.april.shiro.req.EditDeptReq;
import com.pudding.april.shiro.service.ISysDeptService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
@Service
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper, SysDept> implements ISysDeptService {
    @Autowired
    SysUserMapper sysUserMapper;
    /**
     * 新增部门
     * @param editDeptReq
     */
    @Override
    public void addDept(EditDeptReq editDeptReq){
        SysDept sysDept = new SysDept();
        BeanUtils.copyProperties(editDeptReq,sysDept);
        sysDept.setCreateTime(LocalDateTime.now());
        save(sysDept);
    }
    /**
     * 修改部门
     * @param editDeptReq
     */
    @Override
    public void updateDept(EditDeptReq editDeptReq){
        SysDept sysDept =  baseMapper.selectById(editDeptReq.getDeptId());
        if (sysDept == null) {
            throw new BusinessException("记录不存在");
        }
        BeanUtils.copyProperties(editDeptReq,sysDept);
        sysDept.setCreateTime(LocalDateTime.now());
        baseMapper.updateById(sysDept);
    }

    /**
     * 删除部门
     * @param deptId
     */
    @Override
    public void deleteDept(Long deptId){
        SysDept sysDept =  baseMapper.selectById(deptId);
        if (sysDept == null) {
            return;
        }
        int exitUserCount = sysUserMapper.selectCount(new QueryWrapper<SysUser>().lambda().eq(SysUser::getDeptId,deptId));
        if (exitUserCount>0){
            throw new BusinessException("存在已绑定的用户不能删除");
        }
        baseMapper.deleteById(deptId);
    }

}
