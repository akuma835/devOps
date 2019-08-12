package com.example.devops.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/***
 * 
 * @author Amit Kumar
 * 
 * Custom Exception Class InvalidUrl
 *
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class InvalidURL extends Exception {

	private static final long serialVersionUID = 1L;
	private String errorTitle;
	private String message;
	public String getErrorTitle() {
		return errorTitle;
	}
	public void setErrorTitle(String errorTitle) {
		this.errorTitle = errorTitle;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * Method InvalidURL
	 * @param errorTitle
	 * @param message
	 */
	public InvalidURL(String errorTitle, String message) {
		super();
		this.errorTitle = errorTitle;
		this.message = message;
	}
	
	
	
	
	

}
