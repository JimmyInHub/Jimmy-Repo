package com.jimmy.logfun.domain;

/**
 * @description: 基础表实体
 * @fileName: BaseEntity.java
 * @date: 2018/7/27 16:01
 * @author: Jimmy
 * @version: v1.0
 */
public class BaseEntity {
	private Long id;
	private String createTime;
	private String createName;
	private String updateTime;
	private String updateName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateName() {
		return updateName;
	}
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
	public String getCreateName() {
		return createName;
	}
	public void setCreateName(String createName) {
		this.createName = createName;
	}
}
