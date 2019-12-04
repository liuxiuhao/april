package com.pudding.april.dao.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 出库作业表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class OutWarehouseJob implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 拣货单号
     */
    private String pickOrderCode;

    /**
     * 仓库编码
     */
    private String warehouseCode;

    /**
     * 源库区编码
     */
    private String sWarehouseAreaCode;

    /**
     * 源库位编码
     */
    private String sWarehouseSpaceCode;

    /**
     * 目标库区编码(移库时用)
     */
    private String tWarehouseAreaCode;

    /**
     * 目标源库位编码(移库时用)
     */
    private String tWarehouseSpaceCode;

    /**
     * 库存id,出库时必填
     */
    @TableField("stock_Id")
    private Integer stockId;

    /**
     * 托盘条码
     */
    private String trayCode;

    /**
     *  作业状态:0-新建 1.未执行 2.待执行 3.正执行 4.完成 5.作废 6.异常作业 8.暂停作业
            一期:全部为 “完成” 状态
     */
    private Integer jobStatus;

    /**
     * 备注
     */
    private String remarkInfo;

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
