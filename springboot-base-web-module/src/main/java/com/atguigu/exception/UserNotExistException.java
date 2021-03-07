package com.atguigu.exception;

/**
 * 用户不存在异常信息处理类
 * @author 李尚兴
 * @version 1.0
 * @create 2021/3/7 11:03
 */
public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("用户名不存在！");
    }
}
