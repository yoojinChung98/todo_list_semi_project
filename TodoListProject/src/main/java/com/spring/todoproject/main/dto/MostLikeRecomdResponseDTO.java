package com.spring.todoproject.main.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @EqualsAndHashCode @ToString
@RequiredArgsConstructor @AllArgsConstructor
@Builder
public class MostLikeRecomdResponseDTO {
	
	// 매개값으로 받은 board_bno의 사용자의 프로필컬러 hex, user_id, board_content 값을 받아오는 서비스
	private String profileColor;
	private int boardBno;
	private String userId;
	private String content;
	private int boardLikeCnt;

}
