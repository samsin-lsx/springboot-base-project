package com.atguigu.springboot.config;

import com.atguigu.springboot.service.QuickService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 说明：@Configuration：标明SpringBoot配置类，来替代之前Spring配置文件
 * @author：李尚兴
 * @date：2021-02-23 18:05
 * @version：1.0
 */
@Configuration
public class MyAppConfig {
    @Bean // 将方法的返回值添加到容器中，组件实例名id默认为方法名
    public QuickService quickService() {
        return new QuickService();
    }
}
