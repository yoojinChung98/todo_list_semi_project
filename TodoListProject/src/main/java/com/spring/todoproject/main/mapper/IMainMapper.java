package com.spring.todoproject.main.mapper;

import java.util.List;

import com.spring.todoproject.main.dto.MostLikeRecomdResponseDTO;

public interface IMainMapper {

	
	// 가장 많은 좋아요를 받은 추천 board_bno 3개 추출
	List<MostLikeRecomdResponseDTO> mostLikeBno ();

	// 매개값으로 받은 board_bno의 사용자의 프로필컬러 hex, bno, user_id, board_content 값 받아오기
	MostLikeRecomdResponseDTO getMostLikeData (int boardBno);
	
	
}
