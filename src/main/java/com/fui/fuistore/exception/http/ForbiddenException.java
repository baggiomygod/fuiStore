package com.fui.fuistore.exception.http;

// 没有权限的异常
public class ForbiddenException extends HttpException {
    public ForbiddenException(int code) {
        this.code = code;
        this.httpStatusCode = 403;
    }
}
