package cc.mrbird.febs;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author victor
 */
@SpringBootApplication
@EnableTransactionManagement//开启事务管理
@EnableScheduling//开启spring自带的定时任务
@EnableAsync//开启多线程支持ThreadPoolTaskExecutor多线程池
public class FebsApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FebsApplication.class)
                .run(args);
    }
}
