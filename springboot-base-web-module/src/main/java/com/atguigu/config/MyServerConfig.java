package com.atguigu.config;

/**
 * 自定义嵌入式的Servlet容器
 * @author 李尚兴
 * @version 1.0
 * @create 2021/3/7 14:26
 */
public class MyServerConfig {
    /**
     * 编码方式修改tomcat相关的配置项
     * @return
     */
    /*@Bean
    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer() {
        return new EmbeddedServletContainerCustomizer() {
            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                container.setPort(8080); // 可以设置tomcat相关的配置
            }
        };
    }*/
}
