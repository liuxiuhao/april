package com.pudding.april.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 盘点单
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class InventoryOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 仓库编码
     */
    private String warehouseCode;

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
     * 创建人名称
     */
    private String createrName;

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
     * 创建人
     */
    private Integer inventoryName;



}
