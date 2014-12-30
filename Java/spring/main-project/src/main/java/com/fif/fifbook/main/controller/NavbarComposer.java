package com.fif.fifbook.main.controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.HtmlBasedComponent;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.OpenEvent;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.A;
import org.zkoss.zul.Menu;
import com.fif.fifbook.main.dto.UserDTO;

public class NavbarComposer extends SelectorComposer<Component> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9093177806564549753L;

	@Wire
	A atask, anoti, amsg;

	@Wire
	Menu profileMenu;

	@Wire
	Menu menuItemLogout;

	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);

		try {
			if (Sessions.getCurrent() != null) {

				profileMenu.setLabel(Sessions.getCurrent().getAttribute("user")
						.toString());
				UserDTO userDto = new UserDTO();
				userDto = (UserDTO) Sessions.getCurrent().getAttribute("user");
				profileMenu.setLabel(userDto.getStrUserName());
			} else {
				Executions.sendRedirect("/index.zul");
			}
		} catch (Exception ex) {
			Executions.sendRedirect("/index.zul");
		}

	}

	@Listen("onClick=#menuItemLogout")
	public void onClickMenuItemLogout() {
		/* destroy session */
		if (Sessions.getCurrent() != null) {
			Sessions.getCurrent().invalidate();
		}
		/* kembali ke halaman index */
		Executions.sendRedirect("/index.zul");
	}

	@Listen("onOpen = #taskpp")
	public void toggleTaskPopup(OpenEvent event) {
		toggleOpenClass(event.isOpen(), atask);
	}

	@Listen("onOpen = #notipp")
	public void toggleNotiPopup(OpenEvent event) {
		toggleOpenClass(event.isOpen(), anoti);
	}

	@Listen("onOpen = #msgpp")
	public void toggleMsgPopup(OpenEvent event) {
		toggleOpenClass(event.isOpen(), amsg);
	}

	// Toggle open class to the component
	public void toggleOpenClass(Boolean open, Component component) {
		HtmlBasedComponent comp = (HtmlBasedComponent) component;
		String scls = comp.getSclass();
		if (open) {
			comp.setSclass(scls + " open");
		} else {
			comp.setSclass(scls.replace(" open", ""));
		}
	}
}
