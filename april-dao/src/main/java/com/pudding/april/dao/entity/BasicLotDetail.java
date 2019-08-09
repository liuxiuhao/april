package com.pudding.april.dao.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 批次明细表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
public class BasicLotDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 批次id
     */
    private Integer lotId;

    /**
     * 属性编码 lotAttr01-lotAttr12 12个属性值
     */
    private String lotAttrCode;

    /**
     * 属性名字
     */
    private String lotAttrName;

    /**
     * 输入控制 0:必输 1:只读 2:可选 3:禁用 如果只读则设置 lot_attr_value 值
     */
    private Integer inputType;

    /**
     * 属性类型 1:文本 2:下拉 3:日期 4:日期时间 5:数字
     */
    private Integer lotAttrType;

    /**
     * 属性选项 如果属性格式为下拉则用于配置枚举类型，如：正品/残次品，是否;如果输入控制为必输则设置对应的默认值
     */
    private String lotAttrValue;

    /**
     * 是否为批次号属性:0:否 1:是
            根据批次属性组合生成 唯一批次号
     */
    private Integer isBatch;

    /**
     * 备注
     */
    private String remark;

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

    public Integer getLotId() {
        return lotId;
    }

    public void setLotId(Integer lotId) {
        this.lotId = lotId;
    }

    public String getLotAttrCode() {
        return lotAttrCode;
    }

    public void setLotAttrCode(String lotAttrCode) {
        this.lotAttrCode = lotAttrCode;
    }

    public String getLotAttrName() {
        return lotAttrName;
    }

    public void setLotAttrName(String lotAttrName) {
        this.lotAttrName = lotAttrName;
    }

    public Integer getInputType() {
        return inputType;
    }

    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    public Integer getLotAttrType() {
        return lotAttrType;
    }

    public void setLotAttrType(Integer lotAttrType) {
        this.lotAttrType = lotAttrType;
    }

    public String getLotAttrValue() {
        return lotAttrValue;
    }

    public void setLotAttrValue(String lotAttrValue) {
        this.lotAttrValue = lotAttrValue;
    }

    public Integer getIsBatch() {
        return isBatch;
    }

    public void setIsBatch(Integer isBatch) {
        this.isBatch = isBatch;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return "BasicLotDetail{" +
        "id=" + id +
        ", lotId=" + lotId +
        ", lotAttrCode=" + lotAttrCode +
        ", lotAttrName=" + lotAttrName +
        ", inputType=" + inputType +
        ", lotAttrType=" + lotAttrType +
        ", lotAttrValue=" + lotAttrValue +
        ", isBatch=" + isBatch +
        ", remark=" + remark +
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
