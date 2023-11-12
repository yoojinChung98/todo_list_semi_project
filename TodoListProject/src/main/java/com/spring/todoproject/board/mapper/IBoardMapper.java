package com.spring.todoproject.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.todoproject.board.dto.BoardListRequestDTO;
import com.spring.todoproject.board.dto.page.Page;
import com.spring.todoproject.board.entity.Board;
import com.spring.todoproject.user.entity.User;

public interface IBoardMapper {
	
	
	void boardRegist(Board board); //board  등록
	
	// 최신순 보드 list + 좋아요 count
	List<BoardListRequestDTO> boardListNew(@Param("paging") Page page, @Param("userId") String userId);
	
	// 인기순 보드 list + 좋아요 count
	List<BoardListRequestDTO> boardListBest(@Param("paging") Page page, @Param("userId") String userId);

	// 아이디 값으로 닉네임 가져오기
	User getNickName(String userId);
	
	//like 누른 경우
	void deleteClickLike(@Param("userId") String userId, @Param("boardBno")  String boardBno); 
	
	//like 안 누른 경우
	void insertClickLike(@Param("userId") String userId, @Param("boardBno") String boardBno);  
	
	// 좋아요 count값 가져오기
	int getLikeCount(@Param("boardBno") String boardBno);
	
	// 좋아요 눌렀는지 확인하는 flag~
	String getLikeFlag(@Param("userId") String userId, @Param("boardBno") String boardBno);
	
}
