package com.pudding.april.shiro.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pudding.april.common.bean.APIResponse;
import com.pudding.april.shiro.entity.SysMenu;
import com.pudding.april.shiro.req.EditMenuReq;
import com.pudding.april.shiro.req.EditUserReq;
import com.pudding.april.shiro.req.QueryMenuReq;
import com.pudding.april.shiro.service.ISysMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  菜单管理前端控制器
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
@Api(value = "菜单管理",description = "菜单管理")
@RestController
@RequestMapping("/shiro/menu")
public class MenuController {
    @Autowired
    ISysMenuService sysMenuService;
    @ApiOperation(value = "菜单列表查询",notes = "菜单列表查询")
    @GetMapping("/select")
    public IPage<SysMenu> select(){
        Page page = new Page<SysMenu>();
        page.setPages(1);
        return sysMenuService.page(page);
    }
    @ApiOperation(value = "新增菜单",notes = "新增菜单")
    @PostMapping("/add")
    public APIResponse addMenu(@RequestBody @ApiParam(value = "菜单操作对象")  EditMenuReq addMenuReq){
        sysMenuService.addMenu(addMenuReq);
        return APIResponse.success();
    }
    @ApiOperation(value = "修改菜单",notes = "修改菜单")
    @PostMapping("/update")
    public APIResponse updateMenu(@RequestBody @ApiParam(value = "菜单操作对象") EditMenuReq updateMenuReq){
        sysMenuService.updateMenu(updateMenuReq);
        return APIResponse.success();
    }
    @ApiOperation(value = "删除菜单",notes = "删除菜单")
    @GetMapping("/delete")
    public APIResponse deleteMenu(@RequestParam("menuId") @ApiParam(value = "菜单Id") Long menuId){
        sysMenuService.deleteMenu(menuId);
        return APIResponse.success();
    }
}

