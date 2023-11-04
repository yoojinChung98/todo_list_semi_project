package com.spring.todoproject.user.service;

import com.spring.todoproject.user.entity.User;

public interface IUserService {
	
	//회원 가입
		void insertUserData(User user);
		
		//회원 정보 가져오기!
		void selectUserData(String userId);
		
		//회원 정보 삭제
		void deleteUserData();
		
		//회원 정보 수정
		void updateUserDate();

}
