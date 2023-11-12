//package com.spring.todoproject.main.service;
//
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.net.URLEncoder;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.util.UriComponents;
//import org.springframework.web.util.UriComponentsBuilder;
//
//import com.spring.todoproject.main.mapper.IWeatherMapper;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//
//@Service
//@Slf4j
//@RequiredArgsConstructor
//public class WeatherService {
//	
//	private final IWeatherMapper mapper;
//	
//	// properties에 작성된 값을 읽어오는 아노테이션임
//	@Value("${weather.serviceKey}")
//	private String serviceKey;
//	@Value("${weather.reqUrl}")
//	private String reqUrl;
//
//	public void getWeather(String latitude, String longitude) {
//		
//		LocalDateTime ldt = LocalDateTime.now();
//		String baseDate = DateTimeFormatter.ofPattern("YYYYMMdd").format(ldt);
//		log.info("여기는 서비스W! baseDate: {}", baseDate);
//		
//		// 여기서는 통신해서 값을 받아와야 함!!
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		headers.set("Accept", "*/*;q=0.9"); // HTTP_ERROR 방지
//		
//		//Uri 생성
//		UriComponents builder = UriComponentsBuilder.fromHttpUrl(reqUrl)
//				.queryParam("serviceKey", serviceKey)
//				.queryParam("pageNo", 1)
//				.queryParam("numOfRows", "200")
//                .queryParam("dataType", "JSON")
//                .queryParam("base_date", baseDate)
//                .queryParam("base_time", "0200")
//                .queryParam("nx", String.valueOf(longitude))
//                .queryParam("ny", String.valueOf(latitude))
//                .build();
//// 		이거 위경도 nx ny 좌표로 변환하다 포기함. 나머지부분 필요하면 디스코드 쌤이 보내주신 코드로 짜면 됨.
//		log.info("완성된 url: {}", builder.toString());
//		
//		// REST 방식의 통신
//		RestTemplate template = new RestTemplate();
//		HttpEntity<Object> requestEntity = new HttpEntity<>(headers);
//		ResponseEntity<Map> responseEntity = template.exchange(builder.toUriString(), null)
//		
//		
//	}
//	
//	
//	
//
//}
