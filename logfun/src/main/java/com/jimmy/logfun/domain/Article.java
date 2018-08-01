package com.jimmy.logfun.domain;

/**
 * @description: 文章实体
 * @fileName: Article.java
 * @date: 2018/7/27 16:00
 * @author: Jimmy
 * @version: v1.0
 */
public class Article extends BaseEntity{
	
	//	标题
	private String title;
	
	//	内容
	private String content;

	//	原始内容
	private String plainText;
	
	//	作者
	private String author;

	//	状态
	private String status;

	public String getTitle() {
		return title; 
	}
	
	public void setTitle(String title) { 
		this.title = title; 
	}
	
	public String getContent() { 
		return content; 
	}
	
	public void setContent(String content) { 
		this.content = content; 
	}
	
	public String getAuthor() { 
		return author; 
	}
	
	public void setAuthor(String author) { 
		this.author = author; 
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPlainText() {
		return plainText;
	}

	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}
}
