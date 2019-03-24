package com.sikiedu.test;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class JdbcTest {

	public static void main(String[] args) {
		// 链接对象
		Connection con = null;

		// 查询对象
		PreparedStatement ps = null;

		// 结果集对象
		ResultSet rs = null;

		try {
			// 加载jdbc数据库驱动驱动*********************************************
			Class.forName("com.mysql.jdbc.Driver");
			// 获取链接DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm_mybatis","root","root");
			// 并且用链接对象去接收一下
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm_mybatis", "root", "root");

			//**************************************************************************
			String sql = "select * from user where u_sex=?";
			// 获取statement
			ps = con.prepareStatement(sql);
			ps.setString(1, "0");

			// 查询 输出结果********************************************************************
			rs = ps.executeQuery();
			// 打印一下
			while (rs.next()) {
				System.out.println(rs.getString("u_id") + " " + rs.getString("u_username") + " " + rs.getString("u_sex"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {//*************************************************************
			// 1---关闭链接=========================================
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			// 2---关闭链接==========================================
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			// 3---关闭链接=================================================
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
