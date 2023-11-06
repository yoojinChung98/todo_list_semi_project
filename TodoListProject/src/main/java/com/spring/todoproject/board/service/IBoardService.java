package com.spring.todoproject.board.service;

import com.spring.todoproject.board.dto.BoardInsertRequestDTO;

//sample : IFreeBoardService.java
public interface IBoardService {
	
		//글 등록
		void insertBoard(BoardInsertRequestDTO dto);

		//글 목록
		void BoardGetList();
		
		//총 게시물 개수
		int BoardGetTotal();
		
		
		//상세보기
		void BoardGetContent(int boardBno);
		
		//수정
		void BoardUpdate();
		
		//삭제
		void BoardDelete(int boardBno);


}
