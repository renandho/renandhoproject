package com.shop.main.service;

import com.shop.main.dto.UserDTO;

public interface  UserService {
	public Integer getCountMatchUserByExample(String strUserId);
	public Integer validateLogin(UserDTO user);
	public String getUserNameById(UserDTO userDto);
	void insertDataUser(UserDTO userDto);
}
