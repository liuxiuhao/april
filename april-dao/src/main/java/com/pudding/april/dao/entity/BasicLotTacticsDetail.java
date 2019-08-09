package com.pudding.april.dao.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 批次策略明细表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
public class BasicLotTacticsDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 批次策略id
     */
    private Integer lotTacticsId;

    /**
     * 属性编码 lotAttr01-lotAttr12 12个属性值
     */
    private String lotAttrCode;

    /**
     * 执行序列号
     */
    private Integer execSeq;

    /**
     * 升序降序
     */
    private String descAsc;

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

    public Integer getLotTacticsId() {
        return lotTacticsId;
    }

    public void setLotTacticsId(Integer lotTacticsId) {
        this.lotTacticsId = lotTacticsId;
    }

    public String getLotAttrCode() {
        return lotAttrCode;
    }

    public void setLotAttrCode(String lotAttrCode) {
        this.lotAttrCode = lotAttrCode;
    }

    public Integer getExecSeq() {
        return execSeq;
    }

    public void setExecSeq(Integer execSeq) {
        this.execSeq = execSeq;
    }

    public String getDescAsc() {
        return descAsc;
    }

    public void setDescAsc(String descAsc) {
        this.descAsc = descAsc;
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
        return "BasicLotTacticsDetail{" +
        "id=" + id +
        ", lotTacticsId=" + lotTacticsId +
        ", lotAttrCode=" + lotAttrCode +
        ", execSeq=" + execSeq +
        ", descAsc=" + descAsc +
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
