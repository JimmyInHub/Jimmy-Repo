package com.jimmy.logfun.domain;

public class User extends BaseEntity{

	/**
	 * 状态
	 */
	private String status;

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
	 * 角色
	 */
	private String role;

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
