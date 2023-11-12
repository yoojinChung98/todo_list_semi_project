package com.spring.todoproject.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString @EqualsAndHashCode
@Builder
public class BoardLikeCountResponseDTO {
	
	private String message;
	private int likeCount;
	private String likeFlag;

}
