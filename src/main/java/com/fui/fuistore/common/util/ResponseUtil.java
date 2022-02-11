package com.fui.fuistore.common.util;

import com.fui.fuistore.vo.PageResponseVO;
import com.fui.fuistore.vo.UnifyResponseVO;
//import io.github.talelin.autoconfigure.bean.Code;
//import io.github.talelin.autoconfigure.util.RequestUtil;
//import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

//@Slf4j // 为类提供一个 属性名为log 的 log4j 日志对像
public class ResponseUtil {
    /**
     * 获得当前响应
     *
     * @return 响应
     */
    public static HttpServletResponse getResponse() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
    }

    public static void setCurrentResponseHttpStatus(int httpStatus) {
        getResponse().setStatus(httpStatus);
    }

//    public static <T> UnifyResponseVO<T> generateCreatedResponse(int code) {
//        return (UnifyResponseVO<T>) UnifyResponseVO.builder()
//                .message(Code.CREATED.getDescription())
//                .code(code)
//                .request(RequestUtil.getSimpleRequest())
//                .build();
//    }
//
//    public static <T> UnifyResponseVO<T> generateCreatedResponse(int code, T data) {
//        return (UnifyResponseVO<T>) UnifyResponseVO.builder()
//                .message(data)
//                .code(code)
//                .request(RequestUtil.getSimpleRequest())
//                .build();
//    }
//
//    public static <T> UnifyResponseVO<T> generateDeletedResponse(int code) {
//        return (UnifyResponseVO<T>) UnifyResponseVO.builder()
//                .message(Code.SUCCESS.getDescription())
//                .code(code)
//                .request(RequestUtil.getSimpleRequest())
//                .build();
//    }
//
//    public static <T> UnifyResponseVO<T> generateDeletedResponse(int code, T data) {
//        return (UnifyResponseVO<T>) UnifyResponseVO.builder()
//                .message(data)
//                .code(code)
//                .request(RequestUtil.getSimpleRequest())
//                .build();
//    }
//
//    public static <T> UnifyResponseVO<T> generateUpdatedResponse(int code) {
//        return (UnifyResponseVO<T>) UnifyResponseVO.builder()
//                .message(Code.SUCCESS.getDescription())
//                .code(code)
//                .request(RequestUtil.getSimpleRequest())
//                .build();
//    }
//
//    public static <T> UnifyResponseVO<T> generateUpdatedResponse(int code, T data) {
//        return (UnifyResponseVO<T>) UnifyResponseVO.builder()
//                .message(data)
//                .code(code)
//                .request(RequestUtil.getSimpleRequest())
//                .build();
//    }
//
//    public static <T> UnifyResponseVO<T> generateUnifyResponse(int code) {
//        return (UnifyResponseVO<T>) UnifyResponseVO.builder()
//                .code(code)
//                .request(RequestUtil.getSimpleRequest())
//                .build();
//    }
//
//    public static PageResponseVO generatePageResult(int total, List items, int page, int count) {
//        return new PageResponseVO(total, items, page, count);
//    }
}
