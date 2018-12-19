package com.zxf.mblog.exception;

import com.zxf.mblog.common.ResponseEnum;
import lombok.Data;

/**
 * Create by Mr.ZXF
 * on 2018-12-19 17:22
 */
@Data
public class BusinessException extends RuntimeException {
    private ResponseEnum responseEnum;

    private Object data;

    public BusinessException(ResponseEnum responseEnum) {
        this.responseEnum = responseEnum;
    }

    public BusinessException(ResponseEnum responseEnum, Object data) {
        this(responseEnum);
        this.data = data;
    }

    public BusinessException(ResponseEnum responseEnum, Throwable cause) {
        super(cause);
        this.responseEnum = responseEnum;
    }

    public BusinessException(ResponseEnum responseEnum,Object data, Throwable cause) {
        this(responseEnum,cause);
        this.data = data;
    }

    @Override
    public String getMessage(){
        return responseEnum == null ? null : responseEnum.getMsg();
    }
}
