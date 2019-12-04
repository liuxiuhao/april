package com.pudding.april.dao.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 库位库存表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class SkuSpaceStock implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 仓库编码
     */
    private String warehouseCode;

    /**
     * 库区编码
     */
    private String warehouseAreaCode;

    /**
     * 库位编码
     */
    private String warehouseSpaceCode;

    /**
     * 托盘条码
     */
    private String trayCode;

    /**
     * 货主
     */
    private String ownerCode;

    /**
     * 商品编码
     */
    private String skuCode;

    /**
     * 商品名称
     */
    private String skuName;

    /**
     * 批次id
     */
    private Integer lotId;

    /**
     * 批号:与单据明细里的批号一致
     */
    private String batchNo;

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
     * 库存状态:0:未分配 1:已分配
     */
    private Integer stockStatus;

    /**
     * 库存数量
     */
    private BigDecimal skuQty;

    /**
     * 冻结数量
     */
    private BigDecimal blockQty;

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

}
