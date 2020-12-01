package com.cg.movie.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MovieIdException extends RuntimeException {

	public MovieIdException() {
		super();
	}
	public MovieIdException(String errMsg) {
		super(errMsg);
	}
}