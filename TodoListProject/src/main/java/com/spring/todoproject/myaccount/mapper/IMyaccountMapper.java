package com.spring.todoproject.myaccount.mapper;

import java.util.List;

import com.spring.todoproject.myaccount.dto.ProfBoxDTO;
import com.spring.todoproject.myaccount.entity.Users;

public interface IMyaccountMapper {

	// 프로필박스에 들어갈 유저정보를 반환: 프로필색, 닉네임, 보드 수
	ProfBoxDTO getProfInfo(String userId);

	// 프로필박스에 들어갈 유저정보를 반환: 유저가 작성한 보드의 총 좋아요 수
	int getBoardLikeCnt(String userId);

	// 유저 상세정보에 들어갈 유저정보를 반환: 이름, 닉네임, 이메일1, 이메일2, 비밀번호, 프로필색
	Users getUserInfo(String userId);
	

}
