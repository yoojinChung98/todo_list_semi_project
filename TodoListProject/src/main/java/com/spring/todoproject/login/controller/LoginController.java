package com.spring.todoproject.login.controller;



import javax.mail.Session;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.todoproject.login.naver.NaverLoginRequestDTO;
import com.spring.todoproject.login.service.LoginService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/todok")
@RequiredArgsConstructor
@Slf4j
public class LoginController {

	private final LoginService service;
	private final ApiExamMemberProfile apiExamMemberProfile;
	
	
	@GetMapping("/login")
	public void login() {

	}
	
	/*
	@GetMapping("/main")
	public void main(HttpSession session, Model model) {
		//마이페이지는 로그인 한 사람만 이동 가능 -> 세션에 아이디가 있다!
		String id = (String) session.getAttribute("login");
		model.addAttribute("userInfo", id);
	}
	*/
	
	@PostMapping("/login")
	public void login(String userId, String userPw, Model model, HttpSession session) {

		 
		 System.out.println("controller에 들어옴");
		 
		 System.out.printf("아이디:" + userId);
		 System.out.printf("비밀번호:" + userPw);
		 model.addAttribute("result", service.login(userId, userPw));
		 String res = service.login(userId, userPw);
		 
		 if(res.equals("Success")) {
			 session.setAttribute("userId", userId);
		 }


	}
	


    
    
    @GetMapping("/login/naver/{token}")
    public void tokenpass(@PathVariable String token, HttpSession session) {
    	System.out.println("access_token: " + token);
    	
    	String naverDto = naver(apiExamMemberProfile.parseJsonData(token));
    	System.out.println("aaaaaaaaaaa: " + naverDto);
    	
    	session.setAttribute("uesrId", naverDto);
    	
 
    }
    

    
    
    



	public String naver(NaverLoginRequestDTO dto) {

		log.info(dto.toString());
		
				
		String naverDto = service.naverlogin(dto.getId(), dto.getToken(), dto.getName(), dto.getNickname(), dto.getEmail1(), dto.getEmail2(), dto.getProfile_color());

		return naverDto;
		

	

	}
	
	


    

    


	
}
