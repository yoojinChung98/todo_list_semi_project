package com.spring.todoproject.board.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 CREATE TABLE board
(
    board_bno number NOT NULL,
    -- 모든 문자
    content varchar2(40) NOT NULL,
    -- 게시물 등록일자인데 시간도 표현해야함
    -- 
    board_regdate date DEFAULT SYSDATE NOT NULL,
    -- (영어 대,소)+ 숫자
    user_id varchar2(30) NOT NULL,
    PRIMARY KEY (board_bno)
);

 */

@Getter  @Setter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {


    private int boardBno;
    private String content;
    private LocalDateTime boardRegdate;
    private String userId;
}