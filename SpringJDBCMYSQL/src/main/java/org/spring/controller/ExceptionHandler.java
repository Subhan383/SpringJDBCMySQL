package org.spring.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public String exceptionHandling(Exception e) {
		return "error";
		
	}
}
