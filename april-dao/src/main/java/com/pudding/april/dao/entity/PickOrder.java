package com.pudding.april.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 拣货单
 * </p>
 *
 * @author liuxh
 * @since 2019-08-05
 */
@Data
public class PickOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 拣货单号
     */
    private String orderCode;

    /**
     * 拣货方式:0:按单拣货
            1:集中拣货
     */
    private Integer pickType;

    /**
     * 单据状态：0未执行;1执行中;2执行完成3终止
     */
    private Integer orderStatus;

    /**
     * 仓库编码
     */
    private String warehouseCode;

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
