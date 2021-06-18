package com.appsdeveloperblog.photoapp.api.users.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.appsdeveloperblog.photoapp.api.users.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public UserDto createUser(UserDto userDetails) {
		// TODO Auto-generated method stub
		
		userDetails.setUserId(UUID.randomUUID().toString());
		userDetails.setEmail("test");
		return null;
	}

}
