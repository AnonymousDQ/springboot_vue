package com.victor.dan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.victor.dan.domain.entity.Test;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author victor
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {
}