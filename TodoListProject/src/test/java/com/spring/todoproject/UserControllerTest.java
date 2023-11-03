package com.spring.todoproject;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.spring.todoproject.user.entity.User;
import com.spring.todoproject.user.mapper.IUserMapper;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"
		,"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class UserControllerTest {

	@Autowired
	private IUserMapper mapper;
	
	@Test
	@DisplayName("기본값이 제공되는 것은 넣지 않고 제약조건 지키지 않았을 시에 실패")
	void insertUserDateTest() {
//		User user = User.builder()
//				.userId("aaa")
//				.userPw("aaa")
//				.name("aaa")
//				.nickName("aaa")
//				.email1("aaa")
//				.email2("aaa")
//				.profileColor("e2e2e2")
//				.build();
		mapper.insertUserData(User.builder()
				.userId("aaa")
				.userPw("aaa")
				.name("aaa")
				.nickName("aaa")
				.email1("aaa")
				.email2("aaa")
				.profileColor("e2e2e2")
				.build());
		
		assertFalse(false);
		
		
	}

}
