package com.spring.todoproject.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.todoproject.main.dto.MostLikeRecomdResponseDTO;
import com.spring.todoproject.main.service.MainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("/todok")
@RequiredArgsConstructor
@Slf4j
public class MainController {
	
	@Autowired
	private final MainService service;
	
	@GetMapping("/main")
	public ModelAndView goMain() {
		ModelAndView mv = new ModelAndView();
		List<MostLikeRecomdResponseDTO> dto = service.showMostLike();
		mv.addObject("mostLike", dto);
		
		mv.setViewName("/todok/main");
		return mv;
	}
	
	
	
	
	@GetMapping("/main/mostlike")
	@ResponseBody
	public List<MostLikeRecomdResponseDTO> showMostLike() {
		log.info("/todok/main/mostlike : GET 요청");
		ModelAndView mv = new ModelAndView();
		
		
		List<MostLikeRecomdResponseDTO> dto = service.showMostLike();
		return dto;
	}
	

}
