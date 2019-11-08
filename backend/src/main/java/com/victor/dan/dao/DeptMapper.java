package com.victor.dan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.victor.dan.domain.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author victor
 */
@Mapper
public interface DeptMapper extends BaseMapper<Dept> {

	/**
	 * 递归删除部门
	 *
	 * @param deptId deptId
	 */
	void deleteDepts(@Param("id")String deptId);
}