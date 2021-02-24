package com.atguigu.springboot.bean;

import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 说明：将application.yml配置文件中配置的属性值与本类的属性进行映射关联
 * @ConfigurationProperties：告诉本类中的所有属性与配置文件中的属性进行绑定
 * prefix = "person"：说明配置文件中的哪个属性下进行映射，默认从全局配置文件中获取值
 * @Component 只有此类在容器中注入，才能使用容器中提供的@ConfigurationProperties功能
 * @author：李尚兴
 * @date：2021-02-05 16:01
 * @version：1.0
 */
//@PropertySource(value = {"classpath:person.properties"}) // 读取外部配置文件的内容
@Component
@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {
    //@Value("${person.last-name}")
    //@Email
    private String lastName;
    //@Value("#{12 * 2}")
    private Integer age;
    //@Value("true")
    private Boolean boss;
    private Date birth;
    //@Value("${person.maps}") // 不支持获取复杂类型的值
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
