package com.pudding.april.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class InWarehousePlan implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
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
    private String planCode;

    /**
     * 单据类型
     */
    private Integer planType;

    /**
     * 计划仓库编码
     */
    private String planWarehouseCode;

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
    private String providerCode;

    /**
     * 供应商名称
     */
    private String providerName;

    /**
     * 预计到货时间(from)
     */
    private LocalDateTime arriveStartTime;

    /**
     * 预计到货时间(to)
     */
    private LocalDateTime arriveStartTime2;

    /**
     * 单据状态:0新建 1:已审核 2:已驳回
     */
    private Integer orderStatus;

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
