package com.atguigu.jpa.repository;

import com.atguigu.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 说明：继承JpaRepository父接口完成对数据库的操作
 * @author：李尚兴
 * @date：2021-05-21 23:08
 * @version：1.0
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
