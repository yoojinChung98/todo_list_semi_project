package com.spring.todoproject.main.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.SecureRandom;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.todoproject.login.entity.UserInfo;
import com.spring.todoproject.login.service.LoginService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/todok")
@RequiredArgsConstructor
public class MainController {
	
	@GetMapping("/main")
	public void main() {

	}
	
	public static void main(String[] args) {
        String clientId = "YOUR_CLIENT_ID"; // 네이버 개발자 센터에서 발급받은 클라이언트 아이디
        String redirectUri = "YOUR_REDIRECT_URI"; // 네이버 개발자 센터에서 등록한 콜백 URL
        String state = generateState(); // 상태 토큰 생성

        String authenticationRequest = buildAuthenticationRequest(clientId, redirectUri, state);

        System.out.println("네이버 인증 요청문: " + authenticationRequest);
    }

    private static String generateState() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }

    private static String buildAuthenticationRequest(String clientId, String redirectUri, String state) {
        try {
            String encodedRedirectUri = URLEncoder.encode(redirectUri, "UTF-8");
            return "https://nid.naver.com/oauth2.0/authorize" +
                    "?client_id=" + clientId +
                    "&response_type=code" +
                    "&redirect_uri=" + encodedRedirectUri +
                    "&state=" + state;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
	

	


}
