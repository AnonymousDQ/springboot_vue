package com.victor.dan.service;


import com.victor.dan.domain.QueryRequest;
import com.victor.dan.domain.entity.Dept;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * @author victor
 */
public interface DeptService extends IService<Dept> {
    /**
     * 查询部门列表封装为map
     * @param request
     * @param dept
     * @return
     */
    Map<String, Object> findDepts(QueryRequest request, Dept dept);

    /**
     * 查询部门列表
     * @param dept
     * @param request
     * @return
     */
    List<Dept> findDepts(Dept dept, QueryRequest request);

    /**
     * 创建部门
     * @param dept
     */
    void createDept(Dept dept);

    /**
     * 更新部门
     * @param dept
     */
    void updateDept(Dept dept);

    /**
     * 删除部门
     * @param deptIds
     */
    void deleteDepts(String[] deptIds);
}
