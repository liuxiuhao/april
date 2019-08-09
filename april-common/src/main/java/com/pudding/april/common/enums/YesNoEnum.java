package com.pudding.april.common.enums;

/**
 * @Author: liuxh
 * @Date: 2019/3/1 14:35
 * @Description:
 */
public enum YesNoEnum {
    YES(1,"是"),
    NO(0,"否");



    private int code;
    private String name;

    YesNoEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }




}

