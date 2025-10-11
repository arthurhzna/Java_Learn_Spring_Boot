package com.learnspringboot.restful_web_services.helloworld;

public class HelloWorldBean {

	private String message;
	private int number;

	public HelloWorldBean(String message) {
		this.message = message;
		this.number = 54;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getNumber() {
		return number;
	}

	// public void setNumber(int number) {
	// 	this.number = number;
	// }

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
}
