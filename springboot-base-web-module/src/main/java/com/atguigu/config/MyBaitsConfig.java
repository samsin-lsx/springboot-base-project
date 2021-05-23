package com.atguigu.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 说明：扩展MyBatis配置类
 * @author：李尚兴
 * @date：2021-05-20 1:05
 * @version：1.0
 */
@Configuration
public class MyBaitsConfig {
    /**
     * 自定义MyBatis配置
     * @return
     */
    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true); // 开启字段名下划线转大写
            }
        };
    }
}
