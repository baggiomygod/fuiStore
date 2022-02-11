package com.fui.fuistore.vo;
import com.fui.fuistore.common.util.ResponseUtil;
//import io.github.talelin.autoconfigure.bean.Code;
import org.springframework.http.HttpStatus;

public class UpdatedVO extends UnifyResponseVO<String>{
//    public UpdatedVO(){
//        super(Code.UPDATED.getCode());
//        ResponseUtil.setCurrentResponseHttpStatus(HttpStatus.OK.value());
//    }
    public UpdatedVO(int code) {
        super(code);
        ResponseUtil.setCurrentResponseHttpStatus(HttpStatus.OK.value());
    }

    public UpdatedVO(String message) {
        super(message);
        ResponseUtil.setCurrentResponseHttpStatus(HttpStatus.OK.value());
    }

    public UpdatedVO(int code, String message) {
        super(code, message);
        ResponseUtil.setCurrentResponseHttpStatus(HttpStatus.OK.value());
    }

}
