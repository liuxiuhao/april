package com.pudding.april.dao.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 出库单明细表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
public class OutWarehouseOrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer outId;

    /**
     * 出库单id
     */
    private Integer orderId;

    /**
     * 出库单号
     */
    private String outOrderCode;

    /**
     * 批次号
     */
    private String batchNo;

    private Integer outPlanLineNo;

    /**
     * 商品编码
     */
    private String skuCode;

    /**
     * 商品名称
     */
    private String skuName;

    /**
     * 批次id,通过商品信息反写过来方便显示
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

    /**
     * 本次开单数量
            
     */
    private BigDecimal planOutQty;

    /**
     * 实际出库数量
     */
    private BigDecimal realOutQty;

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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOutId() {
        return outId;
    }

    public void setOutId(Integer outId) {
        this.outId = outId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOutOrderCode() {
        return outOrderCode;
    }

    public void setOutOrderCode(String outOrderCode) {
        this.outOrderCode = outOrderCode;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Integer getOutPlanLineNo() {
        return outPlanLineNo;
    }

    public void setOutPlanLineNo(Integer outPlanLineNo) {
        this.outPlanLineNo = outPlanLineNo;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Integer getLotId() {
        return lotId;
    }

    public void setLotId(Integer lotId) {
        this.lotId = lotId;
    }

    public String getLotAttrCode1() {
        return lotAttrCode1;
    }

    public void setLotAttrCode1(String lotAttrCode1) {
        this.lotAttrCode1 = lotAttrCode1;
    }

    public String getLotAttrCode2() {
        return lotAttrCode2;
    }

    public void setLotAttrCode2(String lotAttrCode2) {
        this.lotAttrCode2 = lotAttrCode2;
    }

    public String getLotAttrCode3() {
        return lotAttrCode3;
    }

    public void setLotAttrCode3(String lotAttrCode3) {
        this.lotAttrCode3 = lotAttrCode3;
    }

    public String getLotAttrCode4() {
        return lotAttrCode4;
    }

    public void setLotAttrCode4(String lotAttrCode4) {
        this.lotAttrCode4 = lotAttrCode4;
    }

    public String getLotAttrCode5() {
        return lotAttrCode5;
    }

    public void setLotAttrCode5(String lotAttrCode5) {
        this.lotAttrCode5 = lotAttrCode5;
    }

    public String getLotAttrCode6() {
        return lotAttrCode6;
    }

    public void setLotAttrCode6(String lotAttrCode6) {
        this.lotAttrCode6 = lotAttrCode6;
    }

    public String getLotAttrCode7() {
        return lotAttrCode7;
    }

    public void setLotAttrCode7(String lotAttrCode7) {
        this.lotAttrCode7 = lotAttrCode7;
    }

    public String getLotAttrCode8() {
        return lotAttrCode8;
    }

    public void setLotAttrCode8(String lotAttrCode8) {
        this.lotAttrCode8 = lotAttrCode8;
    }

    public String getLotAttrCode9() {
        return lotAttrCode9;
    }

    public void setLotAttrCode9(String lotAttrCode9) {
        this.lotAttrCode9 = lotAttrCode9;
    }

    public String getLotAttrCode10() {
        return lotAttrCode10;
    }

    public void setLotAttrCode10(String lotAttrCode10) {
        this.lotAttrCode10 = lotAttrCode10;
    }

    public String getLotAttrCode11() {
        return lotAttrCode11;
    }

    public void setLotAttrCode11(String lotAttrCode11) {
        this.lotAttrCode11 = lotAttrCode11;
    }

    public String getLotAttrCode12() {
        return lotAttrCode12;
    }

    public void setLotAttrCode12(String lotAttrCode12) {
        this.lotAttrCode12 = lotAttrCode12;
    }

    public BigDecimal getPlanOutQty() {
        return planOutQty;
    }

    public void setPlanOutQty(BigDecimal planOutQty) {
        this.planOutQty = planOutQty;
    }

    public BigDecimal getRealOutQty() {
        return realOutQty;
    }

    public void setRealOutQty(BigDecimal realOutQty) {
        this.realOutQty = realOutQty;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(LocalDateTime gmtModify) {
        this.gmtModify = gmtModify;
    }

    public Integer getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(Integer dataVersion) {
        this.dataVersion = dataVersion;
    }

    public Integer getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    public String getCreaterName() {
        return createrName;
    }

    public void setCreaterName(String createrName) {
        this.createrName = createrName;
    }

    public Integer getModifierId() {
        return modifierId;
    }

    public void setModifierId(Integer modifierId) {
        this.modifierId = modifierId;
    }

    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "OutWarehouseOrderDetail{" +
        "id=" + id +
        ", outId=" + outId +
        ", orderId=" + orderId +
        ", outOrderCode=" + outOrderCode +
        ", batchNo=" + batchNo +
        ", outPlanLineNo=" + outPlanLineNo +
        ", skuCode=" + skuCode +
        ", skuName=" + skuName +
        ", lotId=" + lotId +
        ", lotAttrCode1=" + lotAttrCode1 +
        ", lotAttrCode2=" + lotAttrCode2 +
        ", lotAttrCode3=" + lotAttrCode3 +
        ", lotAttrCode4=" + lotAttrCode4 +
        ", lotAttrCode5=" + lotAttrCode5 +
        ", lotAttrCode6=" + lotAttrCode6 +
        ", lotAttrCode7=" + lotAttrCode7 +
        ", lotAttrCode8=" + lotAttrCode8 +
        ", lotAttrCode9=" + lotAttrCode9 +
        ", lotAttrCode10=" + lotAttrCode10 +
        ", lotAttrCode11=" + lotAttrCode11 +
        ", lotAttrCode12=" + lotAttrCode12 +
        ", planOutQty=" + planOutQty +
        ", realOutQty=" + realOutQty +
        ", gmtCreate=" + gmtCreate +
        ", gmtModify=" + gmtModify +
        ", dataVersion=" + dataVersion +
        ", createrId=" + createrId +
        ", createrName=" + createrName +
        ", modifierId=" + modifierId +
        ", modifierName=" + modifierName +
        ", isDelete=" + isDelete +
        "}";
    }
}
