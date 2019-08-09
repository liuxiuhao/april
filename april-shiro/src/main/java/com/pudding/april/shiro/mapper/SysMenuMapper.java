package com.pudding.april.shiro.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pudding.april.shiro.entity.SysMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    /**
     * 通过用户信息查询关联菜单列表
     * @param userId 用户id
     * @return
     */
    List<SysMenu> selectListByUserId(@Param("userId") Long userId);
}
