package com.shop.main.mapper;

import com.shop.main.dto.UserDTO;

public interface UserMapper {
	public Integer getCountMatchUserByExample(String strUserId);
	public Integer validateLogin(UserDTO userDto);
	public String getUserNameById(UserDTO userDto);
	public void insertDataUser(UserDTO userDto);
}
