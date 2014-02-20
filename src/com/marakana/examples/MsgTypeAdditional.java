package com.marakana.examples;

public class MsgTypeAdditional implements MsgInterface {
	
	private String msg;

	public MsgTypeAdditional() { }

	public MsgTypeAdditional(String msg) {
		setMsg(msg);
	}

	public void setMsg(String msg) {
		this.msg = msg + " 2";
	}

	public String getMsg() {
		return this.msg;
	}

	public String getMsgType() {
		return "MsgTypeAdditional";
	}
}
