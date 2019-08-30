package com.pudding.april.shiro.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author liuxh
 * @Title: QueryMenuReq
 * @ProjectName page
 * @date 2019/08/08
 */
@Data
@ApiModel(value = "查询菜单对象",description = "菜单查询操作对象")
public class QueryMenuReq implements Serializable {
    @ApiModelProperty(value = "菜单id",notes = "菜单id",example = "0")
    private Long menuId;

    /**
     * 上级菜单ID
     */
    @ApiModelProperty(value = "上级菜单ID",notes = "上级菜单ID",example = "0")
    private Long parentId;

    /**
     * 菜单/按钮名称
     */
    @ApiModelProperty(value = "菜单/按钮名称",notes = "菜单/按钮名称")
    private String menuName;
    /**
     * 菜单URL
     */
    @ApiModelProperty(value = "菜单URL",notes = "菜单URL")
    private String url;
    /**
     * 权限标识
     */
    @ApiModelProperty(value = "权限标识",notes = "权限标识")
    private String perms;
    /**
     * 类型 0菜单 1按钮
     */
    @ApiModelProperty(value = "类型",notes = "类型 0菜单 1按钮")
    private String type;


}
