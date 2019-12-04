package com.pudding.april.dao.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

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
@Data
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
    /**
     * 托盘条码
     */
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

}
