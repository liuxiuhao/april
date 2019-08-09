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
public class SysRoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Long Id;
    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 菜单/按钮ID
     */
    private Long menuId;


    @Override
    public String toString() {
        return "SysRoleMenu{" +
        "Id=" + Id +
        "roleId=" + roleId +
        ", menuId=" + menuId +
        "}";
    }
}
