package com.fui.fuistore.core.hack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

/*
    week 12-2-8
* 处理打上@RequestMapping("/banner")注解的控制器
 * */

// AutoPrefixUrlMapping自动补全url前缀,
// AutoPrefixConfiguration中实现注入
public class AutoPrefixUrlMapping extends RequestMappingHandlerMapping {
    @Value("${fuistore.api-package}") // 读取配置
    private String apiPackagePath;
    private String prefix;

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
        String packageName = handlerType.getPackage().getName(); // 读取packageName
        String dotPath = packageName.replaceAll(this.apiPackagePath, ""); // com.fui.fuistore.api.v1 --替换为--> "v1"
        return dotPath.replace(".", "/");
    }
}
