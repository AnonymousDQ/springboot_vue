package com.victor.dan.service;

import com.victor.dan.domain.entity.RoleMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author victor
 */
public interface RoleMenuServie extends IService<RoleMenu> {
    /**
     * 根据roleIds来删除菜单
     * @param roleIds
     */
    void deleteRoleMenusByRoleId(String[] roleIds);

    /**
     * 根据menuIds来删除角色
     * @param menuIds
     */
    void deleteRoleMenusByMenuId(String[] menuIds);

    /**
     * 根据roleId来获取角色菜单
     * @param roleId
     * @return
     */
    List<RoleMenu> getRoleMenusByRoleId(String roleId);
}
