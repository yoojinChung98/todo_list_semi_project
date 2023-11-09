package com.spring.todoproject.login.mapper;

public interface ILoginMapper {
	
	// 아이디 비밀번호가 DB에 있는지 확인
	String login(String userId);


}
