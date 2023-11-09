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
@RequestMapping("/todok")
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
	
	@GetMapping("/main")
	public ModelAndView goMain() {
		ModelAndView mv = new ModelAndView();
		List<MostLikeRecomdResponseDTO> dto = service.showMostLike();
		
		mv.addObject("mostLike", dto);
		
		mv.setViewName("/todok/main");
		return mv;
	}
	
	
	
	// 이거 스크립트부분 비동기통신용 메서드이긴 한데,, 음,,, 일단 main으로 몰아놓아서 필요는 없긴 함.
	@GetMapping("/main/mostlike")
	@ResponseBody
	public List<MostLikeRecomdResponseDTO> showMostLike() {
		log.info("/todok/main/mostlike : GET 요청");
		ModelAndView mv = new ModelAndView();
		
		
		List<MostLikeRecomdResponseDTO> dto = service.showMostLike();
		return dto;
	}
	
//	// 날씨 요청 한번 따로 만들어보는 상태
//	@GetMapping("/main/weather/{latitude}/{longitude}")
//	@ResponseBody
//	public HashMap<String, Object> getWeather(@PathVariable String latitude, @PathVariable String longitude ) {
//		
//		log.info("여기는 컨트롤러~"+latitude+longitude);
//		??? serviceW.getWeather(latitude, longitude);
//		
//		return null;
//		
// 		이거 위경도 nx ny 좌표로 변환하다 포기함. 나머지부분 필요하면 디스코드 쌤이 보내주신 코드로 짜면 됨.
//		
//		// RestTemplate을 이용하여 api 요청 시작.	
//	}
	
	

}
