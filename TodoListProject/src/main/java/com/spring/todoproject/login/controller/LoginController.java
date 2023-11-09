package com.spring.todoproject.login.controller;



import java.math.BigInteger;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.todoproject.login.service.LoginService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/todok")
@RequiredArgsConstructor
@Slf4j
public class LoginController {

	@Autowired
	private final LoginService service;
	
	
	@GetMapping("/login")
	public void login() {

	}
	
	@PostMapping("/login")
	public void login(String userId, String userPw, Model model) {

		 
		 System.out.println("controller에 들어옴");
		 
		 System.out.printf("아이디:" + userId);
		 System.out.printf("비밀번호:" + userPw);
		 model.addAttribute("result", service.login(userId, userPw));

	}
	
//	-------------------------


    public String generateState()
	 {
    	SecureRandom random = new SecureRandom();
    	System.out.println(random);
    	return new BigInteger(130, random).toString(32);
	}

    
    
//    @GetMapping("/login/naver/{token}")
//    public static void tokenpass(@PathVariable String token) {
//    	System.out.println("access_token: " + token);
//    	
//    	sendData(token);
//    }
//    
//    public static void sendData(String data) {
//        // ReceiverClass의 인스턴스 생성
//    	ApiExamMemberProfile receiver = new ApiExamMemberProfile();
//
//        // 데이터를 받는 메서드 호출
//        receiver.main(data);
//    }
    
    @GetMapping("/login/naver/{data}")
    public static void info(@PathVariable String data) {
    	System.out.println("data " + data);

    }

	
}
