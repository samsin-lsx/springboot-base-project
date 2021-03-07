package com.atguigu.controller;

import com.atguigu.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * 说明：控制器类
 * @author：李尚兴
 * @date：2021-02-03 18:48
 * @version：1.0
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("username") String username) {
        if ("aaa".equals(username)) {
            throw new UserNotExistException();
        }
        return "Hello World SpringBoot！世界变得明亮起来了。";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "你好啊，世界。");
        map.put("world", "<h2>世界，你好！</h2>");
        map.put("users", Arrays.asList("zhangsan", "lisi", "wangwu"));
        return "success"; // thymeleaf默认路径：classpath:/templates/
    }
}
