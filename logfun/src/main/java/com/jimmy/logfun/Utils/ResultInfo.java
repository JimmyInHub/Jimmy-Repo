package com.jimmy.logfun.Utils;

public class ResultInfo {
	
	//返回结果,默认为true
	private Boolean success = true;
	
	//返回信息,默认"成功"
	private String msg;

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
	
}
