package com.fui.fuistore.exception.http;

// 找不到资源异常
public class NotFoundException extends HttpException {
    public NotFoundException(int code) {
        this.httpStatusCode = 404;
        this.code = code;
    }
}
