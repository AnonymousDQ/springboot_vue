package cc.mrbird.febs.job.service;

import cc.mrbird.febs.common.domain.QueryRequest;
import cc.mrbird.febs.job.domain.JobLog;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author victor
 * @description:job日志
 */
public interface JobLogService extends IService<JobLog> {

    IPage<JobLog> findJobLogs(QueryRequest request, JobLog jobLog);

    void saveJobLog(JobLog log);

    void deleteJobLogs(String[] jobLogIds);
}
