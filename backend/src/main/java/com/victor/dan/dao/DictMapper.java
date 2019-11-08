package com.victor.dan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.victor.dan.domain.entity.Dict;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author victor
 */
@Mapper
public interface DictMapper extends BaseMapper<Dict> {
}