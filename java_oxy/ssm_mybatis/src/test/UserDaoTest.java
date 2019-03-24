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
	// sqlSession工厂
	private static SqlSessionFactory ssf;

	// 生成构造器
	// public UserDaoTest(SqlSessionFactory ssf) {
	// super();
	// this.ssf = ssf;
	// }
	static {// 目的:获取SqlSessionFactory
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in;

		try {
			in = Resources.getResourceAsStream(resource);
			// 需要sqlSessionFactoryBuilder
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();

			// 创建一个sqlSessionfactory
			ssf = ssfb.build(in);// 需要配置文件
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
