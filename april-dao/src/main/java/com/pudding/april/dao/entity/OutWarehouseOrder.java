package com.pudding.april.dao.entity;

import lombok.Data;

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
@Data
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

}
