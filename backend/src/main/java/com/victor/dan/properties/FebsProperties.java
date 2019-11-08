package com.victor.dan.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author victor
 * @description:application.yml配置文件里的信息
 */
@Data
@Configuration
//获取yml配置文件里的，dan开头的配置，shiro
@ConfigurationProperties(prefix = "dan")
public class FebsProperties {

    private ShiroProperties shiro = new ShiroProperties();

    private boolean openAopLog = true;

}
