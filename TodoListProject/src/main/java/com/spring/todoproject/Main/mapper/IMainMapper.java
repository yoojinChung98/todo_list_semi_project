package com.spring.todoproject.Main.mapper;

public interface IMainMapper {

	//클릭한 날짜에 투두 리스트 등록
	void insertTodo();
	
	//클릭한 날짜의 작성 되어 있던 투두 불러오기
	void selectDayTodoList();
	
	//선택한 투두리스트 삭제하기
	void deleteTodo();
	
	//오른쪽에 위치한 투두에서 내 투두리스트로 추가
	void updateRecommendTodo();
	
	
}
