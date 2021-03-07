package com.atguigu.controller;

import com.atguigu.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 公共异常处理器
 * @author 李尚兴
 * @version 1.0
 * @create 2021/3/7 11:11
 */
@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest request) {
        Map<String, Object> msgMap = new HashMap<>();
        request.setAttribute("javax.servlet.error.status_code", 500); // 传入自己捕获的状态码
        msgMap.put("code", "user.notexist");
        msgMap.put("message", e.getMessage());
        request.setAttribute("ext", msgMap);
        return "forward:/error";
    }

    /**
     * 采用SpringMVC的处理机制（不推荐，因为不能做到自适应访问终端的效果，如果是浏览器访问应该是页面提示；如果是其他终端访问应该是json数据提示）
     * @param e 异常捕获的消息对象
     * @return 都是返回json数据格式
     */
    /*@ResponseBody
    @ExceptionHandler(UserNotExistException.class)
    public Map<String, Object> handleException(Exception e) {
        Map<String, Object> msgMap = new HashMap<>();
        msgMap.put("code", "username.notexist");
        msgMap.put("message", e.getMessage());
        return msgMap;
    }*/
}
