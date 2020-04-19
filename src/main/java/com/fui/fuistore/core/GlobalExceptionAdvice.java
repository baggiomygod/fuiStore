package com.fui.fuistore.core;

import com.fui.fuistore.core.configuration.ExceptionCodeConfiguration;
import com.fui.fuistore.exception.http.HttpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionAdvice {
    // 异常处理器

    // 注入获取code的类 core/configuration/ExceptionCodeConfiguration (它被注入到容器中，@Autowired 引入)
    @Autowired
    private ExceptionCodeConfiguration codeConfiguration = new ExceptionCodeConfiguration();

    // 处理未知异常
    @ExceptionHandler(value=Exception.class)
    @ResponseBody
    @ResponseStatus(code= HttpStatus.INTERNAL_SERVER_ERROR)
    public UnifyResponse handleException(HttpServletRequest req, Exception e){
        String requestUrl = req.getRequestURI(); // 获取请求的url
        String method = req.getMethod();
        System.out.println(e);
        UnifyResponse message = new UnifyResponse(9999, "服务器异常", method + ":" + requestUrl);
        return message;
    }

    // 处理已知HTTP异常
    @ExceptionHandler(HttpException.class)
    public ResponseEntity<UnifyResponse> handleHttpException(HttpServletRequest req, HttpException e) {
        String requestUrl = req.getRequestURI(); // 获取请求的url
        String method = req.getMethod();
        // 泛型
        Integer eCode = e.getCode();
        UnifyResponse message = new UnifyResponse(eCode, codeConfiguration.getMessage(eCode), method + ":" + requestUrl);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpStatus httpStatus = HttpStatus.resolve(e.getHttpStatusCode());
        ResponseEntity<UnifyResponse> r = new ResponseEntity<>(message, headers, httpStatus);
        System.out.println("http exception");
        return r;
    }
}
