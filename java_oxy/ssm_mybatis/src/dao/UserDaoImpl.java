package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sikiedu.bean.User;

public class UserDaoImpl implements UserDao {

	// sqlSession����
	private SqlSessionFactory ssf;

	// ��������ɻ�ȡ,ͨ����������ssf��ֵ
	public UserDaoImpl() {
		//���췽��
	}
	public UserDaoImpl(SqlSessionFactory ssf) {
		super();
		this.ssf = ssf;
	}


	public SqlSessionFactory getSsf() {
		return ssf;
	}


	public void setSsf(SqlSessionFactory ssf) {
		this.ssf = ssf;
	}


	@Override
	public User getUserById(Integer id) {

		// ����һ��sqlSession
		SqlSession session = ssf.openSession();
		// �������ݿ�
		// ����1:��Ҫ������SQL��� ����2:sql���Ĳ���
		// ׼�����ܹ���,����һ������,��user����
		return session.selectOne("UserMapper.selectUserById", id);// ǰ��һ�������Ǵ���,����һ����ռλ�� ,��ʾidΪ1

	}

}
