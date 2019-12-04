package com.pudding.april.dao.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

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
@Data
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

}
