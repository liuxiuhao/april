package com.pudding.april.dao.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 批次明细表
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class BasicLotDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 批次id
     */
    private Integer lotId;

    /**
     * 属性编码 lotAttr01-lotAttr12 12个属性值
     */
    private String lotAttrCode;

    /**
     * 属性名字
     */
    private String lotAttrName;

    /**
     * 输入控制 0:必输 1:只读 2:可选 3:禁用 如果只读则设置 lot_attr_value 值
     */
    private Integer inputType;

    /**
     * 属性类型 1:文本 2:下拉 3:日期 4:日期时间 5:数字
     */
    private Integer lotAttrType;

    /**
     * 属性选项 如果属性格式为下拉则用于配置枚举类型，如：正品/残次品，是否;如果输入控制为必输则设置对应的默认值
     */
    private String lotAttrValue;

    /**
     * 是否为批次号属性:0:否 1:是
            根据批次属性组合生成 唯一批次号
     */
    private Integer isBatch;

    /**
     * 备注
     */
    private String remark;

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
