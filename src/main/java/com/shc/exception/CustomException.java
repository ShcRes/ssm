package com.shc.exception;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = -7076403032489771411L;
	
	private String message;
	
	public CustomException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
