package com.atguigu.config;

import com.atguigu.filter.MyFilter;
import com.atguigu.listener.MyListener;
import com.atguigu.servlet.MyServlet;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * 配置组件类
 * @author 李尚兴
 * @version 1.0
 * @create 2021/3/7 14:26
 */
@Configuration
public class MyServerConfig {
    /**
     * 配置Servlet组件
     * @return
     */
    @Bean
    public ServletRegistrationBean myServlet() {
        return new ServletRegistrationBean(new MyServlet(), "/myServlet");
    }

    /**
     * 配置Filter组件
     * @return
     */
    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/hello", "/myServlet"));
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean myListener() {
        return new ServletListenerRegistrationBean<MyListener>(new MyListener());
    }

    /**
     * 编码方式修改tomcat相关的配置项
     * @return
     */
    @Bean
    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer() {
        return new EmbeddedServletContainerCustomizer() {
            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                container.setPort(8083); // 可以设置tomcat相关的配置
            }
        };
    }
}
