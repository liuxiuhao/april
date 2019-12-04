package com.pudding.april.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 入库单
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class InWarehouseOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 入库单号
     */
    private String orderCode;

    /**
     * 业务类型/单据类型 11:采购入库 12：销售退货入库
     */
    private Integer orderType;

    /**
     * 0:草稿
            1:待审
            2:审核通过
            3:驳回
            一期只有 审核通过
            
     */
    private Integer orderStatus;

    /**
     * 仓库编码
     */
    private String warehouseCode;

    private String planCode;

    /**
     * 货主
     */
    private String ownerCode;

    /**
     * 货主名称
     */
    private String ownerName;

    /**
     * 货主
     */
    private String providerCode;

    /**
     * 货主
     */
    private String providerName;

    /**
     * 是否已推送给交付系统
            0:未推送
            1:已推送
     */
    private Integer isPush;

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
