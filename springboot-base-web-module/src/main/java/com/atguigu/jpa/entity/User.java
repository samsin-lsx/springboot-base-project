package com.atguigu.jpa.entity;

import javax.persistence.*;

/**
 * 说明：使用JPA注解配置映射关系
 * @author：李尚兴
 * @date：2021-05-21 22:57
 * @version：1.0
 */
@Entity // 声明为实体类
@Table(name = "tbl_user") // 声明为数据表，不写表名则默认表名为user
public class User {
    @Id // 指定主键
    @GeneratedValue(strategy = GenerationType.AUTO) // 主键自增
    private Integer id;
    @Column(name = "last_name", length = 50) // 与数据表映射列名，不写则默认列名为属性名
    private String lastName;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
