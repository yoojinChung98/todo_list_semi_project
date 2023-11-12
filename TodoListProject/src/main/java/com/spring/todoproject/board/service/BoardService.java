package com.spring.todoproject.board.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.todoproject.board.dto.BoardLikeCountResponseDTO;
import com.spring.todoproject.board.dto.BoardListRequestDTO;
import com.spring.todoproject.board.dto.BoardRequestDTO;
import com.spring.todoproject.board.dto.page.Page;
import com.spring.todoproject.board.mapper.IBoardMapper;
import com.spring.todoproject.user.entity.User;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class BoardService  implements IBoardService{

	@Autowired
	private final IBoardMapper mapper;

	@Override
	public void boardRegist(BoardRequestDTO dto) {
		mapper.boardRegist(dto.toEntity(dto));

	}


	@Override
	public List<BoardListRequestDTO> getList(Map<String, String> params) {


		String page = params.get("page");
		int pageNumber;
		try {
			pageNumber = Integer.parseInt(page);
		} catch (NumberFormatException e) {
			// 문자열이 유효한 정수가 아닌 경우 예외 처리
			pageNumber = 0; // 또는 기본값 또는 다른 오류 처리 로직을 수행
		}

		String selectNum = params.get("selectNum");
		int selNum;
		try {
			selNum = Integer.parseInt(selectNum);
		} catch (NumberFormatException e) {
			// 문자열이 유효한 정수가 아닌 경우 예외 처리
			System.out.println("혹시 여기 들어오니????? " );
			selNum = 1; // 또는 기본값 또는 다른 오류 처리 로직을 수행
		}

		String userId = params.get("userId");


		List<BoardListRequestDTO> dtolist = new ArrayList<>();
		if(selNum == 2 ) {

			dtolist = mapper.boardListBest
					(Page.builder()
							.pageNo(pageNumber)
							.amount(5)
							.build()
							, userId);
			
			return dtolist;

		} else {
			dtolist = mapper.boardListNew
					(Page.builder()
							.pageNo(pageNumber)
							.amount(5)
							.build()
							, userId);
			
			return dtolist;
		}

	}

	@Override
	public User getNickName(String userId) {
		return mapper.getNickName(userId);
	}

	@Override
	public BoardLikeCountResponseDTO likeUpdate(String userId, String likeFlag, String boardBno) {
		
		if(likeFlag.equals("0")) {
			mapper.insertClickLike(userId, boardBno);
			mapper.getLikeCount(boardBno);
			String mlikeFlag = mapper.getLikeFlag(userId, boardBno);
			
			if(mlikeFlag == null) {
				mlikeFlag = "0";
			}

			log.info("userId: {}",userId);
			BoardLikeCountResponseDTO dto = BoardLikeCountResponseDTO.builder()
					.message("InsertSuccess")
					.likeCount(mapper.getLikeCount(boardBno))
					.likeFlag(mlikeFlag)
					.build();

			return dto;
		}else {
			//like 눌러놓은 경우 -> delete
			mapper.deleteClickLike(userId, boardBno);
			mapper.getLikeCount(boardBno);
			String mlikeFlag = mapper.getLikeFlag(userId, boardBno);
			
			//like 안 눌러놓은 경우 -> insert
			if(mlikeFlag == null) {
			
				mlikeFlag = "0";
			}

			log.info("userId: {}",userId);
			BoardLikeCountResponseDTO dto = BoardLikeCountResponseDTO.builder()
					.message("DeleteSuccess")
					.likeCount(mapper.getLikeCount(boardBno))
					.likeFlag(mlikeFlag)
					.build();

			return dto;
		}
	}




}
