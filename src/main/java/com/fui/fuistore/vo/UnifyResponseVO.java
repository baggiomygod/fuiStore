package com.fui.fuistore.vo;

import com.fui.fuistore.common.ResponseUtil;
import io.github.talelin.autoconfigure.bean.Code;
import io.github.talelin.autoconfigure.util.RequestUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class UnifyResponseVO<T> {
    private Integer code;

    private T message;

    private String request;

    public UnifyResponseVO(){
        this.code = Code.SUCCESS.getCode();
        this.request = RequestUtil.getSimpleRequest();
    }
    public UnifyResponseVO(int code) {
        this.code = code;
        this.request = RequestUtil.getSimpleRequest();
    }
    public UnifyResponseVO(T message) {
        this.code = Code.SUCCESS.getCode();
        this.message = message;
        this.request = RequestUtil.getSimpleRequest();
    }

    public UnifyResponseVO(int code, T message) {
        this.code = code;
        this.message = message;
        this.request = RequestUtil.getSimpleRequest();
    }

    public UnifyResponseVO(T message, HttpStatus httpStatus) {
        this.code = Code.SUCCESS.getCode();
        this.message = message;
        this.request = RequestUtil.getSimpleRequest();
        ResponseUtil.setCurrentResponseHttpStatus(httpStatus.value());
    }

    public UnifyResponseVO(int code, T message, HttpStatus httpStatus) {
        this.code = code;
        this.message = message;
        this.request = RequestUtil.getSimpleRequest();
        ResponseUtil.setCurrentResponseHttpStatus(httpStatus.value());
    }


//    等效@Buider注解
    public static <T> UnifyResponseVOBuilder<T> builder() {
        return new UnifyResponseVOBuilder<T>();
    }

    public static class UnifyResponseVOBuilder<T> {
        private Integer code;
        private T message;
        private String request;

        UnifyResponseVOBuilder() {
        }

        public UnifyResponseVOBuilder<T> code(Integer code) {
            this.code = code;
            return this;
        }

        public UnifyResponseVOBuilder<T> message(T message) {
            this.message = message;
            return this;
        }

        public UnifyResponseVOBuilder<T> request(String request) {
            this.request = request;
            return this;
        }

        public UnifyResponseVO<T> build() {
            return new UnifyResponseVO<T>(code, message, request);
        }

        public String toString() {
            return "UnifyResponseVO.UnifyResponseVOBuilder(code=" + this.code + ", message=" + this.message + ", request=" + this.request + ")";
        }
    }
}
