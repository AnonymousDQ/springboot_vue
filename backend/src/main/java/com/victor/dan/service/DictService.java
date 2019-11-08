package com.victor.dan.service;

import com.victor.dan.domain.QueryRequest;
import com.victor.dan.domain.entity.Dict;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author victor
 */
public interface DictService extends IService<Dict> {
    /**
     * 查询字典
     * @param request
     * @param dict
     * @return
     */
    IPage<Dict> findDicts(QueryRequest request, Dict dict);

    /**
     * 创建字典
     * @param dict
     */
    void createDict(Dict dict);

    /**
     * 更新字典
     * @param dicdt
     */
    void updateDict(Dict dicdt);

    /**
     * 删除字典
     * @param dictIds
     */
    void deleteDicts(String[] dictIds);

}
