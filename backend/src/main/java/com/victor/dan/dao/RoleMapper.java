package com.victor.dan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.victor.dan.domain.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author victor
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {
	/**
	 * 根据用户名查询角色列表
	 * @param userName
	 * @return
	 */
	List<Role> findUserRole(String userName);
	
}