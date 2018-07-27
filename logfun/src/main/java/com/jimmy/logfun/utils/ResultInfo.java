package com.jimmy.logfun.utils;

/**
 * @description: 请求返回结果信息
 * @fileName: ResultInfo.java
 * @date: 2018/7/27 15:34
 * @author: Jimmy
 * @version: v1.0
 */
public class ResultInfo {

    private static final String SUCCESS = "200";
    private static final String ERROR = "500";    //  异常时返回错误
    private static final String FAIL = "400";

	//	返回结果,默认为true
	private Boolean success;

    //	返回信息
	private String msg;

	//  状态码，默认成功
	private String statusCode;

	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
    public String getStatusCode() {
	    return statusCode;
	}
    public void setStatusCode(String statusCode) {
	    this.statusCode = statusCode;
	}

	public ResultInfo() {
		this.success = true;
		this.statusCode = SUCCESS;
	}

	/**
	 * @description 失败返回
	 * @param msg
	 * @date: 2018/7/27 15:29
	 * @author: Jimmy
	 */
    public void fail(String msg) {
    	this.success = false;
    	this.msg = msg;
        this.statusCode = FAIL;
    }

    /**
	 * @description 错误返回
	 * @param msg
	 * @date: 2018/7/27 15:29
	 * @author: Jimmy
	 */
    public void error(String msg) {
    	this.success = false;
    	this.msg = msg;
        this.statusCode = ERROR;
    }
}
