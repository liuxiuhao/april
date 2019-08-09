package com.pudding.april.service.basic.resp;

import java.time.LocalDateTime;

/**
 * @Author: liuxh
 * @Date: 2019/8/6 09:12
 * @Description:
 */
public class CustomerResp {
    /**
     * 客户编码
     */
    private String customerCode;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 客户类型 1：货主 2：供应商 3：客户 4：承运商
     */
    private Integer customerType;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 省份
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;

    /**
     * 地址
     */
    private String address;

    /**
     * 预留字段1
     */
    private String reserve1;

    /**
     * 预留字段2
     */
    private String reserve2;

    /**
     * 预留字段3
     */
    private String reserve3;

    /**
     * 预留字段4
     */
    private String reserve4;

    /**
     * 预留字段5
     */
    private String reserve5;
    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    private LocalDateTime gmtModify;

    /**
     * 创建人
     */
    private Integer createrId;

    /**
     * 创建人名称
     */
    private String createrName;

    /**
     * 修改人
     */
    private Integer modifierId;

    /**
     * 修改人名称
     */
    private String modifierName;

}
