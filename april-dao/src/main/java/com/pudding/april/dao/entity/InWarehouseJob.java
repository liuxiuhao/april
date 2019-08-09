package com.pudding.april.dao.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 入库作业表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
public class InWarehouseJob implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     *  作业类型：1：收货作业 2：上架作业 3：移库入库作业
     */
    private Integer jobType;

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
     * 来源单号
     */
    private String sourceOrderCode;

    /**
     * 入库单id:根据作业创建入库单后反写过来
     */
    private Integer sourceOrderDetailId;

    /**
     * 入库单id:根据作业创建入库单后反写过来（上架作业才有）
     */
    private Integer inOrderId;

    /**
     * 入库单明细id:根据作业创建入库单后反写过来
     */
    private Integer inOrderDetailId;

    /**
     * 是否已生成入库单:0:未生成
            1:已生成
     */
    private Integer isCreateOrder;

    /**
     *  作业状态:0-新建 1.未执行 2.待执行 3.正执行 4.完成 5.作废 6.异常作业 8.暂停作业
            一期:全部为 “完成” 状态
     */
    private Integer jobStatus;

    private String trayCode;

    /**
     * 商品编码
     */
    private String skuCode;

    /**
     * 货主
     */
    private String ownerCode;

    /**
     * 批号:与单据明细里的批号一致
     */
    private String batchNo;

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

    /**
     * 商品名称
     */
    private String skuName;

    /**
     * 上架数量
     */
    private BigDecimal jobQty;

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

    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getWarehouseAreaCode() {
        return warehouseAreaCode;
    }

    public void setWarehouseAreaCode(String warehouseAreaCode) {
        this.warehouseAreaCode = warehouseAreaCode;
    }

    public String getWarehouseSpaceCode() {
        return warehouseSpaceCode;
    }

    public void setWarehouseSpaceCode(String warehouseSpaceCode) {
        this.warehouseSpaceCode = warehouseSpaceCode;
    }

    public String getSourceOrderCode() {
        return sourceOrderCode;
    }

    public void setSourceOrderCode(String sourceOrderCode) {
        this.sourceOrderCode = sourceOrderCode;
    }

    public Integer getSourceOrderDetailId() {
        return sourceOrderDetailId;
    }

    public void setSourceOrderDetailId(Integer sourceOrderDetailId) {
        this.sourceOrderDetailId = sourceOrderDetailId;
    }

    public Integer getInOrderId() {
        return inOrderId;
    }

    public void setInOrderId(Integer inOrderId) {
        this.inOrderId = inOrderId;
    }

    public Integer getInOrderDetailId() {
        return inOrderDetailId;
    }

    public void setInOrderDetailId(Integer inOrderDetailId) {
        this.inOrderDetailId = inOrderDetailId;
    }

    public Integer getIsCreateOrder() {
        return isCreateOrder;
    }

    public void setIsCreateOrder(Integer isCreateOrder) {
        this.isCreateOrder = isCreateOrder;
    }

    public Integer getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getTrayCode() {
        return trayCode;
    }

    public void setTrayCode(String trayCode) {
        this.trayCode = trayCode;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
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

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public BigDecimal getJobQty() {
        return jobQty;
    }

    public void setJobQty(BigDecimal jobQty) {
        this.jobQty = jobQty;
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
        return "InWarehouseJob{" +
        "id=" + id +
        ", jobType=" + jobType +
        ", warehouseCode=" + warehouseCode +
        ", warehouseAreaCode=" + warehouseAreaCode +
        ", warehouseSpaceCode=" + warehouseSpaceCode +
        ", sourceOrderCode=" + sourceOrderCode +
        ", sourceOrderDetailId=" + sourceOrderDetailId +
        ", inOrderId=" + inOrderId +
        ", inOrderDetailId=" + inOrderDetailId +
        ", isCreateOrder=" + isCreateOrder +
        ", jobStatus=" + jobStatus +
        ", trayCode=" + trayCode +
        ", skuCode=" + skuCode +
        ", ownerCode=" + ownerCode +
        ", batchNo=" + batchNo +
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
        ", skuName=" + skuName +
        ", jobQty=" + jobQty +
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
