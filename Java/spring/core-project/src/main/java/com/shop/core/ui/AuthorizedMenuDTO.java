package com.shop.core.ui;

import java.io.Serializable;

public class AuthorizedMenuDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long actionId;
	private String actionUrl;
	private String menuItemType;
	private int sequence;
	private String displayName;
	private String itemName;
	private Long moduleId;
	private String userManual;
	private String moduleName;
	
	public String getMenuItemType() {
		return menuItemType;
	}
	public void setMenuItemType(String menuItemType) {
		this.menuItemType = menuItemType;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Long getModuleId() {
		return moduleId;
	}
	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}
	public String getUserManual() {
		return userManual;
	}
	public void setUserManual(String userManual) {
		this.userManual = userManual;
	}
	public String getActionUrl() {
		return actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}
	public Long getActionId() {
		return actionId;
	}
	public void setActionId(Long actionId) {
		this.actionId = actionId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	
	
}
