package com.fif.fifbook.main.controller;

import org.zkoss.zul.Textbox;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.Button;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Window;

import com.fif.fifbook.main.dto.UserDTO;
import com.fif.fifbook.main.service.impl.UserServiceImpl;

@VariableResolver(DelegatingVariableResolver.class)
public class SignupController extends SelectorComposer<Window> {
	private static final long serialVersionUID = 5401920609229501239L;

	@Wire
	private Window signupWindow; 
	
	@Wire
	private Textbox txtUsername;

	@Wire
	private Textbox txtPassword;

	@Wire
	private Button btnSubmit;
	
	@Wire
	private Button btnCancel;

	@Override
	public void doAfterCompose(Window comp) throws Exception {
		super.doAfterCompose(comp);
		
	}

	@Listen("onClick=#btnSubmit")
	public void doSubmit() {
		try {
			UserDTO user = new UserDTO();
			user.setStrUserName(txtUsername.getText().toString());
			user.setStrPassword(txtPassword.getText().toString());
			UserServiceImpl userService = new UserServiceImpl();
			userService.insertDataUser(user);
		} catch (Exception ex) {
			Messagebox.show("Error on Save Data : " + ex.toString());
		}
	}

	@Listen("onClick=#btnCancel")
	public void doCancel() {
		signupWindow.detach();
	}
	
}
