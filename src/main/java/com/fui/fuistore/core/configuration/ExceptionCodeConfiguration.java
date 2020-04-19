package com.fui.fuistore.core.configuration;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@ConfigurationProperties(prefix = "fui") // 设置匹配配置文件前缀
@PropertySource(value = "classpath:config/exception-code.properties") // 和配置文件关联 resouces/config/xxxx.properties
@Component // 把这个类加入到容器
public class ExceptionCodeConfiguration {
    // Integer: 10000 String: "通用错误"
    private Map<Integer, String> codes = new HashMap<>();

    // getter
    public Map<Integer, String> getCodes(){
        return codes;
    }
    // setter
    public void setCodes(Map<Integer, String> codes) {
        this.codes = codes;
    }

    // 获取异常信息文字
    public String getMessage(int code) {
        String message = codes.get(code);
        return message;
    }
}
