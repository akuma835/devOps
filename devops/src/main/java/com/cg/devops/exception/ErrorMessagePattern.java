package com.cg.devops.exception;

import java.time.LocalDateTime;
/***
 * @author Amit Kumar
 * Exception message Custom JSON format POJO 
 *
 */
public class ErrorMessagePattern {

	private LocalDateTime date;
	private String message;
	private String messageDetails;
	private String requestCode;

	
	public LocalDateTime getDate() {
		return date;
	}

	
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	
	public String getMessage() {
		return message;
	}

	
	public void setMessage(String message) {
		this.message = message;
	}

	
	public String getMessageDetails() {
		return messageDetails;
	}

	
	public void setMessageDetails(String messageDetails) {
		this.messageDetails = messageDetails;
	}

	
	public String getRequestCode() {
		return requestCode;
	}

	
	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}

	/**
	 * Constructor ErrorMessagePattern With Parameters
	 * @param date
	 * @param message
	 * @param messageDetails
	 * @param requestCode
	 */
	public ErrorMessagePattern(LocalDateTime date, String message, String messageDetails, String requestCode) {
		super();
		this.date = date;
		this.message = message;
		this.messageDetails = messageDetails;
		this.requestCode = requestCode;
	}
/**
 * Default Constructor ErrorMessagePattern
 */
	public ErrorMessagePattern() {

	}

}
