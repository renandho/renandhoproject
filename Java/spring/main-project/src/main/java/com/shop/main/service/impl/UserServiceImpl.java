package com.shop.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.main.dto.UserDTO;
import com.shop.main.mapper.UserMapper;
import com.shop.main.service.UserService;

@Transactional
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;

	@Override
	public Integer getCountMatchUserByExample(String strUserId) {
		return userMapper.getCountMatchUserByExample(strUserId);
	}

	@Override
	public Integer validateLogin(UserDTO user) {
		return userMapper.validateLogin(user);
	}

	@Override
	public String getUserNameById(UserDTO userDto) {
		return userMapper.getUserNameById(userDto);
	}
	
	@Override
	public void insertDataUser(UserDTO userDto){
		userMapper.insertDataUser(userDto);
	}
	

}
