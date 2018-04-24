package com.zd.crmbatch.business.utils;

public enum ReturnMsgEnum {

	success("0000","验证通过"),
	errorParam("0001","您输入的资料有误"),
	errorAccount("0002","您输入的账户有法人户"),
	otherAccount("0003","您名下还有其他的账户");
	
	private String code;
	private String message;
	
	private ReturnMsgEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
