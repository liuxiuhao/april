package com.pudding.april.shiro.req;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


/**
 * @Author: liuxh
 * @Date: 2019/2/19 17:30
 * @Description: 用户登陆
 */
@Data
public class UserLoginReq implements Serializable {
    /**
     * 用户名或手机号
     */
    @NotNull(message = "用户名不能为空")
    String username;
    /**
     * 用户密码
     */
    @NotNull(message = "密码不能为空")
    String password;
}
