package com.sikiedu.test;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class JdbcTest {

	public static void main(String[] args) {
		// ���Ӷ���
		Connection con = null;

		// ��ѯ����
		PreparedStatement ps = null;

		// ���������
		ResultSet rs = null;

		try {
			// ����jdbc���ݿ���������*********************************************
			Class.forName("com.mysql.jdbc.Driver");
			// ��ȡ����DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm_mybatis","root","root");
			// ���������Ӷ���ȥ����һ��
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm_mybatis", "root", "root");

			//**************************************************************************
			String sql = "select * from user where u_sex=?";
			// ��ȡstatement
			ps = con.prepareStatement(sql);
			ps.setString(1, "0");

			// ��ѯ ������********************************************************************
			rs = ps.executeQuery();
			// ��ӡһ��
			while (rs.next()) {
				System.out.println(rs.getString("u_id") + " " + rs.getString("u_username") + " " + rs.getString("u_sex"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {//*************************************************************
			// 1---�ر�����=========================================
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			// 2---�ر�����==========================================
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			// 3---�ر�����=================================================
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
