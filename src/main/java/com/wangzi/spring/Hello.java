package com.wangzi.spring;

public class Hello {
	
	@Override
	public String toString() {
		return "Hello [content=" + content + "]";
	}
	private String content;
	public void setContent(String content) {
		this.content = content;
	}
	public String getHello() {
		return content;
	}
	
}
