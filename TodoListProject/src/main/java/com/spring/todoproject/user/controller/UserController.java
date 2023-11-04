package com.spring.todoproject.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.todoproject.user.entity.User;
import com.spring.todoproject.user.service.IUserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
	
	@Autowired
	private final IUserService service;
	
	@GetMapping("/test1")
	public String insertUserDate() {
		service.insertUserData(User.builder()
				.userId("bbb")
				.userPw("aaa")
				.name("최정현")
				.nickName("aaa")
				.email1("aaa")
				.email2("aaa")
				.build());
		
		return "todok/test1";
	}
	
	@PostMapping
	
	
}
