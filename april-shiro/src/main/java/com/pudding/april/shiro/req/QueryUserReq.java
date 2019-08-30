package com.pudding.april.shiro.req;

import com.pudding.april.common.bean.QueryReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户查询
 * @Author: liuxh
 * @Date: 2019/8/6 17:01
 * @Description:
 */
@Data
@ApiModel(value = "查询对象")
public class QueryUserReq extends QueryReq implements Serializable {
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 部门ID
     */
    @ApiModelProperty(value = "部门ID",example = "0")
    private Long deptId;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 联系电话
     */
    @ApiModelProperty(value = "联系电话")
    private String mobile;

    /**
     * 状态 0锁定 1有效
     */
    @ApiModelProperty(value = "状态 ",notes = "状态 0锁定 1有效")
    private String status;

    /**
     * 性别 0男 1女
     */
    @ApiModelProperty(value = "性别 ",notes = "性别 0男 1女")
    private String ssex;
}
