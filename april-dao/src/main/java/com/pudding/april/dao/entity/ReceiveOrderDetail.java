package com.pudding.april.dao.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 收货单明细表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class ReceiveOrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 收货单号
     */
    private String orderCode;

    private Integer inPlanLineNo;

    /**
     * 批次id
     */
    private Integer lotId;

    /**
     * 批次号:创建收库单的同时生成批次号
     */
    private String batchNo;

    /**
     * 商品编码
     */
    private String skuCode;

    /**
     * 商品名称
     */
    private String skuName;

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

    /**
     * 收货数量
     */
    private BigDecimal receiveQty;

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
