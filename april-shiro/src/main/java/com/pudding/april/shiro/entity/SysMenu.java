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
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单/按钮ID
     */
    @TableId(value = "MENU_ID", type = IdType.AUTO)
    private Long menuId;

    /**
     * 上级菜单ID
     */
    private Long parentId;

    /**
     * 菜单/按钮名称
     */
    private String menuName;

    /**
     * 菜单URL
     */
    private String url;

    /**
     * 权限标识
     */
    private String perms;

    /**
     * 图标
     */
    private String icon;

    /**
     * 类型 0菜单 1按钮
     */
    private String type;

    /**
     * 排序
     */
    private Long orderNum;

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
        return "SysMenu{" +
        "menuId=" + menuId +
        ", parentId=" + parentId +
        ", menuName=" + menuName +
        ", url=" + url +
        ", perms=" + perms +
        ", icon=" + icon +
        ", type=" + type +
        ", orderNum=" + orderNum +
        ", createTime=" + createTime +
        ", modifyTime=" + modifyTime +
        "}";
    }
}
