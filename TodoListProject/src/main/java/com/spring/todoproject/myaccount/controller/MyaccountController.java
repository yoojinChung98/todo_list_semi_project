package com.spring.todoproject.myaccount.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.todoproject.login.controller.ApiExamMemberProfile;
import com.spring.todoproject.login.service.LoginService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/todok")
@RequiredArgsConstructor
public class MyaccountController {
	
	@GetMapping("/myaccount")
	public void login() {

	}

}
