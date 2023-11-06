package com.spring.todoproject.main.mapper;

public interface IMainMapper {

	//회원 가입
	void insertUserData();

	//회원 정보 가져오기!
	void selectUserData(String userId);

	//회원 정보 삭제
	void deleteUserData();

	//회원 정보 수정
	void updateUserDate();

}
