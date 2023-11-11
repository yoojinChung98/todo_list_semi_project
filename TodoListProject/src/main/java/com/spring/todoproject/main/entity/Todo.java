package com.spring.todoproject.main.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
public class Todo {
	
	private int todoNo;
	private String userId;
	private LocalDateTime clickDate;
	private String todoContent;
	private int chkBtn;
	
	
	private LocalDateTime strToDate(String strDate) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        LocalDateTime ldt = LocalDateTime.parse(strDate, fmt);
        System.out.println("변환된 ldt값 : "+ldt);
        return ldt;
	}	
}
