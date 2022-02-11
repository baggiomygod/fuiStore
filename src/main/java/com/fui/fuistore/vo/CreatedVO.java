package com.fui.fuistore.vo;

import com.fui.fuistore.common.util.ResponseUtil;
//import io.github.talelin.autoconfigure.bean.Code;
import org.springframework.http.HttpStatus;

public class CreatedVO extends UnifyResponseVO<String> {
//    public CreatedVO(){
//        super(Code.CREATED.getCode());
//        ResponseUtil.setCurrentResponseHttpStatus(HttpStatus.CREATED.value());
//    }

    public CreatedVO(int code) {
        super(code);
        ResponseUtil.setCurrentResponseHttpStatus(HttpStatus.CREATED.value());
    }

    public CreatedVO(String message) {
        super(message);
        ResponseUtil.setCurrentResponseHttpStatus(HttpStatus.CREATED.value());
    }

    public CreatedVO(int code, String message) {
        super(code, message);
        ResponseUtil.setCurrentResponseHttpStatus(HttpStatus.CREATED.value());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
