package com.example.devops.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/***
 * Common Custom Exception Class For The Application
 * @author Amit Kumar
 *
 */
@ResponseStatus
public class ProgramException extends RuntimeException {
	private HttpStatus title;
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param errorMassage
	 */
	public ProgramException(String errorMassage) {
		super(errorMassage);
	}

	/**
	 * 
	 * @param errorMessage
	 * @param httpStatus
	 */
	public ProgramException(String errorMessage, HttpStatus httpStatus) {
		super(errorMessage);
		title = httpStatus;
	}

	/**
	 * 
	 * @return title
	 */
	public HttpStatus getTitle() {
		return title;
	}

}
