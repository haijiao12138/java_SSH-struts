package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.sikiedu.bean.Country;
import com.sikiedu.bean.CountryVo;
import com.sikiedu.bean.User;
import com.sikiedu.bean.UserVo;
import com.sikiedu.mapper.CountryMapper;
import com.sikiedu.mapper.UserMapper;

public class MapperTest {

	@Test
	public void Test1() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 创建一个sqlSessionfactory,用一行合并
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		User user = mapper.selectUserById(1);
		System.out.println(user);

	}

	@Test
	public void Test2() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 创建一个sqlSessionfactory,用一行合并
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		List<User> list = mapper.selectUserByName("王");
		// 遍历
		for (User u : list) {
			System.out.println(u);
		}

	}

	// 通过UserVo id去查询
	@Test
	public void Test_selectUserByUserVold() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 创建一个sqlSessionfactory,用一行合并
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		UserVo vo = new UserVo();
		User u = new User();
		u.setU_id(5);
		// vo.setUser(u);
		User user = mapper.selectUserByUserVold(vo);

		System.out.println(user);

	}

	// 输出映射 查询用户总条数
	// 通过UserVo id去查询
	@Test
	public void Test_selectUserCount() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 创建一个sqlSessionfactory,用一行合并
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		Integer count = mapper.selectUserCount();
		System.out.println(count);
	}

	// 手动映射查询

	// 输出映射 查询用户总条数
	// 通过UserVo id去查询
	@Test
	public void Test_selectAll() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 创建一个sqlSessionfactory,用一行合并
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		CountryMapper mapper = session.getMapper(CountryMapper.class);

		List<Country> list = mapper.selectAll();
		for (Country country : list) {
			System.out.println(country);
		}

	}

	// 一对多关系数据库查询
	@Test
	public void Test_selectAllUserVo() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 创建一个sqlSessionfactory,用一行合并
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		List<UserVo> list = mapper.selectAllUserVo();
		for (UserVo userVo : list) {
			System.out.println(userVo);
		}

	}

	@Test
	public void Test_selectAllCountryVo() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 创建一个sqlSessionfactory,用一行合并
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		CountryMapper mapper = session.getMapper(CountryMapper.class);
		List<CountryVo> list = mapper.selectAllCountryVo();
		for (Country countryVo : list) {
			System.out.println(countryVo);
		}
	}

	// 模糊查询
	@Test
	public void Test_selectUserListByUser() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 创建一个sqlSessionfactory,用一行合并
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		User u = new User();
		u.setU_sex("1");
		u.setU_username("王");
		u.setU_id(1);

		List<User> list = mapper.selectUserListByUser(u);
		for (User user : list) {
			System.out.println(user);
		}
	}

	// Trim
	@Test
	public void Test_selectUserListByUserTrim() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 创建一个sqlSessionfactory,用一行合并
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		User u = new User();
		u.setU_sex("1");
		u.setU_username("王");
		u.setU_id(1);

		List<User> list = mapper.Test_selectUserListByUserTrim(u);
		for (User user : list) {
			System.out.println(user);
		}
	}

	// set标签
	@Test
	public void Test_updateSetUser() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 创建一个sqlSessionfactory,用一行合并
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		User u = new User();
		u.setU_id(1);
		u.setU_sex("1");
		u.setU_username("隔壁老王");
		u.setU_password("aaa");

		mapper.updateSetUser(u);// 没有commit不会提交到数据库
		session.commit();// 进行提交一下,使用set标签解决更新数据表时解决逗号的拼接问题
	}

	// 使用多个id获取用户列表
	@Test
	public void selectUserListByIds() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 创建一个sqlSessionfactory,用一行合并
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		Integer[] ids = { 1, 3, 5, 7 };

		List<User> list = mapper.selectUserListByIds(ids);
		for (User user : list) {
			System.out.println(user);
		}

		// session.commit();//进行提交一下,使用set标签解决更新数据表时解决逗号的拼接问题
	}

	// selectUserListByList
	// 使用多个id获取用户列表
	@Test
	public void selectUserListByList() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 创建一个sqlSessionfactory,用一行合并
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		List<Integer> idList = new ArrayList<Integer>();
		idList.add(1);
		idList.add(4);
		idList.add(8);

		List<User> list = mapper.selectUserListByList(idList);
		for (User user : list) {
			System.out.println(user);
		}

	}

	// 使用多个id获取用户列表
	@Test
	public void slectUserListByUserVo() throws IOException {
		// 文件路径获取
		String resource = "sqlMapConfig.xml";
		// 读取配置文件,mybatis包提供了方法
		InputStream in = Resources.getResourceAsStream(resource);

		// 创建一个sqlSessionfactory,用一行合并
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// 需要配置文件

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		List<Integer> idList = new ArrayList<Integer>();
		idList.add(1);
		idList.add(4);
		idList.add(8);

		UserVo vo = new UserVo();
		vo.setIdList(idList);
		List<User> list = mapper.slectUserListByUserVo(vo);
		for (User user : list) {
			System.out.println(user);
		}

	}
}
