package com.pudding.april.dao.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 出库计划明细表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class OutWarehousePlanDetail implements Serializable {

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

    private Integer planId;

    private String planCode;

    private Integer planLineNo;

    /**
     * 商品编码
     */
    private String skuCode;

    /**
     * 商品名称
     */
    private String skuName;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 计划入库数量
     */
    private BigDecimal planOutQty;

    private String remarkInfo;

}
