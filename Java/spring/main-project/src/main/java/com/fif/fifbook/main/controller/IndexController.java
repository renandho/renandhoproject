package com.fif.fifbook.main.controller;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.Button;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.fif.fifbook.main.dto.UserDTO;
import com.fif.fifbook.main.service.PasswordHash;
import com.fif.fifbook.main.service.UserService;
import com.google.common.base.Strings;

@VariableResolver(DelegatingVariableResolver.class)
public class IndexController extends SelectorComposer<Window> {

	/**
	 * created By Rim, for Index Page
	 */
	private static final long serialVersionUID = -1915238292295448281L;

	@Wire
	private Textbox u;

	@Wire
	private Textbox p;

	@Wire("#btnLogin")
	private Button btnLogin;

	@Wire("#btnSignup")
	private Button btnSignup;

	@WireVariable(rewireOnActivate = true)
	private transient UserService userServiceImpl;

	@Override
	public void doAfterCompose(Window comp) throws Exception {
		super.doAfterCompose(comp);

	}

	public void loginValidate(String strUsername, String strPassword) {

		PasswordHash hash = new PasswordHash();
		try {
			UserDTO userDto = new UserDTO();
			userDto.setStrUserId(strUsername);
			userDto.setStrPassword(hash.createHash(strPassword));
			if (userServiceImpl.validateLogin(userDto) == 1) {
				userDto.setStrUserName(userServiceImpl.getUserNameById(userDto));
				Sessions.getCurrent().setAttribute("user", userDto);
				Executions.sendRedirect("/workspace.zul");
			} else {
				Messagebox.show("User tidak terdaftar");
			}
		} catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
			Messagebox.show("Error pada saat login :  " + e.toString());
		}

	}

	@Listen("onClick = #btnLogin")
	public void doLogin() {
		if (Strings.nullToEmpty(u.getText().toString()).trim().isEmpty()) {
			Messagebox.show("Username harus diisi!");

		} else if ((Strings.nullToEmpty(p.getText().toString()).trim()
				.isEmpty())) {
			Messagebox.show("Password harus diisi!");
		} else if (!(Strings.nullToEmpty(p.getText().toString()).trim()
				.isEmpty())
				&& !((Strings.nullToEmpty(u.getText().toString()).trim()
						.isEmpty()))) {
			loginValidate(u.getText(), p.getText());

		}

	}

	@Listen("onClick = #btnSignup")
	public void doSignup() {
		Messagebox.show("btnSignup di click");
		Executions.sendRedirect("/signup.zul");
	}

}
