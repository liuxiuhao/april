package com.pudding.april.dao.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 出库单
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
public class OutWarehouseOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

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
     * 计划单号
     */
    private String orderCode;

    /**
     * 单据状态:0新建 1:已审核 2:出库分配 3:出库执行 4:发货确认 9:作废
     */
    private Integer orderStatus;

    /**
     * 计划单号
     */
    private String outPlanCode;

    /**
     * 单据类型
     */
    private Integer orderType;

    /**
     * 计划仓库编码
     */
    private String warehouseCode;

    /**
     * 货主
     */
    private String ownerCode;

    /**
     * 货主名称
     */
    private String ownerName;

    /**
     * 供应商编码
     */
    private String customerCode;

    /**
     * 供应商名称
     */
    private String customerName;

    /**
     * 修改时间
     */
    private LocalDateTime orderTime;

    /**
     * 修改时间
     */
    private LocalDateTime planStartTime;

    /**
     * 修改时间
     */
    private LocalDateTime planEndTime;

    /**
     * 联系人
     */
    private String arrivalLinkName;

    /**
     * 联系电话
     */
    private String arrivalLinkTel;

    /**
     * 联系地址
     */
    private String arrivalAddress;

    /**
     * 来源系统
            tiger
     */
    private String fromSysCode;

    /**
     * 订单取消审核的审核说明，如：为何不同意取消
     */
    private String reason;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOutPlanCode() {
        return outPlanCode;
    }

    public void setOutPlanCode(String outPlanCode) {
        this.outPlanCode = outPlanCode;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public LocalDateTime getPlanStartTime() {
        return planStartTime;
    }

    public void setPlanStartTime(LocalDateTime planStartTime) {
        this.planStartTime = planStartTime;
    }

    public LocalDateTime getPlanEndTime() {
        return planEndTime;
    }

    public void setPlanEndTime(LocalDateTime planEndTime) {
        this.planEndTime = planEndTime;
    }

    public String getArrivalLinkName() {
        return arrivalLinkName;
    }

    public void setArrivalLinkName(String arrivalLinkName) {
        this.arrivalLinkName = arrivalLinkName;
    }

    public String getArrivalLinkTel() {
        return arrivalLinkTel;
    }

    public void setArrivalLinkTel(String arrivalLinkTel) {
        this.arrivalLinkTel = arrivalLinkTel;
    }

    public String getArrivalAddress() {
        return arrivalAddress;
    }

    public void setArrivalAddress(String arrivalAddress) {
        this.arrivalAddress = arrivalAddress;
    }

    public String getFromSysCode() {
        return fromSysCode;
    }

    public void setFromSysCode(String fromSysCode) {
        this.fromSysCode = fromSysCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "OutWarehouseOrder{" +
        "id=" + id +
        ", gmtCreate=" + gmtCreate +
        ", gmtModify=" + gmtModify +
        ", dataVersion=" + dataVersion +
        ", createrId=" + createrId +
        ", createrName=" + createrName +
        ", modifierId=" + modifierId +
        ", modifierName=" + modifierName +
        ", isDelete=" + isDelete +
        ", orderCode=" + orderCode +
        ", orderStatus=" + orderStatus +
        ", outPlanCode=" + outPlanCode +
        ", orderType=" + orderType +
        ", warehouseCode=" + warehouseCode +
        ", ownerCode=" + ownerCode +
        ", ownerName=" + ownerName +
        ", customerCode=" + customerCode +
        ", customerName=" + customerName +
        ", orderTime=" + orderTime +
        ", planStartTime=" + planStartTime +
        ", planEndTime=" + planEndTime +
        ", arrivalLinkName=" + arrivalLinkName +
        ", arrivalLinkTel=" + arrivalLinkTel +
        ", arrivalAddress=" + arrivalAddress +
        ", fromSysCode=" + fromSysCode +
        ", reason=" + reason +
        "}";
    }
}
