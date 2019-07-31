package cc.mrbird.febs.system.service;

import cc.mrbird.febs.common.domain.QueryRequest;
import cc.mrbird.febs.system.domain.SysLog;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.scheduling.annotation.Async;

/**
 * @author victor
 */
public interface LogService extends IService<SysLog> {
    /**
     * 查询系统日志
     * @param request
     * @param sysLog
     * @return
     */
    IPage<SysLog> findLogs(QueryRequest request, SysLog sysLog);

    /**
     * 删除系统日志
     * @param logIds
     */
    void deleteLogs(String[] logIds);

    /**
     * 保存系统日志
     * @param point
     * @param log
     * @throws JsonProcessingException
     * @Async:标准的方法，叫异步方法，方法在执行的时候，
     * 将会在独立的线程中执行，调用方法的不需要等待它的完成，也可以继续其他的操作
     * 在java中，一般在处理类似的场景的时候，都是基于创建独立的线程去完成相应的异步调用逻辑
     * 让主线程继续执行而不会产生停下来等待的情况。
     */
    @Async
    void saveLog(ProceedingJoinPoint point, SysLog log) throws JsonProcessingException;
}
