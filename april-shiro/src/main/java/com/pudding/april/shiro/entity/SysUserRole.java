package com.pudding.april.shiro.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuxh
 * @since 2019-01-25
 */
@Data
public class SysUserRole implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Long Id;
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;


    @Override
    public String toString() {
        return "SysUserRole{" +
        "Id=" + Id +
        "userId=" + userId +
        ", roleId=" + roleId +
        "}";
    }
}
