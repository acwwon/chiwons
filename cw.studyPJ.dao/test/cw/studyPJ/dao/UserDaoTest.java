package cw.studyPJ.dao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import cw.studyPJ.daoLogic.UserDaoLogic;
import cw.studyPJ.domain.User;

public class UserDaoTest {
	
	private UserDao userDao = new UserDaoLogic();
	
	@Test
	public void userRetrieve(){
		
		System.out.println("========UserDao TEST========");
		User user;
		
		user = userDao.retrieve("U0001");
		
		System.out.println("userId : "+ user.getUserId());
		System.out.println("name : " + user.getName());
		System.out.println("id : " + user.getId());
		System.out.println("password : " + user.getPassword());
		System.out.println("img : " + user.getImg());
		
		assertNotNull(user);
	}
}
