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
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    @TableId(value = "ROLE_ID", type = IdType.AUTO)
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String remark;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;


    @Override
    public String toString() {
        return "SysRole{" +
        "roleId=" + roleId +
        ", roleName=" + roleName +
        ", remark=" + remark +
        ", createTime=" + createTime +
        ", modifyTime=" + modifyTime +
        "}";
    }
}
