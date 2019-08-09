package com.pudding.april.shiro.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
@Data
public class SysDept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部门ID
     */
    @TableId(value = "DEPT_ID", type = IdType.AUTO)
    private Long deptId;

    /**
     * 上级部门ID
     */
    private Long parentId;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 排序
     */
    private Long orderNum;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


    @Override
    public String toString() {
        return "SysDept{" +
        "deptId=" + deptId +
        ", parentId=" + parentId +
        ", deptName=" + deptName +
        ", orderNum=" + orderNum +
        ", createTime=" + createTime +
        "}";
    }
}
