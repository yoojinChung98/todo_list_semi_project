package com.spring.todoproject.myaccount.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {

	private String userId;
	private String userPw;
	private String name;
	private String nickName;
	private String email1;
	private String email2;
	private String profileColor;

}