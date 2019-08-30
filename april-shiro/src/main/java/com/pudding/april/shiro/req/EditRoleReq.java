package com.pudding.april.shiro.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author liuxh
 * @Title: EditRoleReq
 * @ProjectName page
 * @date 2019/08/08
 */
@ApiModel(value = "角色操作对象",description = "角色操作对象")
@Data
public class EditRoleReq implements Serializable{
    @ApiModelProperty(value = "用户id",notes = "用户id,修改时必输",example = "0")
    private Long roleId;
    /**
     * 角色名称
     */
    @ApiModelProperty(value = "角色名称",notes = "角色名称必输",required = true,example = "0")
    @NotNull(message = "角色名称不能为空")
    private String roleName;

    /**
     * 角色描述
     */
    @ApiModelProperty(value = "角色描述",notes = "角色描述,长度<200")
    private String remark;
    @ApiModelProperty(value = "菜单列表",notes = "分配的菜单列表")
    List<Long> menuList;

}
