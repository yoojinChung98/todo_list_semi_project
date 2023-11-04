package com.spring.todoproject.user.service;

import org.springframework.stereotype.Service;

import com.spring.todoproject.user.entity.User;
import com.spring.todoproject.user.mapper.IUserMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

	private final IUserMapper mapper;
	
	@Override
	public void insertUserData(User user) {
		// TODO Auto-generated method stub
		mapper.insertUserData(user);
	}

	@Override
	public void selectUserData(String userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserData() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUserDate() {
		// TODO Auto-generated method stub

	}

}
