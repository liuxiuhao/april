package com.pudding.april.shiro.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pudding.april.common.encoder.MD5Utils;
import com.pudding.april.common.exception.BusinessException;
import com.pudding.april.shiro.entity.SysUser;
import com.pudding.april.shiro.entity.SysUserRole;
import com.pudding.april.shiro.mapper.SysUserMapper;
import com.pudding.april.shiro.mapper.SysUserRoleMapper;
import com.pudding.april.shiro.req.EditUserReq;
import com.pudding.april.shiro.req.QueryUserReq;
import com.pudding.april.shiro.service.ISysUserRoleService;
import com.pudding.april.shiro.service.ISysUserService;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

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
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
    @Autowired
    SysUserRoleMapper sysUserRoleMapper;
    @Autowired
    ISysUserRoleService sysUserRoleService;
    @Override
    public SysUser findByUserName(String userName){
        QueryWrapper queryWrapper = new QueryWrapper(SysUser.class);
        queryWrapper.eq("USERNAME",userName);
        return getOne(queryWrapper);
    }
    @Override
    public void addUser(EditUserReq user) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("EMAIL",user.getEmail());
        Integer count = baseMapper.selectCount(queryWrapper);
        if (count>0){
            throw new BusinessException("邮箱"+user.getEmail()+"已注册");
        }
        SysUser sysUser = new SysUser();
        BeanUtils.copyProperties(user,sysUser);
        if (StringUtils.isEmpty(sysUser.getPassword())) {
            sysUser.setPassword(MD5Utils.encrypt("123456".getBytes()));
        }
        sysUser.setCrateTime(LocalDateTime.now());
        save(sysUser);
        sysUserRoleService.addUserRoles(sysUser.getUserId(),user.getRoleList());
    }

    @Override
    public IPage<SysUser> selectByPage(QueryUserReq queryUserReq) {
        IPage<SysUser> page = new Page<>();
        page.setSize(queryUserReq.getPageSize());
        page.setCurrent(queryUserReq.getPageNum());
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        if (!StringUtils.isEmpty(queryUserReq.getUsername())){
            queryWrapper.eq("USERNAME",queryUserReq.getUsername());
        }
        if (!StringUtils.isEmpty(queryUserReq.getDeptId())){
            queryWrapper.eq("DEPT_ID",queryUserReq.getDeptId());
        }
        if (!StringUtils.isEmpty(queryUserReq.getEmail())){
            queryWrapper.eq("EMAIL",queryUserReq.getEmail());
        }
        if (!StringUtils.isEmpty(queryUserReq.getMobile())){
            queryWrapper.eq("MOBILE",queryUserReq.getMobile());
        }
        if (!StringUtils.isEmpty(queryUserReq.getStatus())){
            queryWrapper.eq("STATUS",queryUserReq.getStatus());
        }
        if (!StringUtils.isEmpty(queryUserReq.getSsex())){
            queryWrapper.eq("SSEX",queryUserReq.getSsex());
        }
        page(page,queryWrapper);
        return  page;
    }

    /**
     * 修改用户
     * @param editUserReq
     */
    @Override
    public void updateUser(EditUserReq editUserReq){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("USER_ID",editUserReq.getUserId());
        SysUser sysUser =  getOne(queryWrapper);
        if (sysUser == null) {
            throw new BusinessException("用户不存在");
        }
        UpdateWrapper updateWrapper = new UpdateWrapper<SysUser>();
        LambdaUpdateWrapper<SysUser> ew = updateWrapper.lambda();
        ew.set(true,SysUser::getAvatar,editUserReq.getAvatar());
        ew.set(true,SysUser::getDeptId,editUserReq.getDeptId());
        ew.set(true,SysUser::getDescription,editUserReq.getDescription());
        ew.set(true,SysUser::getEmail,editUserReq.getEmail());
        ew.set(true,SysUser::getMobile,editUserReq.getMobile());
        ew.set(true,SysUser::getSsex,editUserReq.getSsex());
        ew.set(true,SysUser::getStatus,editUserReq.getStatus());
        ew.set(true,SysUser::getTheme,editUserReq.getTheme());
        ew.set(true,SysUser::getModifyTime,LocalDateTime.now());
        ew.eq(SysUser::getUserId, editUserReq.getUserId());
        update(new SysUser(), ew);
        sysUserRoleService.addUserRoles(sysUser.getUserId(),editUserReq.getRoleList());
    }

    @Override
    public void updatePassword(EditUserReq editUserReq) {
        SysUser user =  baseMapper.selectById(editUserReq.getUserId());
        if (user == null) {
            throw new BusinessException("用户不存在");
        }
        if (editUserReq.getOldPassword()==null||(!MD5Encoder.encode(editUserReq.getOldPassword().getBytes()).equals(user.getPassword()))){
            throw new BusinessException("密码不正确");
        }
        if (editUserReq.getNewPassword()==null||editUserReq.getNewPassword().length()<1){
            throw new BusinessException("密码格式不正确");
        }
        UpdateWrapper<SysUser> userUpdateWrapper = new UpdateWrapper<>();
        userUpdateWrapper.lambda().set(true,SysUser::getPassword,MD5Utils.encrypt(editUserReq.getNewPassword().getBytes()));
        userUpdateWrapper.lambda().eq(SysUser::getUserId,user.getUserId());
        update(new SysUser(),userUpdateWrapper);
    }
    @Override
    public void resetPassword(Long userId) {
        SysUser user =  baseMapper.selectById(userId);
        if (user == null) {
            throw new BusinessException("用户不存在");
        }
        UpdateWrapper<SysUser> userUpdateWrapper = new UpdateWrapper<>();
        userUpdateWrapper.lambda().set(true,SysUser::getPassword,MD5Utils.encrypt("123456".getBytes()));
        userUpdateWrapper.lambda().eq(SysUser::getUserId,user.getUserId());
        update(new SysUser(),userUpdateWrapper);
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteUser(Long userId){
        SysUser sysUser = baseMapper.selectById(userId);
        if (sysUser==null){
            return;
        }
        sysUserRoleMapper.delete(new QueryWrapper<SysUserRole>().lambda().eq(SysUserRole::getUserId,userId));
        removeById(userId);
    }
}
