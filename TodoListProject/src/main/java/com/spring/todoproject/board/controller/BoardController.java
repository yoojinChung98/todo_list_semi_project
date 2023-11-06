package com.spring.todoproject.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.todoproject.board.service.IBoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
	private final IBoardService service;
	
	//목록 화면
		@PostMapping("/insert")
		public String boardList() {
			System.out.println("/todok/board :post! ");
//			PageCreator creator;
//			int totalCount = service.getTotal(page);
//			if(totalCount == 0) {
//				page.setKeyword(null);
//				page.setCondition(null);
//				creator = new PageCreator(page,service.getTotal(page));
//				model.addAttribute("msg","searchFail");
//			} else {
//				creator = new PageCreator(page,totalCount);
//			}
//			
//			model.addAttribute("boardList",service.getList(page));
//			model.addAttribute("pc",creator);
//			

			return "todok/board";
		}
}
