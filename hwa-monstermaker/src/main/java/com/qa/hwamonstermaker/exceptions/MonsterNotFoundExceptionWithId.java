package com.qa.hwamonstermaker.exceptions;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class MonsterNotFoundExceptionWithId extends EntityNotFoundException {
	
	public MonsterNotFoundExceptionWithId(long monsterId) {
		super("Monster does not exist with ID: " + monsterId);
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
