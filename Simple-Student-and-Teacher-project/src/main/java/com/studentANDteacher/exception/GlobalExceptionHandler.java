package com.studentANDteacher.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.studentANDteacher.entity.ErrorResponse;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

	@ExceptionHandler(value = { IllegalArgumentException.class })
	public Object handleException(Exception ex, HttpServletRequest request) {
		log(ex);
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage(ex.getMessage());
		errorResponse.setStatus(getHttpStatusForException(ex));
		return new ResponseEntity<Object>(errorResponse, errorResponse.getStatus());
	}

	public static HttpStatus getHttpStatusForException(Exception ex) {
		HttpStatus errorCode;

		if (ex instanceof IllegalArgumentException) {
			errorCode = HttpStatus.BAD_REQUEST;
		} else {
			log.warn("Unknown exception type: {}", ex.getClass().getName());
			errorCode = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return errorCode;

	}

	private void log(Exception ex) {
		StackTraceElement[] stackTrace = ex.getStackTrace();

		if (stackTrace.length > 0) {
			StackTraceElement source = stackTrace[0];
			String className = source.getClassName();
			String methodName = source.getMethodName();
			int lineNumber = source.getLineNumber();

			log.error("{} caught in {} - {} (Line: {}) - {}", ex.getClass().getSimpleName(), className, methodName,
					lineNumber, ex.getMessage(), ex);
		} else {
			log.error("Exception caught - {}", ex.getMessage(), ex);
		}
	}
}
