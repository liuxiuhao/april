package com.pudding.april.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 客户信息表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class BasicCustomer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

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
     * 区
     */
    private String reserve1;

    /**
     * 区
     */
    private String reserve2;

    /**
     * 区
     */
    private String reserve3;

    /**
     * 区
     */
    private String reserve4;

    /**
     * 区
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
     * 数据版本
     */
    private Integer dataVersion;

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

    /**
     * 是否删除 0 : 未删除  1：已删除
     */
    private Integer isDelete;

}
