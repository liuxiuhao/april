package com.pudding.april.shiro.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author liuxh
 * @Title: EditDeptReq
 * @ProjectName page
 * @date 2019/08/08
 */
@ApiModel(value = "部门操作对象",description ="部门操作对象" )
@Data
public class EditDeptReq implements Serializable {
    @ApiModelProperty(value = "部门Id",notes = "部门id，修改时必输",example = "0")
    private Long deptId;

    /**
     * 上级部门ID
     */
    @ApiModelProperty(value = "上级部门ID",notes = "上级部门ID",example = "0")
    private Long parentId;

    /**
     * 部门名称
     */
    @ApiModelProperty(value = "部门名称",notes = "部门名称",required = true)
    @NotNull(message = "部门名称不能为空")
    private String deptName;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序",notes = "排序",example = "0")
    private Long orderNum;
}
