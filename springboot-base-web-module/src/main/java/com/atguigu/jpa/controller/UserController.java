package com.atguigu.jpa.controller;

import com.atguigu.jpa.entity.User;
import com.atguigu.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 说明：使用JPA操作数据库
 * @author：李尚兴
 * @date：2021-05-21 23:18
 * @version：1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return this.userRepository.findOne(id);
    }

    @GetMapping("/user")
    public User saveUser(User user) {
        return this.userRepository.save(user);
    }
}
