package com.victor.dan.service;


import com.victor.dan.domain.entity.UserRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author victor
 */
public interface UserRoleService extends IService<UserRole> {
	/**
	 * 根据roleId删除用户角色
	 * @param roleIds
	 */
	void deleteUserRolesByRoleId(String[] roleIds);

	/**
	 * 根据userId来删除用户角色
	 * @param userIds
	 */
	void deleteUserRolesByUserId(String[] userIds);

	/**
	 * 根据roleId来查询userId列表
	 * @param roleIds
	 * @return
	 */
	List<String> findUserIdsByRoleId(String[] roleIds);
}
