package com.atguigu.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 说明：监听器组件
 * @author：李尚兴
 * @date：2021-03-14 15:41
 * @version：1.0
 */
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("【contextInitialized】应用初始化……");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("【contextDestroyed】应用销毁……");
    }
}
