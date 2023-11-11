package com.spring.todoproject.main.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.spring.todoproject.main.dto.MostLikeRecomdResponseDTO;
import com.spring.todoproject.main.mapper.IWeatherMapper;
import com.spring.todoproject.main.service.MainService;
//import com.spring.todoproject.main.service.WeatherService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("/main")
@RequiredArgsConstructor
@Slf4j
public class MainController {
	
	@Autowired
	// 메인 페이지 서비스
	private final MainService service;
	
//	@Autowired
//	private final WeatherService serviceW;
	
	@Autowired
	private final IWeatherMapper mapper;
	
	@GetMapping("")
	public ModelAndView goMain() {
		ModelAndView mv = new ModelAndView();
		List<MostLikeRecomdResponseDTO> dto = service.showMostLike();
		
		mv.addObject("mostLike", dto);
		mv.setViewName("/todok/main");
		return mv;
	}
	
	
	
	// 이거 스크립트부분 비동기통신용 메서드
	@GetMapping("/mostlike")
	@ResponseBody
	public Map<String, Object> showMostLike() {
		Map<String, Object> mv = new HashMap<>();
		List<MostLikeRecomdResponseDTO> dto = service.showMostLike();
		mv.put("mostLike", dto);
		
		return mv;
	}
	
	// 닉네임을 가져오는 메서드
	@GetMapping("/nickname/{userId}")
	@ResponseBody
	public String getNickname(@PathVariable String userId ) {
		Map<String, Object> mv = new HashMap<>();
		return service.getNickname(userId);
	}
	
	
	

	
	
	

}