package com.zze0.demo.shardingjdbc.entity;

public class User {
	private String fdId;
	private String fdName;
	private String fdPwd;

	public String getFdId() {
		return fdId;
	}

	public void setFdId(String fdId) {
		this.fdId = fdId;
	}

	public String getFdName() {
		return fdName;
	}

	public void setFdName(String fdName) {
		this.fdName = fdName;
	}

	public String getFdPwd() {
		return fdPwd;
	}

	public void setFdPwd(String fdPwd) {
		this.fdPwd = fdPwd;
	}
}