package com.victor.dan.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.victor.dan.domain.entity.UserConfig;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author victor
 */
@Mapper
public interface UserConfigMapper extends BaseMapper<UserConfig> {
}