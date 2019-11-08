package com.victor.dan.service;

import com.victor.dan.domain.entity.LoginLog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author victor
 */
public interface LoginLogService extends IService<LoginLog> {
    /**
     * 保存登录日志
     * @param loginLog
     */
    void saveLoginLog (LoginLog loginLog);
}
