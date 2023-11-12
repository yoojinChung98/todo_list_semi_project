package com.spring.todoproject.main.controller;


import java.io.UnsupportedEncodingException;
import java.lang.ProcessBuilder.Redirect;
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


import com.spring.todoproject.login.service.LoginService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/todok")
@RequiredArgsConstructor
public class MainController {
	
	
	@GetMapping("/main")
	public void main() {

	}
	
	
	

	


}
