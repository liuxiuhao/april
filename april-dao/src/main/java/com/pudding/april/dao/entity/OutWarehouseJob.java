package com.pudding.april.dao.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 出库作业表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
public class OutWarehouseJob implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 拣货单号
     */
    private String pickOrderCode;

    /**
     * 仓库编码
     */
    private String warehouseCode;

    /**
     * 源库区编码
     */
    private String sWarehouseAreaCode;

    /**
     * 源库位编码
     */
    private String sWarehouseSpaceCode;

    /**
     * 目标库区编码(移库时用)
     */
    private String tWarehouseAreaCode;

    /**
     * 目标源库位编码(移库时用)
     */
    private String tWarehouseSpaceCode;

    /**
     * 库存id,出库时必填
     */
    @TableField("stock_Id")
    private Integer stockId;

    /**
     * 托盘条码
     */
    private String trayCode;

    /**
     *  作业状态:0-新建 1.未执行 2.待执行 3.正执行 4.完成 5.作废 6.异常作业 8.暂停作业
            一期:全部为 “完成” 状态
     */
    private Integer jobStatus;

    /**
     * 备注
     */
    private String remarkInfo;

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

    public String getPickOrderCode() {
        return pickOrderCode;
    }

    public void setPickOrderCode(String pickOrderCode) {
        this.pickOrderCode = pickOrderCode;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getsWarehouseAreaCode() {
        return sWarehouseAreaCode;
    }

    public void setsWarehouseAreaCode(String sWarehouseAreaCode) {
        this.sWarehouseAreaCode = sWarehouseAreaCode;
    }

    public String getsWarehouseSpaceCode() {
        return sWarehouseSpaceCode;
    }

    public void setsWarehouseSpaceCode(String sWarehouseSpaceCode) {
        this.sWarehouseSpaceCode = sWarehouseSpaceCode;
    }

    public String gettWarehouseAreaCode() {
        return tWarehouseAreaCode;
    }

    public void settWarehouseAreaCode(String tWarehouseAreaCode) {
        this.tWarehouseAreaCode = tWarehouseAreaCode;
    }

    public String gettWarehouseSpaceCode() {
        return tWarehouseSpaceCode;
    }

    public void settWarehouseSpaceCode(String tWarehouseSpaceCode) {
        this.tWarehouseSpaceCode = tWarehouseSpaceCode;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getTrayCode() {
        return trayCode;
    }

    public void setTrayCode(String trayCode) {
        this.trayCode = trayCode;
    }

    public Integer getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getRemarkInfo() {
        return remarkInfo;
    }

    public void setRemarkInfo(String remarkInfo) {
        this.remarkInfo = remarkInfo;
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
        return "OutWarehouseJob{" +
        "id=" + id +
        ", pickOrderCode=" + pickOrderCode +
        ", warehouseCode=" + warehouseCode +
        ", sWarehouseAreaCode=" + sWarehouseAreaCode +
        ", sWarehouseSpaceCode=" + sWarehouseSpaceCode +
        ", tWarehouseAreaCode=" + tWarehouseAreaCode +
        ", tWarehouseSpaceCode=" + tWarehouseSpaceCode +
        ", stockId=" + stockId +
        ", trayCode=" + trayCode +
        ", jobStatus=" + jobStatus +
        ", remarkInfo=" + remarkInfo +
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
