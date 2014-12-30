package com.fif.fifbook.main.service;

import com.fif.fifbook.main.dto.UserDTO;

public interface  UserService {
	public Integer getCountMatchUserByExample(String strUserId);
	public Integer validateLogin(UserDTO user);
	public String getUserNameById(UserDTO userDto);
	void insertDataUser(UserDTO userDto);
}
