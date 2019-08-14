package com.cg.devops.exception;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/***
 * 
 * @author Amit Kumar
 * 
 *         Exception Handler For Exception
 *
 */
@ControllerAdvice
@RestController
public class ProgramExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public final ResponseEntity<ErrorMessagePattern> handleAllException(Exception e, WebRequest webRequest) {
		ErrorMessagePattern error = new ErrorMessagePattern(LocalDateTime.now(), "Error", e.getMessage(),
				webRequest.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

	}

	/***
	 * 
	 * @param Object of Program Exception
	 * @param webRequest
	 * @return JSON of CustomErrorpattern JSON
	 */
	
	@ExceptionHandler(ProgramException.class)
	public final ResponseEntity<ErrorMessagePattern> handleProgramException(ProgramException pe,
			WebRequest webRequest) {
		HttpStatus statusCode;
		if (pe.getTitle() == null) {
			statusCode = HttpStatus.SEE_OTHER;
		} else {
			statusCode = pe.getTitle();
		}
		ErrorMessagePattern exception = new ErrorMessagePattern(LocalDateTime.now(), statusCode.toString(),
				pe.getMessage(), webRequest.getDescription(false));

		return new ResponseEntity<>(exception, statusCode);
	}


}
