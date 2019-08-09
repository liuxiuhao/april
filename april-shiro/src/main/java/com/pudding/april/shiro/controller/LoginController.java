package com.pudding.april.shiro.controller;

import com.pudding.april.common.bean.APIResponse;
import com.pudding.april.shiro.req.UserLoginReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author: liuxh
 * @Date: 2019/3/1 14:55
 * @Description:
 */
@Api(description = "用户登录管理")
@RestController
@Valid
public class LoginController {
    /**
     * 用户登陆
     * @param userInfo
     * @return
     */
    @ApiOperation(value = "用户登录",notes = "用户登录")
    @RequestMapping(value = "/login")
    public APIResponse login(@RequestBody  UserLoginReq userInfo) {
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(userInfo.getUsername(), userInfo.getPassword());
        try {
            // 执行认证登陆
            subject.login(token);
            //保存用户信息到session
        } catch (IncorrectCredentialsException e) {
            return APIResponse.fail("密码错误");
        } catch (LockedAccountException e) {
            return APIResponse.fail("登录失败，该用户已被冻结");
        } catch (AuthenticationException e) {
            return APIResponse.fail("该用户不存在");
        } catch (Exception e) {
            e.printStackTrace();
            return APIResponse.fail("系统异常");
        }
        return APIResponse.success();
    }
    @ApiOperation(value = "用户未登录",notes = "用户未登录",hidden = true)
    @RequestMapping("/no_login")
    public APIResponse noLogin(){
        return APIResponse.response(APIResponse.USER_NOT_LOGIN);
    }

    /**
     * ShiroFilterFactoryBean未配置perms，roles，ssl，rest，port
     * 时,该方法失效
     * @return
     */
    @ApiOperation(value = "未授权",notes = "未授权",hidden = true)
    @RequestMapping("/unauthorized")
    public APIResponse unauthorized() {
        return APIResponse.response(APIResponse.UNAUTHORIZED);
    }

    /**
     * 退出登陆
     * @return
     */
    @ApiOperation(value = "用户退出登录",notes = "用户退出登录")
    @GetMapping("/login_out")
    public APIResponse loginOut(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return  APIResponse.success();
    }
}
