package com.cg.devops.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/***
 * Custom Exception Class which is used all over the application
 * @author Amit Kumar
 *
 */
@ResponseStatus
public class ProgramException extends RuntimeException {
	private HttpStatus title;
	private static final long serialVersionUID = 1L;

	public ProgramException(String errorMessage) {
		super(errorMessage);
	}

	public ProgramException(String errorMessage, HttpStatus httpStatus) {
		super(errorMessage);
		title = httpStatus;
	}

	public HttpStatus getTitle() {
		return title;
	}

}
