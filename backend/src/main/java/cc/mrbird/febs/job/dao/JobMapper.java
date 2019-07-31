package cc.mrbird.febs.job.dao;


import cc.mrbird.febs.job.domain.Job;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author victor
 * @description:job接口
 */
public interface JobMapper extends BaseMapper<Job> {
	/**
	 * 获取任务列表
	 * @return
	 */
	List<Job> queryList();
}