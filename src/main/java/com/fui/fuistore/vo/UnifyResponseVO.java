package com.fui.fuistore.vo;

import com.fui.fuistore.common.util.ResponseUtil;
//import io.github.talelin.autoconfigure.bean.Code;
//import io.github.talelin.autoconfigure.util.RequestUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
@Builder
@AllArgsConstructor
public class UnifyResponseVO<T> {
    private Integer code;

    private T message;


//    public UnifyResponseVO() {
////        this.code = Code.SUCCESS.getCode();
//    }

    public UnifyResponseVO(int code) {
        this.code = code;
    }

    public UnifyResponseVO(T message) {
//        this.code = Code.SUCCESS.getCode();
        this.message = message;
    }

    public UnifyResponseVO(int code, T message) {
        this.code = code;
        this.message = message;
    }
//
//    public UnifyResponseVO(T message, HttpStatus httpStatus) {
////        this.code = Code.SUCCESS.getCode();
//        this.message = message;
//        ResponseUtil.setCurrentResponseHttpStatus(httpStatus.value());
//    }
//
//    public UnifyResponseVO(int code, T message, HttpStatus httpStatus) {
//        this.code = code;
//        this.message = message;
//        ResponseUtil.setCurrentResponseHttpStatus(httpStatus.value());
//    }
}
