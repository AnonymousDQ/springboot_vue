package com.victor.dan.service;

import com.victor.dan.domain.QueryRequest;
import com.victor.dan.domain.Job;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author victor
 * @description:job接口
 */
public interface JobService extends IService<Job> {
    /**
     * 根据jobId获取job基本信息
     * @param jobId
     * @return
     */
    Job findJob(Long jobId);

    /**
     * 获取所有job
     * @param request
     * @param job
     * @return
     */
    IPage<Job> findJobs(QueryRequest request, Job job);

    /**
     * 创建job
     * @param job
     */
    void createJob(Job job);

    /**
     * 更新job
     * @param job
     */
    void updateJob(Job job);

    /**
     * 根据jobIds删除job
     * @param jobIds
     */
    void deleteJobs(String[] jobIds);

    /**
     * 批量更新job状态
     * @param jobIds
     * @param status
     * @return
     */
    int updateBatch(String jobIds, String status);

    /**
     * 开始跑job
     * @param jobIds
     */
    void run(String jobIds);

    /**
     * 停止job
     * @param jobIds
     */
    void pause(String jobIds);

    /**
     * 重新开始job
     * @param jobIds
     */
    void resume(String jobIds);

}
