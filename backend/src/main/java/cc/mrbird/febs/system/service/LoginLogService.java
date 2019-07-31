package cc.mrbird.febs.system.service;

import cc.mrbird.febs.system.domain.LoginLog;
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
