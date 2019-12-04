package com.pudding.april.dao.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 包装表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class BasicPackage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 包装代码
     */
    private String packageCode;

    /**
     * 包装描述
     */
    private String packageDesc;

    /**
     * 单品
     */
    private BigDecimal single;

    /**
     * 箱
     */
    private BigDecimal box;

    /**
     * 托盘
     */
    private BigDecimal palet;

    /**
     * 单品重量 重量 kg
     */
    private BigDecimal weight;

    /**
     * 单品长度
     */
    private BigDecimal length;

    /**
     * 单品宽度
     */
    private BigDecimal width;

    /**
     * 单品高度
     */
    private BigDecimal height;

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


    public Integer getId() {
        return id;
    }
}
