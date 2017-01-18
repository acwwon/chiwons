package cw.studyPJ.Factory;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConnectionFactory {
	//
	private ConnectionFactory() {}
	
	private static class singleTone {
		private static final ConnectionFactory conn = new ConnectionFactory();
	}
	
	public static ConnectionFactory getInstance() {
		return singleTone.conn;
	}
	
	public SqlSession sqlSessionConnect() {
		//
		InputStream is = null;
		try {
			//
			is = Resources.getResourceAsStream("mybatis-config.xml");
		} catch (IOException e) {
			//
			System.out.println("============================================================");
			System.out.println("에러 메세지 : mybatis-config.xml 입출력 오류가 발생했습니다 파일을 확인해 주세요.");
			System.out.println("============================================================");
			e.printStackTrace();
		}
		//
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession(true);
		
		return session;
	}
}
