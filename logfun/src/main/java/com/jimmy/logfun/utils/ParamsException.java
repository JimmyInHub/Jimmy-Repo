package com.jimmy.logfun.utils;

/**
 * FileName: ParamsException
 *  异常类，参数异常
 * @author JWELL_Jimmy
 * @create 2019/3/20
 * @since 1.0.0
 */
public class ParamsException extends RuntimeException{

    protected String code = "410";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ParamsException(String message) {
        super(message);
        this.code = code;
    }
}
