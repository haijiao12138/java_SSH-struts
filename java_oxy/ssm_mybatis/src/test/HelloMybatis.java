package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.sikiedu.bean.User;

import oracle.net.aso.o;

public class HelloMybatis {

	// 测试方法,添加注解
	@Test
	// 入门程序,通过id查询用户
	public void Test1() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 需要sqlSessionFactoryBuilder
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();

		// 创建一个sqlSessionfactory
		SqlSessionFactory ssf = ssfb.build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		// 操作数据库
		// 参数1:需要操作的SQL语句 参数2:sql语句的参数
		// 准备接受工作,返回一个对象,用user接受
		User user = session.selectOne("UserMapper.selectUserById", 1);// 前面一个参数是代用,后面一个是占位符 ,表示id为1
		System.out.println(user);
	}

	@Test
	// 入门程序,通过id查询用户
	public void Test2() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 需要sqlSessionFactoryBuilder
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();

		// 创建一个sqlSessionfactory
		SqlSessionFactory ssf = ssfb.build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		// 操作数据库
		// 参数1:需要操作的SQL语句 参数2:sql语句的参数
		// 准备接受工作,返回一个对象,用user接受
		List<User> list = session.selectList("UserMapper.selectUserByName", "王");// 前面一个参数是代用,后面一个是占位符 ,表示id为1
		for(User u:list) {
			System.out.println(u);
		}
	}
	//添加用户
	@Test
	// 入门程序,通过id查询用户
	public void Test3() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 需要sqlSessionFactoryBuilder
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();

		// 创建一个sqlSessionfactory
		SqlSessionFactory ssf = ssfb.build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		// 操作数据库
		// 参数1:需要操作的SQL语句 参数2:sql语句的参数
		// 准备接受工作,返回一个对象,用user接受
		User user=new User();
		user.setU_username("小明123");
		user.setU_password("123123");
		user.setU_sex("1");
		user.setU_createTime(new Date());
		user.setU_cid(1);
		session.insert("UserMapper.insertUser", user);// 前面一个参数是代用,后面一个是占位符 ,表示id为1
		
		//需要commit
		session.commit();
	}
	
	//修改用户
	@Test
	// 入门程序,通过id查询用户
	public void Test4() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 需要sqlSessionFactoryBuilder
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();

		// 创建一个sqlSessionfactory
		SqlSessionFactory ssf = ssfb.build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		// 操作数据库
		// 参数1:需要操作的SQL语句 参数2:sql语句的参数
		// 准备接受工作,返回一个对象,用user接受
		User user=new User();
		user.setU_id(13);
		user.setU_username("小刚");

		session.update("UserMapper.updateUser", user);// 前面一个参数是代用,后面一个是占位符 ,表示id为1
		
		//需要commit
		session.commit();
	}
	
	//根据id删除用户
		@Test
		// 入门程序,通过id删除用户
		public void Test5() throws IOException {
			// 文件路径获取
			String resource = "sqlMapConfig.xml";
			// 读取配置文件,mybatis包提供了方法
			InputStream in = Resources.getResourceAsStream(resource);

			// 需要sqlSessionFactoryBuilder
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();

			// 创建一个sqlSessionfactory
			SqlSessionFactory ssf = ssfb.build(in);// 需要配置文件

			// 生产一个sqlSession
			SqlSession session = ssf.openSession();

			// 操作数据库
			// 参数1:需要操作的SQL语句 参数2:sql语句的参数
			// 准备接受工作,返回一个对象,用user接受
		
			
			session.delete("UserMapper.deleteUserByid", 14);// 前面一个参数是代用,后面一个是占位符 ,表示id为1
			
			//需要commit
			session.commit();
		}
}
