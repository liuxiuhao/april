package com.pudding.april.dao.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 质检单明细表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class CheckOrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 质检单号
     */
    private String orderCode;

    /**
     * 收货单号
     */
    private String receiveOrderCode;

    /**
     * 对应计划单的业务系统明细序号busi_index
     */
    private String busiIndex;

    /**
     * 商品编码
     */
    private String skuCode;

    /**
     * 商品名称
     */
    private String skuName;

    /**
     * 批号:与单据明细里的批号一致
     */
    private String batchNo;

    /**
     * 收货数量  默认0.0000
     */
    private BigDecimal receiveQty;

    /**
     * 质检数量 默认0.0000
     */
    private BigDecimal checkQty;

    /**
     * 不良数量 默认0.0000
     */
    private BigDecimal badQty;

    /**
     * 质检结果：0:待检 1:不合格 2:合格
     */
    private Integer checkResult;

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

    /**
     * 批次id
     */
    private Integer lotId;

    /**
     * 属性编码 lotAttr01-lotAttr12 12个属性值
     */
    private String lotAttrCode1;

    /**
     * 属性编码 lotAttr01-lotAttr12 12个属性值
     */
    private String lotAttrCode2;

    /**
     * 属性编码 lotAttr01-lotAttr12 12个属性值
     */
    private String lotAttrCode3;

    /**
     * 属性编码 lotAttr01-lotAttr12 12个属性值
     */
    private String lotAttrCode4;

    /**
     * 属性编码 lotAttr01-lotAttr12 12个属性值
     */
    private String lotAttrCode5;

    /**
     * 属性编码 lotAttr01-lotAttr12 12个属性值
     */
    private String lotAttrCode6;

    /**
     * 属性编码 lotAttr01-lotAttr12 12个属性值
     */
    private String lotAttrCode7;

    /**
     * 属性编码 lotAttr01-lotAttr12 12个属性值
     */
    private String lotAttrCode8;

    /**
     * 属性编码 lotAttr01-lotAttr12 12个属性值
     */
    private String lotAttrCode9;

    /**
     * 属性编码 lotAttr01-lotAttr12 12个属性值
     */
    private String lotAttrCode10;

    /**
     * 属性编码 lotAttr01-lotAttr12 12个属性值
     */
    private String lotAttrCode11;

    /**
     * 属性编码 lotAttr01-lotAttr12 12个属性值
     */
    private String lotAttrCode12;

}
