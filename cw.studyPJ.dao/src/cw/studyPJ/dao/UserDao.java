package cw.studyPJ.dao;

import cw.studyPJ.domain.User;

/**
 * @author Chiwon
 * <pre>
 * 		Mapper : User
 * </pre>
 *
 */
public interface UserDao {
	
	public User retrieve(String userId);
}
