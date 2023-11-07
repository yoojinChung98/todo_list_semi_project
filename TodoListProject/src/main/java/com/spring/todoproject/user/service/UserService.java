package com.spring.todoproject.user.service;

import org.springframework.stereotype.Service;

import com.spring.todoproject.user.dto.UserInsertInfoRequestDTO;

import com.spring.todoproject.user.mapper.IUserMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

	private final IUserMapper mapper;
	
	@Override
	public void insertUserData(UserInsertInfoRequestDTO dto) {
		mapper.insertUserData(dto);
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
	
	//아이디 중복확인
	@Override
	public int idCheck(String account) {
		return mapper.idCheck(account); //sql문에서 실행된 아이디가 있다면 (총개수) 1이 account에 리턴될것.
		
	}

}