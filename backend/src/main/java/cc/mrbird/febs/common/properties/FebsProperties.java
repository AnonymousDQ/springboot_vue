package cc.mrbird.febs.common.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author victor
 * @description:application.yml配置文件里的信息
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "febs")
public class FebsProperties {

    private ShiroProperties shiro = new ShiroProperties();

    private boolean openAopLog = true;

}
