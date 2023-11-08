package com.spring.todoproject.myaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.todoproject.main.service.MainService;
import com.spring.todoproject.myaccount.service.MyaccountService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/todok")
@RequiredArgsConstructor
@Slf4j
public class MyaccountController {
	
	@Autowired
	private final MyaccountService service;
	
	
	@GetMapping("/myaccount")
	public ModelAndView goMyaccount() {
		ModelAndView mv = new ModelAndView();
		
		// 1. 사용자 정보 받아오기
		
		// 2. 유저 정보 받아오기
		
//		List<MostLikeRecomdResponseDTO> dto = service.showMostLike();
//		mv.addObject("mostLike", dto);
		log.info("여기는 컨트롤러");
		
		service.get
		
		
		mv.setViewName("/todok/myaccount");
		return mv;
	}
	
	
	
//	// 이거 스크립트부분 비동기통신용 메서드이긴 한데,, 음,,, 일단 main으로 몰아놓아서 필요는 없긴 함.
//	@GetMapping("/main/mostlike")
//	@ResponseBody
//	public List<MostLikeRecomdResponseDTO> showMostLike() {
//		log.info("/todok/main/mostlike : GET 요청");
//		ModelAndView mv = new ModelAndView();
//		
//		
//		List<MostLikeRecomdResponseDTO> dto = service.showMostLike();
//		return dto;
//	}
	

	

}


