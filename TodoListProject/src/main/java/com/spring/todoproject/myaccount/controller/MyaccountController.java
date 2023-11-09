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
	
	
//	@GetMapping("/myaccount")
//	public ModelAndView goMyaccount() {
//		ModelAndView mv = new ModelAndView();
//		
//		log.info("여기는 컨트롤러로 넘어옴, 이제 서비스부르고 프로필정보/계정정보 값 받아서 뿌려줄거임.");
//		
//		service.getProfInfo(userID);
//		
//		
//		mv.setViewName("/todok/myaccount");
//		return mv;
//	}
	
	
	
	
	
	// 여기는 일단 죽여놓은 부분
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


