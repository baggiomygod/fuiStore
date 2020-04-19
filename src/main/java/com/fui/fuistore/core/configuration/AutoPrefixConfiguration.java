package com.fui.fuistore.core.configuration;

import com.fui.fuistore.core.hack.AutoPrefixUrlMapping;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

// 通过实现接口方式调用 12周：2-9

// 配置类 AutoPrefixConfiguration 实现WebMvcRegistrations接口
@Component // 注入到容器
public class AutoPrefixConfiguration implements WebMvcRegistrations { // WebMvcRegistrations作用是什么？

    @Override
    public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
        return new AutoPrefixUrlMapping();
    }
}
