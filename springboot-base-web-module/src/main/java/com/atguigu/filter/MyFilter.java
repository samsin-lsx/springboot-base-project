package com.atguigu.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 说明：
 * @author：李尚兴
 * @date：2021-03-14 15:30
 * @version：1.0
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter过滤器中的doFilter方法执行……");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
