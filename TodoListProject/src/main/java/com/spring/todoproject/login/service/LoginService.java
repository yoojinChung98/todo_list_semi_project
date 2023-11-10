package com.spring.todoproject.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.todoproject.login.dto.NaverLoginDTO;
import com.spring.todoproject.login.mapper.ILoginMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoginService {

	@Autowired
	private final ILoginMapper mapper;

	private final BCryptPasswordEncoder encoder;

	public String login(String userId, String userPw) {
		System.out.println("아이디: " + userId);
		System.out.println("비번: " + userPw);
		String dbPw = mapper.login(userId);
		System.out.println(dbPw);
		if (dbPw != null) {
//			//날것의 비밀번호와 암호화된 비밀번호의 일치 여부를 알려주는 matches()
//			if(encoder.matches(userPw, dbPw)) {
//				System.out.println("유효성검사 비밀번호 맞음");
//				return "Succes";
//			}
			System.out.println("아이디있음");
			// 날것의 비밀번호와 암호화된 비밀번호의 일치 여부를 알려주는 matches()
			if (dbPw.equals(userPw)) {
				System.out.println("유효성검사 비밀번호 맞음");
				return "Succes";
			} else {
				System.out.println("유효성검사 비밀번호 틀림");
				return "Fail";
			}
		} else {

			return "데이터가 안옴";
		}

	}

	public void naverlogin(String userId, String userPw, String name, String nickname, String email) {
		/*
		 * dto.getId(), dto.getToken(), dto.getName(), dto.getNickname(), dto.getEmail()
		 */

		System.out.println("naverlogin 서비스에 들어옴");

		System.out.println(userId);

		String email2 = email.substring(email.length() - 10);
		System.out.println(email2);

		String email1 = email.substring(0, email.length() - 10);

		

		String test = mapper.naverlogintest(email1, email2);

		
		if(test != null) { System.out.println("네이버아이디 있음");

		
		} else { 
			mapper.naverlogininsert(userId, userPw, name, nickname, email1, email2);
			System.out.println("네이버아이디 만듦");
		}

	}

}
