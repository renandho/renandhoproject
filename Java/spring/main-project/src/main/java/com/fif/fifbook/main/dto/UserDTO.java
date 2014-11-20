package com.fif.fifbook.main.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = -8816054032793242579L;

	private String strPassword;
	
	private String strUserId;

	private String strUserName;

	public String getStrPassword() {
		return strPassword;
	}

	public String getStrUserId() {
		return strUserId;
	}

	public String getStrUserName() {
		return strUserName;
	}

	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}

	public void setStrUserId(String strUserId) {
		this.strUserId = strUserId;
	}

	public void setStrUserName(String strUserName) {
		this.strUserName = strUserName;
	}
}
