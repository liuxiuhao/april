package com.pudding.april.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 库区表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class BasicWarehouseArea implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 库区编码
     */
    private String warehouseAreaCode;

    /**
     * 库区名称
     */
    private String warehouseAreaName;

    /**
     * 仓库编码
     */
    private String warehouseCode;

    /**
     * 0:否
            1:是
            
     */
    private Integer isVirtual;

    /**
     * 库区性质:
            1:存储区
            2:残次品区
            3:退货区
            
     */
    private Integer warehouseAreaNature;

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
     * 库区描述
     */
    private String warehouseAreaDesc;

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
