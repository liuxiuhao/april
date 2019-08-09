package com.pudding.april.common.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: liuxh
 * @Date: 2019/8/6 08:14
 * @Description:
 */
@SuppressWarnings("unchecked")
public class APIResponse<T> {
    private static final Logger logger = LoggerFactory.getLogger(APIResponse.class);
    public static final String NOT_INITIALIZED = "not-initialized";
    public static final String SUCCESS = "success";
    public static final String FAIL = "fail";
    public static final String UNAUTHORIZED_SERVICE_INVOKER = "unauthorized-invoker";
    public static final String VALIDATION_FAIL = "validation-fail";
    public static final String BAD_PARAMETER = "bad-parameter";
    public static final String UNAUTHORIZED = "unauthorized";
    public static final String USER_NOT_LOGIN = "user-not-login";
    public static final String RPC_FAIL = "rpc-fail";
    public static final String ERROR_TICKET = "ERROR_TICKET";
    protected String code;
    protected T data;
    protected String message;
    private final static Map<String,String> ERROR_MAP = new HashMap<>();
    static {
        ERROR_MAP.put("success", "API调用成功");
        ERROR_MAP.put("fail", "API调用失败");
        ERROR_MAP.put("unauthorized-invoker", "拒绝访问, 未授权的服务调用者");
        ERROR_MAP.put("validation-fail", "请求参数验证失败");
        ERROR_MAP.put("bad-parameter", "拒绝访问, 请求参数错误");
        ERROR_MAP.put("unauthorized", "拒绝访问, 您没有权限请求该资源");
        ERROR_MAP.put("not-initialized", "返回值未初始化");
        ERROR_MAP.put("user-not-login", "用户未登录");
        ERROR_MAP.put("rpc-fail", "远程调用失败【{0}】");
    }
    public APIResponse() {
        this("not-initialized", null, null);
    }

    public APIResponse(String code) {
        this(code, null, null);
    }

    public APIResponse(String code, T data) {
        this(code, data, null);
    }

    public APIResponse(String code, T data, String message) {
        this.code = code;
        this.data = data;
        if (message == null) {
            this.message = ERROR_MAP.get(code);
        } else {
            this.message = message;
        }

    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return "success".equals(this.getCode());
    }

    public static <T> APIResponse<T> success(T data) {
        return new APIResponse("success", data);
    }

    public static APIResponse success() {
        return success(null);
    }

    public static boolean isSuccess(APIResponse apiResponse) {
        return apiResponse == null ? false : apiResponse.isSuccess();
    }

    public static APIResponse fail(String message) {
        return new APIResponse("fail", (Object)null, message);
    }

    public static APIResponse fail(Throwable t) {
        return fail(t.getMessage());
    }

    public static APIResponse widthCode(String code) {
        return new APIResponse(code);
    }

    public static <T> APIResponse<T> widthCode(String code, T data) {
        return new APIResponse(code, data);
    }

    public static APIResponse withCodeAndMessageArgs(String code, String... args) {
        APIResponse ret = widthCode(code, null);

        try {
            ret.setMessage(MessageFormat.format(ret.getMessage(), args));
        } catch (Exception var4) {
            logger.error(var4.getMessage(), var4);
        }

        return ret;
    }

    public static APIResponse<BindingResult> fail(BindingResult bindingResult) {
        Map<String, String> errorMap = new HashMap();
        Iterator var2 = bindingResult.getFieldErrors().iterator();

        while(var2.hasNext()) {
            FieldError error = (FieldError)var2.next();
            errorMap.put(error.getField(), error.getDefaultMessage());
        }

        return new APIResponse("validation-fail", errorMap);
    }

    public static APIResponse response(String code) {
        return new APIResponse(code);
    }

    public static <T> APIResponse<T> response(String code, T data) {
        return new APIResponse(code, data);
    }

}
