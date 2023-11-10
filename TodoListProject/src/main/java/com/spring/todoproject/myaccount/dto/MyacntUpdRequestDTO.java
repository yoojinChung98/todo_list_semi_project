package com.spring.todoproject.myaccount.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Builder
public class MyacntUpdRequestDTO {

	private String userId;
	private String name;
	private String nickName;
	private String email;
	private String profileColor;
	private String userPw;
	
	
}
