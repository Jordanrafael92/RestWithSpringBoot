package br.com.jordan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedException extends RuntimeException {
	
	public static final long serialVersionUID = 1L;
	
	public UnsuportedException(String exception) {
		super(exception);
	}
}
