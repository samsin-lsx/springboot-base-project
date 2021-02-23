package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:spring-beans.xml"}) // 导入原生Spring的配置文件，让配置文件内容生效，不推荐（因为SpringBoot推荐使用全注解）
@SpringBootApplication
public class SpringbootBaseQuickModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBaseQuickModuleApplication.class, args);
    }

}
