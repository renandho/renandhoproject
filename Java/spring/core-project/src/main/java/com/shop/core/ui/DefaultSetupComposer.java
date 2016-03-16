package com.shop.core.ui;

import com.shop.core.validation.ValidationException;

public interface DefaultSetupComposer<T> {

	void populate(T subject);
	
	void render(T subject);
	
	void showErrorMessages(ValidationException ex);
	
	void clearErrorMessages();
}
