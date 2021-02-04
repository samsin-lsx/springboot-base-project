package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李尚兴
 * @version 1.0
 * @create 2021/2/4 23:40
 */
@RestController
public class QuickController {
    @RequestMapping("/hello")
    public String hello() {
        return "使用SpringInitializr快速搭建SpringBoot应用成功啦。";
    }
}
