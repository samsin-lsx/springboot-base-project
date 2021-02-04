package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 说明：SpringBoot应用启动类
 * @author：李尚兴
 * @date：2021-02-03 18:47
 * @version：1.0
 */
@SpringBootApplication // 标记SpringBoot应用
public class SpringBootMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMainApplication.class, args); // 启动Spring应用
    }
}
