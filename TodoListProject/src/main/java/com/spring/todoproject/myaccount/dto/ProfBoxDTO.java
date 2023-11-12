package com.spring.todoproject.myaccount.dto;

import lombok.ToString;

import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @Setter @ToString @EqualsAndHashCode
@AllArgsConstructor @NoArgsConstructor
@Builder
public class ProfBoxDTO {
	
	private String profileColor;
	private String nickname;
	private int boardCnt;
	private int boardLikeCnt;
	

}
