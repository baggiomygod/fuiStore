package com.fui.fuistore.common;

import com.fui.fuistore.vo.PageResponseVO;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 响应结果生成工具
 */
public class ResponseUtil {
    public static HttpServletResponse getResponse(){
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
    }

    public static void setCurrentResponseHttpStatus(int httpStatus){
        getResponse().setStatus(httpStatus);
    }

    public static PageResponseVO generatePageResult (int total, List items, int page, int count) {
        return new PageResponseVO(total, items, page, count);
    }
}
