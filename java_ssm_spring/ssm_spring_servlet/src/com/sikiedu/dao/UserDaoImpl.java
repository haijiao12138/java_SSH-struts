package com.sikiedu.dao;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.sikiedu.bean.User;

public class UserDaoImpl implements UserDao {

	private  ComboPooledDataSource dataSource;
	public void setDataSource(ComboPooledDataSource dataSource) {
		this.dataSource = dataSource;
	}
	
//	private static ComboPooledDataSource dataSource;
//
//	static {
//		// ����c3p0 //�������ݿ� ʹ��c3p0
//		try {
//			dataSource = new ComboPooledDataSource();
//			dataSource.setDriverClass("com.mysql.jdbc.Driver");
//			dataSource.setJdbcUrl("jdbc:mysql://localhost:3308/ssm_spring");
//			dataSource.setUser("root");
//			dataSource.setPassword("root");
//		} catch (PropertyVetoException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}




	// ͨ�����ݿ��ȡ�û�
	@Override
	public User getUserByInfo(User u) {

		try {

			// ʹ��dbutils�������ݿ� ��ѯ�������û�����
			QueryRunner qr = new QueryRunner(dataSource);
			String sql = "select * from user where u_username=? and u_password=?";

			return qr.query(sql, new BeanHandler<User>(User.class), u.getU_username(), u.getU_password());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
