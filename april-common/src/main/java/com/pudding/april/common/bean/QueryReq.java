package com.pudding.april.common.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 分页查询基类
 * @Author: liuxh
 * @Date: 2019/8/6 16:59
 * @Description:
 */
@Data
public class QueryReq implements Serializable {
    private static final long serialVersionUID = -4869594085374385813L;
    /**
     * 每页记录数
     */
    private int pageSize;
    /**
     * 页码
     */
    private int pageNum;
}
