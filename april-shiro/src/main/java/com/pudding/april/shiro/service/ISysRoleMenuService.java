package com.pudding.april.shiro.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pudding.april.shiro.entity.SysRoleMenu;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  角色菜单关系服务类
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
public interface ISysRoleMenuService extends IService<SysRoleMenu> {
    /**
     * 角色分配菜单
     * @param roleId
     * @param menuIds
     */
    void addRoleMenus(Long roleId, List<Long> menuIds);
}
