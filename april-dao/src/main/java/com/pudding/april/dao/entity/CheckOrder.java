package com.pudding.april.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 质检单
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class CheckOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 仓库编码
     */
    private String warehouseCode;

    /**
     * 收货单号
     */
    private String receiveOrderCode;

    /**
     * 质检单号
     */
    private String orderCode;

    /**
     * 执行状态
            0:未执行
            1:部分执行
            2:全部执行
            
     */
    private Integer executeStatus;

    /**
     * 货主编码
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
     * 质检人
     */
    private String checkName;

    /**
     * 质检部门
     */
    private String checkDept;

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
