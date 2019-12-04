package com.pudding.april.dao.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 配送信息表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class LogisticsOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 仓库编码
     */
    private String warehouseCode;

    /**
     * 货主
     */
    private String ownerName;

    /**
     * 入库单号
     */
    private String orderCode;

    /**
     * 收货人
     */
    private String receiver;

    /**
     * 收货地址
     */
    private String receiveAddress;

    /**
     * 收货人联系电话
     */
    private String linkTel;

    /**
     * 物流公司编码
     */
    private String logisticsComCode;

    /**
     * 物流单号
     */
    private String logisticsOrderCode;

    /**
     * 物流状态（配送状态）：0-已出库；1-配送中；2-已完成
     */
    private Boolean logisticsStatus;

    /**
     * 运费
     */
    private BigDecimal freightAmt;

    /**
     * 其他费用
     */
    private BigDecimal otherAmt;

    /**
     * 付费方式：0:我方付
            1:客户付
     */
    private Integer payType;

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
