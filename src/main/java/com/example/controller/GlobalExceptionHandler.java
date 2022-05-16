package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(OneValueException.class)
	public ResponseEntity<GlobalError> oneValueExceptionHandler(){
		GlobalError gError=new GlobalError();
		gError.setMessage("Due to value 1");
		gError.setErrorReason("Value Not Found");
		return new ResponseEntity<>(gError,HttpStatus.BAD_REQUEST);
	}
}
