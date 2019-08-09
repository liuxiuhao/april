package com.pudding.april.dao.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 库位表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
public class BasicWarehouseSpace implements Serializable {

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
     * 库位排
     */
    private Integer warehouseSpacePlatoon;

    /**
     * 库位列
     */
    private Integer warehouseSpaceColumn;

    /**
     * 库位层
     */
    private Integer warehouseSpaceFloor;

    /**
     * 长度
     */
    private BigDecimal length;

    /**
     * 宽度
     */
    private BigDecimal width;

    /**
     * 高度
     */
    private BigDecimal height;

    /**
     * 库位状态
            0：空库位
            1：有货
            99：禁用
     */
    private Integer warehouseSpaceStatus;

    /**
     * 承载体积
     */
    private BigDecimal loadVolume;

    /**
     * 承载重量
     */
    private BigDecimal loadBorn;

    /**
     * 拣货路径
     */
    private Integer pickRoute;

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
     * 上架类型
            1:只能分配一次
            2:可分配多次
     */
    private Integer putType;

    /**
     * 拣货类型
            1:只能分配一次
            2:可分配多次
     */
    private Integer pickType;

    /**
     * 是否混发批次数 0：否 1：是
     */
    private Integer isLot;

    /**
     * 混发批次数 默认1
     */
    private Integer lotNum;

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

    public Integer getWarehouseSpacePlatoon() {
        return warehouseSpacePlatoon;
    }

    public void setWarehouseSpacePlatoon(Integer warehouseSpacePlatoon) {
        this.warehouseSpacePlatoon = warehouseSpacePlatoon;
    }

    public Integer getWarehouseSpaceColumn() {
        return warehouseSpaceColumn;
    }

    public void setWarehouseSpaceColumn(Integer warehouseSpaceColumn) {
        this.warehouseSpaceColumn = warehouseSpaceColumn;
    }

    public Integer getWarehouseSpaceFloor() {
        return warehouseSpaceFloor;
    }

    public void setWarehouseSpaceFloor(Integer warehouseSpaceFloor) {
        this.warehouseSpaceFloor = warehouseSpaceFloor;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public Integer getWarehouseSpaceStatus() {
        return warehouseSpaceStatus;
    }

    public void setWarehouseSpaceStatus(Integer warehouseSpaceStatus) {
        this.warehouseSpaceStatus = warehouseSpaceStatus;
    }

    public BigDecimal getLoadVolume() {
        return loadVolume;
    }

    public void setLoadVolume(BigDecimal loadVolume) {
        this.loadVolume = loadVolume;
    }

    public BigDecimal getLoadBorn() {
        return loadBorn;
    }

    public void setLoadBorn(BigDecimal loadBorn) {
        this.loadBorn = loadBorn;
    }

    public Integer getPickRoute() {
        return pickRoute;
    }

    public void setPickRoute(Integer pickRoute) {
        this.pickRoute = pickRoute;
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

    public Integer getPutType() {
        return putType;
    }

    public void setPutType(Integer putType) {
        this.putType = putType;
    }

    public Integer getPickType() {
        return pickType;
    }

    public void setPickType(Integer pickType) {
        this.pickType = pickType;
    }

    public Integer getIsLot() {
        return isLot;
    }

    public void setIsLot(Integer isLot) {
        this.isLot = isLot;
    }

    public Integer getLotNum() {
        return lotNum;
    }

    public void setLotNum(Integer lotNum) {
        this.lotNum = lotNum;
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
        return "BasicWarehouseSpace{" +
        "id=" + id +
        ", warehouseCode=" + warehouseCode +
        ", warehouseAreaCode=" + warehouseAreaCode +
        ", warehouseSpaceCode=" + warehouseSpaceCode +
        ", warehouseSpacePlatoon=" + warehouseSpacePlatoon +
        ", warehouseSpaceColumn=" + warehouseSpaceColumn +
        ", warehouseSpaceFloor=" + warehouseSpaceFloor +
        ", length=" + length +
        ", width=" + width +
        ", height=" + height +
        ", warehouseSpaceStatus=" + warehouseSpaceStatus +
        ", loadVolume=" + loadVolume +
        ", loadBorn=" + loadBorn +
        ", pickRoute=" + pickRoute +
        ", inLock=" + inLock +
        ", outLock=" + outLock +
        ", putType=" + putType +
        ", pickType=" + pickType +
        ", isLot=" + isLot +
        ", lotNum=" + lotNum +
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
