package com.cg.fms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TrainerNotFoundException  extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public TrainerNotFoundException(String message) {
		super(message);	
	}
	
}