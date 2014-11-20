package com.fif.fifbook.main.mapper;

import com.fif.fifbook.main.dto.UserDTO;


public interface UserMapper {
	public Integer getCountMatchUserByExample(String strUserId);
	public Integer validateLogin(UserDTO userDto);
	public String getUserNameById(UserDTO userDto);
	public void insertDataUser(UserDTO userDto);
}
