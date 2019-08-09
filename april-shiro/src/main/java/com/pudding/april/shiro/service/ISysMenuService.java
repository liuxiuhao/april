package com.pudding.april.shiro.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pudding.april.shiro.entity.SysMenu;
import com.pudding.april.shiro.req.EditMenuReq;
import com.pudding.april.shiro.req.QueryMenuReq;
import com.pudding.april.shiro.resp.Tree;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
public interface ISysMenuService extends IService<SysMenu> {
    /**
     * 新增菜单
     * @param editMenuReq
     */
    void addMenu(EditMenuReq editMenuReq);

    /**
     * 修改菜单
     * @param editMenuReq
     */
    void updateMenu(EditMenuReq editMenuReq);

    /**
     * 删除菜单
     * @param menuId
     */
    void deleteMenu(Long menuId);

    /**
     * 查询菜单列表
     * @param queryMenuReq
     * @return
     */
    List<SysMenu> selectList(QueryMenuReq queryMenuReq);

    /**
     * 查询用户对应的菜单列表
     * @return
     */
    Tree<SysMenu> selectTreeByUser(Long userId);
}
