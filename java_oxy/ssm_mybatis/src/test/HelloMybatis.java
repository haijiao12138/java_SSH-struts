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

	// ���Է���,���ע��
	@Test
	// ���ų���,ͨ��id��ѯ�û�
	public void Test1() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ��ҪsqlSessionFactoryBuilder
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();

		// ����һ��sqlSessionfactory
		SqlSessionFactory ssf = ssfb.build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();

		// �������ݿ�
		// ����1:��Ҫ������SQL��� ����2:sql���Ĳ���
		// ׼�����ܹ���,����һ������,��user����
		User user = session.selectOne("UserMapper.selectUserById", 1);// ǰ��һ�������Ǵ���,����һ����ռλ�� ,��ʾidΪ1
		System.out.println(user);
	}

	@Test
	// ���ų���,ͨ��id��ѯ�û�
	public void Test2() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ��ҪsqlSessionFactoryBuilder
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();

		// ����һ��sqlSessionfactory
		SqlSessionFactory ssf = ssfb.build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();

		// �������ݿ�
		// ����1:��Ҫ������SQL��� ����2:sql���Ĳ���
		// ׼�����ܹ���,����һ������,��user����
		List<User> list = session.selectList("UserMapper.selectUserByName", "��");// ǰ��һ�������Ǵ���,����һ����ռλ�� ,��ʾidΪ1
		for(User u:list) {
			System.out.println(u);
		}
	}
	//����û�
	@Test
	// ���ų���,ͨ��id��ѯ�û�
	public void Test3() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ��ҪsqlSessionFactoryBuilder
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();

		// ����һ��sqlSessionfactory
		SqlSessionFactory ssf = ssfb.build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();

		// �������ݿ�
		// ����1:��Ҫ������SQL��� ����2:sql���Ĳ���
		// ׼�����ܹ���,����һ������,��user����
		User user=new User();
		user.setU_username("С��123");
		user.setU_password("123123");
		user.setU_sex("1");
		user.setU_createTime(new Date());
		user.setU_cid(1);
		session.insert("UserMapper.insertUser", user);// ǰ��һ�������Ǵ���,����һ����ռλ�� ,��ʾidΪ1
		
		//��Ҫcommit
		session.commit();
	}
	
	//�޸��û�
	@Test
	// ���ų���,ͨ��id��ѯ�û�
	public void Test4() throws IOException {
		// �ļ�·����ȡ
		String resource = "sqlMapConfig.xml";
		// ��ȡ�����ļ�,mybatis���ṩ�˷���
		InputStream in = Resources.getResourceAsStream(resource);

		// ��ҪsqlSessionFactoryBuilder
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();

		// ����һ��sqlSessionfactory
		SqlSessionFactory ssf = ssfb.build(in);// ��Ҫ�����ļ�

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();

		// �������ݿ�
		// ����1:��Ҫ������SQL��� ����2:sql���Ĳ���
		// ׼�����ܹ���,����һ������,��user����
		User user=new User();
		user.setU_id(13);
		user.setU_username("С��");

		session.update("UserMapper.updateUser", user);// ǰ��һ�������Ǵ���,����һ����ռλ�� ,��ʾidΪ1
		
		//��Ҫcommit
		session.commit();
	}
	
	//����idɾ���û�
		@Test
		// ���ų���,ͨ��idɾ���û�
		public void Test5() throws IOException {
			// �ļ�·����ȡ
			String resource = "sqlMapConfig.xml";
			// ��ȡ�����ļ�,mybatis���ṩ�˷���
			InputStream in = Resources.getResourceAsStream(resource);

			// ��ҪsqlSessionFactoryBuilder
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();

			// ����һ��sqlSessionfactory
			SqlSessionFactory ssf = ssfb.build(in);// ��Ҫ�����ļ�

			// ����һ��sqlSession
			SqlSession session = ssf.openSession();

			// �������ݿ�
			// ����1:��Ҫ������SQL��� ����2:sql���Ĳ���
			// ׼�����ܹ���,����һ������,��user����
		
			
			session.delete("UserMapper.deleteUserByid", 14);// ǰ��һ�������Ǵ���,����һ����ռλ�� ,��ʾidΪ1
			
			//��Ҫcommit
			session.commit();
		}
}
