package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sikiedu.bean.User;

public class UserDaoImpl implements UserDao {

	// sqlSession工厂
	private SqlSessionFactory ssf;

	// 构造器完成获取,通过构造器给ssf赋值
	public UserDaoImpl() {
		//构造方法
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

		// 生产一个sqlSession
		SqlSession session = ssf.openSession();
		// 操作数据库
		// 参数1:需要操作的SQL语句 参数2:sql语句的参数
		// 准备接受工作,返回一个对象,用user接受
		return session.selectOne("UserMapper.selectUserById", id);// 前面一个参数是代用,后面一个是占位符 ,表示id为1

	}

}
