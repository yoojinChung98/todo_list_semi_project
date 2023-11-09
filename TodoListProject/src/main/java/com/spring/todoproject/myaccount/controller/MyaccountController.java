package com.spring.todoproject.myaccount.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.todoproject.main.service.MainService;
import com.spring.todoproject.myaccount.dto.ProfBoxDTO;
import com.spring.todoproject.myaccount.dto.UserInfoResponseDTO;
import com.spring.todoproject.myaccount.service.MyaccountService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/myaccount")
@RequiredArgsConstructor
@Slf4j
public class MyaccountController {
	
	@Autowired
	private final MyaccountService service;
	
	
	@GetMapping("")
	public ModelAndView goMyaccount(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		
		// 세션에 담긴 로그인 정보를 통해 유저아이디를 가져올 것.
		//String userId = (String) session.getAttribute("login");
		
		String userId = "id2";
		
		// 프로필 박스에 필요한 값을 "profBox" 라는 이름으로 담음
		ProfBoxDTO dto1 = service.getProfInfo(userId);
		mv.addObject("profBox", dto1);
		
		// 상세정보에 필요한 값을 ""라는 이름으로 담음
		UserInfoResponseDTO dto2 = service.getUserInfo(userId);
		mv.addObject("userInfo", dto2);
		
		mv.setViewName("/todok/myaccount");
		return mv;
	}
	
	
	
	
	
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


