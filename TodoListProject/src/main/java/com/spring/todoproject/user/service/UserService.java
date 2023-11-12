package com.spring.todoproject.user.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.todoproject.user.dto.UserInsertInfoRequestDTO;
import com.spring.todoproject.user.entity.User;
import com.spring.todoproject.user.mapper.IUserMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

	private final IUserMapper mapper;
	private final BCryptPasswordEncoder encoder; // 비밀번호 암호화
	
	@Override
	public void insertUserData(UserInsertInfoRequestDTO dto) {
		//회원 비밀번호를 암호화 인코딩
		System.out.println("암호화 하기 전 비번: " + dto.getUserPw());
		
		//비밀번호를 암호화 해서 dto에 다시 저장하기
		String securePw = encoder.encode(dto.getUserPw());
		System.out.println("암호화 후 비번: " + securePw);
		dto.setUserPw(securePw);
		
		//dto를 entity로 변환
		User user = User.builder()
				.userId(dto.getUserId())
				.userPw(dto.getUserPw())
				.name(dto.getName())
				.nickName(dto.getNickName())
				.email1(dto.getEmail1())
				.email2(dto.getEmail2())
				.build();
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