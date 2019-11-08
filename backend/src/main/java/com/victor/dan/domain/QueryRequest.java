package com.victor.dan.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author victor
 * @description:请求参数封装
 */
@Data
public class QueryRequest implements Serializable {

    private static final long serialVersionUID = -4869594085374385813L;

    private int pageSize = 10;
    private int pageNum = 1;

    private String sortField;
    private String sortOrder;
}
