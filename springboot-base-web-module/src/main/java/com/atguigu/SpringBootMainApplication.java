package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * 说明：SpringBoot应用启动类
 * @author：李尚兴
 * @date：2021-02-03 18:47
 * @version：1.0
 */
@MapperScan(value = "com.atguigu.mapper") // 批量扫描指定包下所有接口，XxxMapper接口上无需使用@Mapper注解
@SpringBootApplication // 标记SpringBoot应用
public class SpringBootMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMainApplication.class, args); // 启动Spring应用
    }

    @Bean
    public ViewResolver getViewResolver() {
        return new MyViewResolver();
    }

    private static class MyViewResolver implements ViewResolver {
        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }
}
