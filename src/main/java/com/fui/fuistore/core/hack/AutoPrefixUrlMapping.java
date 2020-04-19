package com.fui.fuistore.core.hack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;


public class AutoPrefixUrlMapping extends RequestMappingHandlerMapping {
    @Value("${fuistore.api-package}") // 读取配置
    private String apiPackagePath;
    @Override
    protected RequestMappingInfo getMappingForMethod(Method method, Class<?> handlerType) {
        RequestMappingInfo mappingInfo = super.getMappingForMethod(method, handlerType);
        String packageName = this.getPrefix(handlerType);
        if (mappingInfo != null) {
            String prefix = this.getPrefix(handlerType);
            RequestMappingInfo newMappingInfo = RequestMappingInfo.paths(prefix).build().combine(mappingInfo); // 生成一个新的mappingInfo； combine合并原mappinginfo
            return newMappingInfo;
        }
        return mappingInfo;
    }
    private String getPrefix(Class<?> handlerType) {
        String packageName = handlerType.getPackageName(); // 读取packageName
        String dotPath = packageName.replaceAll(this.apiPackagePath, ""); // com.fui.fuistore.api.v1 --替换为--> "v1"
        return dotPath.replace(".", "/");
    }
}
