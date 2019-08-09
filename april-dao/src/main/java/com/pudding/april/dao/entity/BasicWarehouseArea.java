package com.pudding.april.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 库区表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
public class BasicWarehouseArea implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 库区编码
     */
    private String warehouseAreaCode;

    /**
     * 库区名称
     */
    private String warehouseAreaName;

    /**
     * 仓库编码
     */
    private String warehouseCode;

    /**
     * 0:否
            1:是
            
     */
    private Integer isVirtual;

    /**
     * 库区性质:
            1:存储区
            2:残次品区
            3:退货区
            
     */
    private Integer warehouseAreaNature;

    /**
     * 入库锁:0 正常 1:锁定
     */
    private Integer inLock;

    /**
     * 0：正常
            1：出库锁定
     */
    private Integer outLock;

    /**
     * 库区描述
     */
    private String warehouseAreaDesc;

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

    public String getWarehouseAreaCode() {
        return warehouseAreaCode;
    }

    public void setWarehouseAreaCode(String warehouseAreaCode) {
        this.warehouseAreaCode = warehouseAreaCode;
    }

    public String getWarehouseAreaName() {
        return warehouseAreaName;
    }

    public void setWarehouseAreaName(String warehouseAreaName) {
        this.warehouseAreaName = warehouseAreaName;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public Integer getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Integer isVirtual) {
        this.isVirtual = isVirtual;
    }

    public Integer getWarehouseAreaNature() {
        return warehouseAreaNature;
    }

    public void setWarehouseAreaNature(Integer warehouseAreaNature) {
        this.warehouseAreaNature = warehouseAreaNature;
    }

    public Integer getInLock() {
        return inLock;
    }

    public void setInLock(Integer inLock) {
        this.inLock = inLock;
    }

    public Integer getOutLock() {
        return outLock;
    }

    public void setOutLock(Integer outLock) {
        this.outLock = outLock;
    }

    public String getWarehouseAreaDesc() {
        return warehouseAreaDesc;
    }

    public void setWarehouseAreaDesc(String warehouseAreaDesc) {
        this.warehouseAreaDesc = warehouseAreaDesc;
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
        return "BasicWarehouseArea{" +
        "id=" + id +
        ", warehouseAreaCode=" + warehouseAreaCode +
        ", warehouseAreaName=" + warehouseAreaName +
        ", warehouseCode=" + warehouseCode +
        ", isVirtual=" + isVirtual +
        ", warehouseAreaNature=" + warehouseAreaNature +
        ", inLock=" + inLock +
        ", outLock=" + outLock +
        ", warehouseAreaDesc=" + warehouseAreaDesc +
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
