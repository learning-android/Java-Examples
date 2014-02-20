package com.marakana.examples;

public class MsgTypeImplementationExtended extends MsgTypeImplementation {
	
	@Override
	public String getMsgType() {
		return "MsgTypeImplementationExtended";
	}

	// here we Overload the getMsg() method so we now have an
	// additional method that adds something to the getMsg() string

	public String getMsg(String pre) {
		return pre+" "+getMsg();
	}

	// and again we Overload the getMsg() method this time with a int

	public String getMsg(int post) {
		return " -- "+post;
	}
}
