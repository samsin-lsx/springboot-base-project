package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试
 * @author：李尚兴
 * @date：2021-02-05 16:28
*/
@RunWith(SpringRunner.class) // 使用Spring的测试驱动器
@SpringBootTest
public class SpringbootBaseQuickModuleApplicationTests {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext ioc;

    @Test
    public void testQuickService() {
        boolean flag = ioc.containsBean("quickService");
        System.out.println(flag);
    }

    @Test
    public void contextLoads() {
        //System.out.println(this.person);
        logger.trace("这是trace日志级别……");
        logger.debug("这是debug日志级别……");
        logger.info("这是info日志级别……");
        logger.warn("这是warn日志级别……");
        logger.error("这是error日志级别……");
    }

}
