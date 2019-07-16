package com.jimmy.logfun.domain;

public class User extends BaseEntity{

	/**
	 * 状态(默认10启用，00作废)
	 */
	private String status = "10";

	/**
	 * 姓名
	 */
	private String userName;

	/**
	 * 密码（MD5加密后）
	 */
	private String passWord;

	/**
	 * 手机号
	 */
	private String phoneNum;

	/**
	 * email
	 */
	private String email;

	/**
	 * 头像
	 */
	private String avatar;

	/**
	 * 记住我
	 */
	private String rememberMe;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(String rememberMe) {
		this.rememberMe = rememberMe;
	}
}
