package cw.studyPJ.daoLogic;

import org.apache.ibatis.session.SqlSession;

import cw.studyPJ.Factory.ConnectionFactory;
import cw.studyPJ.Mapper.UserMapper;
import cw.studyPJ.dao.UserDao;
import cw.studyPJ.domain.User;

public class UserDaoLogic implements UserDao{

	@Override
	public User retrieve(String userId) {
		
		ConnectionFactory conn = ConnectionFactory.getInstance();
		SqlSession session = conn.sqlSessionConnect();
		
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.retrieve(userId);
		session.close();
		
		return user;
	}

}
