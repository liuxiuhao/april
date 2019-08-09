package com.pudding.april.shiro.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

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
@Accessors(chain = true)
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "USER_ID", type = IdType.AUTO)
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 部门ID
     */
    private Long deptId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 联系电话
     */
    private String mobile;

    /**
     * 状态 0锁定 1有效
     */
    private String status;

    /**
     * 创建时间
     */
    private LocalDateTime crateTime;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;

    /**
     * 最近访问时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 性别 0男 1女
     */
    private String ssex;

    /**
     * 主题
     */
    private String theme;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 描述
     */
    private String description;



    @Override
    public String toString() {
        return "SysUser{" +
        "userId=" + userId +
        ", username=" + username +
        ", password=" + password +
        ", deptId=" + deptId +
        ", email=" + email +
        ", mobile=" + mobile +
        ", status=" + status +
        ", crateTime=" + crateTime +
        ", modifyTime=" + modifyTime +
        ", lastLoginTime=" + lastLoginTime +
        ", ssex=" + ssex +
        ", theme=" + theme +
        ", avatar=" + avatar +
        ", description=" + description +
        "}";
    }

}
