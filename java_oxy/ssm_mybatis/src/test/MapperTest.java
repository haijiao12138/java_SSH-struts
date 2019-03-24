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
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ����һ��sqlSessionfactory,��һ�кϲ�
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		User user = mapper.selectUserById(1);
		System.out.println(user);

	}

	@Test
	public void Test2() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ����һ��sqlSessionfactory,��һ�кϲ�
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		List<User> list = mapper.selectUserByName("��");
		// ����
		for (User u : list) {
			System.out.println(u);
		}

	}

	// ͨ��UserVo idȥ��ѯ
	@Test
	public void Test_selectUserByUserVold() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ����һ��sqlSessionfactory,��һ�кϲ�
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		UserVo vo = new UserVo();
		User u = new User();
		u.setU_id(5);
		// vo.setUser(u);
		User user = mapper.selectUserByUserVold(vo);

		System.out.println(user);

	}

	// ���ӳ�� ��ѯ�û�������
	// ͨ��UserVo idȥ��ѯ
	@Test
	public void Test_selectUserCount() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ����һ��sqlSessionfactory,��һ�кϲ�
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		Integer count = mapper.selectUserCount();
		System.out.println(count);
	}

	// �ֶ�ӳ���ѯ

	// ���ӳ�� ��ѯ�û�������
	// ͨ��UserVo idȥ��ѯ
	@Test
	public void Test_selectAll() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ����һ��sqlSessionfactory,��һ�кϲ�
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();

		CountryMapper mapper = session.getMapper(CountryMapper.class);

		List<Country> list = mapper.selectAll();
		for (Country country : list) {
			System.out.println(country);
		}

	}

	// һ�Զ��ϵ���ݿ��ѯ
	@Test
	public void Test_selectAllUserVo() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ����һ��sqlSessionfactory,��һ�кϲ�
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		List<UserVo> list = mapper.selectAllUserVo();
		for (UserVo userVo : list) {
			System.out.println(userVo);
		}

	}

	@Test
	public void Test_selectAllCountryVo() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ����һ��sqlSessionfactory,��һ�кϲ�
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();

		CountryMapper mapper = session.getMapper(CountryMapper.class);
		List<CountryVo> list = mapper.selectAllCountryVo();
		for (Country countryVo : list) {
			System.out.println(countryVo);
		}
	}

	// ģ����ѯ
	@Test
	public void Test_selectUserListByUser() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ����һ��sqlSessionfactory,��һ�кϲ�
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		User u = new User();
		u.setU_sex("1");
		u.setU_username("��");
		u.setU_id(1);

		List<User> list = mapper.selectUserListByUser(u);
		for (User user : list) {
			System.out.println(user);
		}
	}

	// Trim
	@Test
	public void Test_selectUserListByUserTrim() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ����һ��sqlSessionfactory,��һ�кϲ�
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		User u = new User();
		u.setU_sex("1");
		u.setU_username("��");
		u.setU_id(1);

		List<User> list = mapper.Test_selectUserListByUserTrim(u);
		for (User user : list) {
			System.out.println(user);
		}
	}

	// set��ǩ
	@Test
	public void Test_updateSetUser() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ����һ��sqlSessionfactory,��һ�кϲ�
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		User u = new User();
		u.setU_id(1);
		u.setU_sex("1");
		u.setU_username("��������");
		u.setU_password("aaa");

		mapper.updateSetUser(u);// û��commit�����ύ�����ݿ�
		session.commit();// �����ύһ��,ʹ��set��ǩ����������ݱ�ʱ������ŵ�ƴ������
	}

	// ʹ�ö��id��ȡ�û��б�
	@Test
	public void selectUserListByIds() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ����һ��sqlSessionfactory,��һ�кϲ�
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();

		UserMapper mapper = session.getMapper(UserMapper.class);

		Integer[] ids = { 1, 3, 5, 7 };

		List<User> list = mapper.selectUserListByIds(ids);
		for (User user : list) {
			System.out.println(user);
		}

		// session.commit();//�����ύһ��,ʹ��set��ǩ����������ݱ�ʱ������ŵ�ƴ������
	}

	// selectUserListByList
	// ʹ�ö��id��ȡ�û��б�
	@Test
	public void selectUserListByList() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ����һ��sqlSessionfactory,��һ�кϲ�
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
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

	// ʹ�ö��id��ȡ�û��б�
	@Test
	public void slectUserListByUserVo() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ����һ��sqlSessionfactory,��һ�кϲ�
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
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
