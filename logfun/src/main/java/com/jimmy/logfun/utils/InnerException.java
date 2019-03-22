package com.jimmy.logfun.utils;

/**
 * FileName: InnerException
 *  异常类，对内展示
 * @author JWELL_Jimmy
 * @create 2019/3/20
 * @since 1.0.0
 */
public class InnerException extends RuntimeException{

    protected String code = "500";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public InnerException(String message) {
        super(message);
        this.code = code;
    }
}
