package test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.sikiedu.bean.User;

import dao.UserDao;
import dao.UserDaoImpl;

public class UserDaoTest {
	// sqlSession����
	private static SqlSessionFactory ssf;

	// ���ɹ�����
	// public UserDaoTest(SqlSessionFactory ssf) {
	// super();
	// this.ssf = ssf;
	// }
	static {// Ŀ��:��ȡSqlSessionFactory
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in;

		try {
			in = Resources.getResourceAsStream(resource);
			// ��ҪsqlSessionFactoryBuilder
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();

			// ����һ��sqlSessionfactory
			ssf = ssfb.build(in);// ��Ҫ�����ļ�
			in.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Test
	public void DaoTest() {
		UserDao dao = new UserDaoImpl(ssf);
		User user = dao.getUserById(1);
		System.out.println(user);
	}

}
