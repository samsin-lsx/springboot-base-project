package com.atguigu.component;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

/**
 * 自定义扩展ErrorAttributes类添加到容器中
 * @author 李尚兴
 * @version 1.0
 * @create 2021/3/7 11:37
 */
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {
    /**
     * 获取页面和json的所有字段信息
     * @param requestAttributes
     * @param includeStackTrace
     * @return 页面和json的所有字段信息封装到map中
     */
    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
        Map<String, Object> errorAttributesMap = super.getErrorAttributes(requestAttributes, includeStackTrace);
        errorAttributesMap.put("company", "atguigu");
        Map<String, Object> msgMap = (Map<String, Object>) requestAttributes.getAttribute("ext", 0); // 获取异常处理器中携带的数据
        errorAttributesMap.put("ext", msgMap);
        return errorAttributesMap;
    }
}
