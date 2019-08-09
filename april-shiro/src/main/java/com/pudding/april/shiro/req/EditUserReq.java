package com.pudding.april.shiro.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @Author: liuxh
 * @Date: 2019/8/6 16:11
 * @Description:
 */
@ApiModel(value = "user对象",description = "用户对象user")
@Data
public class EditUserReq implements Serializable {
    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名",notes = "修改必输")
    private Long userId;
    /**
     * 用户名
     */
    @NotNull(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名",required = true,notes = "用户名不能为空")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "原密码",notes = "修改密码时必传")
    private String oldPassword;
    /**
     * 密码
     */
    @ApiModelProperty(value = "新密码",notes = "修改密码时必传")
    private String newPassword;
    /**
     * 部门ID
     */
    @ApiModelProperty(value = "部门ID",notes = "部门ID")
    private Long deptId;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱",notes = "邮箱")
    private String email;

    /**
     * 联系电话
     */
    @ApiModelProperty(value = "联系电话",notes = "联系电话")
    private String mobile;

    /**
     * 状态 0锁定 1有效
     */
    @ApiModelProperty(value = "状态",notes = "状态 0锁定 1有效")
    private String status;

    /**
     * 性别 0男 1女
     */
    @ApiModelProperty(value = "性别",notes = "性别 0男 1女")
    private String ssex;

    /**
     * 主题
     */
    @ApiModelProperty(value = "主题",notes = "主题")
    private String theme;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像",notes = "头像")
    private String avatar;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述",notes = "描述")
    private String description;
    /**
     * 角色列表
     */
    @ApiModelProperty(value = "角色列表",notes = "用户分配的角色列表")
    private List<Long> roleList;
}
