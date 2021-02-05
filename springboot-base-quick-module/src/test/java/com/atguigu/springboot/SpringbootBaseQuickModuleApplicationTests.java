package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试
 * @author：李尚兴
 * @date：2021-02-05 16:28
*/
@RunWith(SpringRunner.class) // 使用Spring的测试驱动器
@SpringBootTest
public class SpringbootBaseQuickModuleApplicationTests {
    @Autowired
    private Person person;

    @Test
    public void contextLoads() {
        System.out.println(this.person);
    }

}
