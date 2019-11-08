package com.victor.dan.service;

import com.victor.dan.domain.QueryRequest;
import com.victor.dan.domain.entity.Role;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author victor
 */
public interface RoleService extends IService<Role> {
    /**
     * 根据role查询角色列表
     * @param role
     * @param request
     * @return
     */
    IPage<Role> findRoles(Role role, QueryRequest request);

    /**
     * 根据用户名查询用户角色
     * @param userName
     * @return
     */
    List<Role> findUserRole(String userName);

    /**
     * 根据roleName来查询role信息
     * @param roleName
     * @return
     */
    Role findByName(String roleName);

    /**
     * 创建role
     * @param role
     */
    void createRole(Role role);

    /**
     * 删除role
     * @param roleIds
     * @throws Exception
     */
    void deleteRoles(String[] roleIds) throws Exception;

    /**
     * 更新role
     * @param role
     * @throws Exception
     */
    void updateRole(Role role) throws Exception;
}
