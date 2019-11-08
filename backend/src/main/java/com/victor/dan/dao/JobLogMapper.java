package com.victor.dan.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.victor.dan.domain.JobLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author victor
 * @description:Job日志接口
 */
@Mapper
public interface JobLogMapper extends BaseMapper<JobLog> {
}