package com.fif.hcms.core.ui;

import com.fif.hcms.core.validation.ValidationException;

public interface DefaultSetupComposer<T> {

	void populate(T subject);
	
	void render(T subject);
	
	void showErrorMessages(ValidationException ex);
	
	void clearErrorMessages();
}
