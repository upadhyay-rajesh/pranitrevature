package com.pranitproject.exception;

import java.time.LocalTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AppExeceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	@ResponseStatus(value= HttpStatus.NOT_FOUND)
	public @ResponseBody MyResponse handleResponse(UserNotFoundException e, HttpServletRequest req) {
		MyResponse m=new MyResponse();
		m.setErrorMessage(e.getMessage());
		m.setUrl(req.getRequestURI());
		m.setTime(LocalTime.now().toString());
		
		return m;
	}
	
}
