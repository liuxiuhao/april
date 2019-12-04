package com.pudding.april.shiro.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author liuxh
 * @Title: 菜单操作对象
 * @ProjectName page
 * @date 2019/08/08
 */
@ApiModel(value = "菜单操作对象",description = "菜单操作对象")
@Data
public class EditMenuReq implements Serializable {
    /**
     * 菜单/按钮ID
     */
    @ApiModelProperty(value = "菜单id",notes = "修改时必输",example = "0")
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
    @NotNull(message = "菜单/按钮名称不能为空")
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
     * 图标
     */
    @ApiModelProperty(value = "图标",notes = "图标")
    private String icon;

    /**
     * 类型 0菜单 1按钮
     */
    @ApiModelProperty(value = "类型",notes = "类型 0菜单 1按钮")
    private String type;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序",notes = "排序",example = "0")
    private Long orderNum;
}
