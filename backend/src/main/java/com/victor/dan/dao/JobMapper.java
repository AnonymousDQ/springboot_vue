package com.victor.dan.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.victor.dan.domain.Job;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author victor
 * @description:job接口
 */
@Mapper
public interface JobMapper extends BaseMapper<Job> {
	/**
	 * 获取任务列表
	 * @return
	 */
	List<Job> queryList();
}