package com.spring.todoproject.board.service;

import java.util.List;
import java.util.Map;

import com.spring.todoproject.board.dto.BoardLikeCountResponseDTO;
import com.spring.todoproject.board.dto.BoardListRequestDTO;
import com.spring.todoproject.board.dto.BoardRequestDTO;
import com.spring.todoproject.user.entity.User;


public interface IBoardService {
	void boardRegist(BoardRequestDTO dto); //board  등록

//	List<BoareListRequestDTO> getList(int page, int selectNum , String userId);

	List<BoardListRequestDTO> getList(Map<String, String> params);
	
	// 아이디 값을 통해서 닉네임 가져오기
	User getNickName(String userId);
	
	// like정보 업데이트
	BoardLikeCountResponseDTO likeUpdate(String userId, String likeFlag, String boardBno);

	
	
}
