package com.shop.core.validation;

public interface Validator<T> {

	void validate(T subject) throws ValidationException;
	
}
