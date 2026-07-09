package com.petromirdzhunev.domain.core.exception;

public class EntityAlreadyExistsException extends RuntimeException {

	public EntityAlreadyExistsException(final String message) {
		super(message);
	}
}
