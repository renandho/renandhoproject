package com.fif.fifbook.main.controller;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Window;

import com.fif.fifbook.main.dto.UserDTO;
import com.google.common.base.Strings;

@VariableResolver(DelegatingVariableResolver.class)
public class WorkspaceController extends SelectorComposer<Window> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7143712592520549964L;

	@Wire
	private Label lblWelcome;

	@Wire
	private Label lblUsername;

	@Wire("#btnLogout")
	private Button btnLogout;

	@Wire
	private Window winWorkspace;

	@Override
	public void doAfterCompose(Window comp) throws Exception {
		super.doAfterCompose(comp);

		populateDataLogin();
	}

	public void populateDataLogin() {
		try {
			UserDTO userDto = new UserDTO();
			userDto = (UserDTO) Sessions.getCurrent().getAttribute("user");
			/*lblUsername.setValue(userDto.getStrUserId());*/
			lblUsername.setValue("Ini adalah workspace dari FIFBOOK");
			winWorkspace.setTitle("Selamat Datang di FIFBOOK, " + userDto.getStrUserName());
		} catch (Exception ex) {
			Messagebox
					.show("Session anda sudah habis, silahkan melakukan login kembali");

			Executions.sendRedirect("/index.zul");
		}
	}

	@Listen("onClick = #btnLogout")
	public void doLogOut() {
		Sessions.getCurrent().removeAttribute("user");
		Executions.sendRedirect("/index.zul");

	}

}
