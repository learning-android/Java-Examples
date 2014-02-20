package com.marakana.examples;

public class MsgTypeImplementation implements MsgInterface {
	
	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return this.msg;
	}

	public String getMsgType() {
		return "MsgTypeImplementation";
	}
}
