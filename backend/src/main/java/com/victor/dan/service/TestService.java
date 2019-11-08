package com.victor.dan.service;

import com.victor.dan.domain.entity.Test;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author victor
 */
public interface TestService extends IService<Test> {
    /**
     * 查询test列表
     * @return
     */
    List<Test> findTests();

    /**
     * 批量插入
     * @param list List<Test>
     */
    void batchInsert(List<Test> list);
}
