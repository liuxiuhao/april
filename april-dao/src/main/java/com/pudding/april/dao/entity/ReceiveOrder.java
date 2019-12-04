package com.pudding.april.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 收货单
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class ReceiveOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 收货单号
     */
    private String orderCode;

    /**
     * 收货单类型 11:采购入库收货 12：销售退货入库收货
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
     * 入库计划单
     */
    private String planCode;

    /**
     * 仓库编码
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
    private String providerCode;

    /**
     * 供应商名称
     */
    private String providerName;

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
