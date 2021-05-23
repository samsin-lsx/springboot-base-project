package com.atguigu.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 说明：【整合Druid】数据源连接池配置类
 * @author：李尚兴
 * @date：2021-05-19 23:39
 * @version：1.0
 */
@Configuration
public class DruidConfig {
    /**
     * 注册Druid数据源连接池配置
     * @return Druid数据源
     */
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource registDruid() {
        return new DruidDataSource();
    }

    /**
     * 配置Druid监控中管理后台的Servlet
     * @return
     */
    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String, String> initParamsMap = new HashMap<>();
        initParamsMap.put("loginUsername", "admin");
        initParamsMap.put("loginPassword", "lsx123456");
        initParamsMap.put("allow", ""); // 默认允许所有帐号访问
        initParamsMap.put("deny", "192.168.253.129"); // 禁止ip访问
        servletRegistrationBean.setInitParameters(initParamsMap);
        return servletRegistrationBean;
    }

    /**
     * 配置Druid监控中Web监控的Filter
     * @return
     */
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        Map<String, String> initParamsMap = new HashMap<>();
        initParamsMap.put("exclusions", "*.js,*.css,/druid/*");
        filterRegistrationBean.setInitParameters(initParamsMap);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        return filterRegistrationBean;
    }
}
