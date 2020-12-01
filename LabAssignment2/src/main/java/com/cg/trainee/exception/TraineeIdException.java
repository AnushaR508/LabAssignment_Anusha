package com.cg.trainee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TraineeIdException extends RuntimeException {

	public TraineeIdException() {
		super();
	}
	public TraineeIdException(String errMsg) {
		super(errMsg);
	}
}
