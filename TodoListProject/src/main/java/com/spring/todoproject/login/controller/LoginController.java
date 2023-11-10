package com.spring.todoproject.login.controller;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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
	
	@PostMapping("/login")
	public void login(String userId, String userPw, Model model) {

		 
		 System.out.println("controller에 들어옴");
		 
		 System.out.printf("아이디:" + userId);
		 System.out.printf("비밀번호:" + userPw);
		 model.addAttribute("result", service.login(userId, userPw));

	}
	
//	-------------------------


//    public String generateState()
//	 {
//    	SecureRandom random = new SecureRandom();
//    	System.out.println(random);
//    	return new BigInteger(130, random).toString(32);
//	}

    
    
    @GetMapping("/login/naver/{token}")
    public void tokenpass(@PathVariable String token) {
    	System.out.println("access_token: " + token);
    	
    	naver(apiExamMemberProfile.parseJsonData(token));
    }
    
    /*
    @GetMapping("/login/naverdel/{tokendel}")
    public void naverdel(@PathVariable String tokendel) {
    	System.out.println("access_token: " + tokendel);
    	
    	String apiUrl = "https://nid.naver.com/oauth2.0/token?grant_type=delete&client_id="+"W7Mq7kXYF3dBqzpj2kxG"+
        		"&client_secret="+"hhpMdDjGMX"+"&access_token="+tokendel.replaceAll("'", "")+"&service_provider=NAVER";
		
		try {
			String res = requestToServer(apiUrl);
			model.addAttribute("res", res); //결과값 찍어주는용
		    session.invalidate();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    */
    
    
    


//	public String naver(String id, String nickname, String email, String name, String token) {
	public void naver(NaverLoginRequestDTO dto) {
		

//		System.out.println(id == null);
//		System.out.println(token == null);
//		System.out.println(nickname == null);
//		System.out.println(email == null);
//		System.out.println(name == null);
//		System.out.println("id-----------" + dto.getId());
//		System.out.println("tokenpw-----------" + dto.getToken());
//		System.out.println("nickname-----------" + nickname);
//		System.out.println("email-----------" + email);
//		System.out.println("name-----------" + name);
		log.info(dto.toString());

				
		service.naverlogin(dto.getId(), dto.getToken(), dto.getName(), dto.getNickname(), dto.getEmail());
//		service.naverlogin(idi);

	}


    
 /*  
	private String requestToServer(String apiURL, String headerStr) throws IOException {
	    URL url = new URL(apiURL);
	    HttpURLConnection con = (HttpURLConnection)url.openConnection();
	    con.setRequestMethod("GET");
	    System.out.println("header Str: " + headerStr);
	    if(headerStr != null && !headerStr.equals("") ) {
	      con.setRequestProperty("Authorization", headerStr);
	    }
	    int responseCode = con.getResponseCode();
	    BufferedReader br;
	    System.out.println("responseCode="+responseCode);
	    if(responseCode == 200) { // 정상 호출
	      br = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    } else {  // 에러 발생
	      br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
	    }
	    String inputLine;
	    StringBuffer res = new StringBuffer();
	    while ((inputLine = br.readLine()) != null) {
	      res.append(inputLine);
	    }
	    br.close();
	    if(responseCode==200) {
	    	String new_res=res.toString().replaceAll("&#39;", "");
			 return new_res; 
	    } else {
	      return null;
	    }
	  }
	  */
    


	
}
