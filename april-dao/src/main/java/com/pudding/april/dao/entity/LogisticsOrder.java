package com.pudding.april.dao.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 配送信息表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
public class LogisticsOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 仓库编码
     */
    private String warehouseCode;

    /**
     * 货主
     */
    private String ownerName;

    /**
     * 入库单号
     */
    private String orderCode;

    /**
     * 收货人
     */
    private String receiver;

    /**
     * 收货地址
     */
    private String receiveAddress;

    /**
     * 收货人联系电话
     */
    private String linkTel;

    /**
     * 物流公司编码
     */
    private String logisticsComCode;

    /**
     * 物流单号
     */
    private String logisticsOrderCode;

    /**
     * 物流状态（配送状态）：0-已出库；1-配送中；2-已完成
     */
    private Boolean logisticsStatus;

    /**
     * 运费
     */
    private BigDecimal freightAmt;

    /**
     * 其他费用
     */
    private BigDecimal otherAmt;

    /**
     * 付费方式：0:我方付
            1:客户付
     */
    private Integer payType;

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

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public String getLinkTel() {
        return linkTel;
    }

    public void setLinkTel(String linkTel) {
        this.linkTel = linkTel;
    }

    public String getLogisticsComCode() {
        return logisticsComCode;
    }

    public void setLogisticsComCode(String logisticsComCode) {
        this.logisticsComCode = logisticsComCode;
    }

    public String getLogisticsOrderCode() {
        return logisticsOrderCode;
    }

    public void setLogisticsOrderCode(String logisticsOrderCode) {
        this.logisticsOrderCode = logisticsOrderCode;
    }

    public Boolean getLogisticsStatus() {
        return logisticsStatus;
    }

    public void setLogisticsStatus(Boolean logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
    }

    public BigDecimal getFreightAmt() {
        return freightAmt;
    }

    public void setFreightAmt(BigDecimal freightAmt) {
        this.freightAmt = freightAmt;
    }

    public BigDecimal getOtherAmt() {
        return otherAmt;
    }

    public void setOtherAmt(BigDecimal otherAmt) {
        this.otherAmt = otherAmt;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
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
        return "LogisticsOrder{" +
        "id=" + id +
        ", warehouseCode=" + warehouseCode +
        ", ownerName=" + ownerName +
        ", orderCode=" + orderCode +
        ", receiver=" + receiver +
        ", receiveAddress=" + receiveAddress +
        ", linkTel=" + linkTel +
        ", logisticsComCode=" + logisticsComCode +
        ", logisticsOrderCode=" + logisticsOrderCode +
        ", logisticsStatus=" + logisticsStatus +
        ", freightAmt=" + freightAmt +
        ", otherAmt=" + otherAmt +
        ", payType=" + payType +
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
