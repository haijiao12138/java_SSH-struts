package com.sikiedu.mapper;

import java.util.List;

import com.sikiedu.bean.User;
import com.sikiedu.bean.UserVo;

public interface UserMapper {

	// =====mapper动态代理开发四大原则+一个注意============
	// 通过id查询一个用户
	// 1--接口方法名需要和mapper.xml中放入调用的SQL语句时的id一致
	// 2--接口的形参类需要与mapper,xml parameterType一致
	// 3--接口中的返回值需要与mapper.xml resultType一致
	// 4--mapper中的namespace要与接口的全包名一致,为了找到接口
	// 5--注意,在mapper动态代理开发中,根据返回值类型来进行自动选择
	public User selectUserById(Integer id);

	// 通过用户名模糊查询获取动态列表,返回值是一个集合,用List,参数值是String
	public List<User> selectUserByName(String name);

	// 通过UseerVo id查询一个用户
	public User selectUserByUserVold(UserVo vo);

	// 输出映射,接口,查询用户总条数:
	public Integer selectUserCount();

	// 查询所有用户
	public List<UserVo> selectAllUserVo();

	//
	// 多条件查询通过用户对象中的查询条件查询用户列表
	public List<User> selectUserListByUser(User u);

	// 多条件查询通过用户对象中的查询条件查询用户列表trim
	public List<User> Test_selectUserListByUserTrim(User u);

	// 更新用户表
	public void updateSetUser(User user);

	// 使用多个id获取用户列表by array
	// public List<User> selectUserListByIds();
	public List<User> selectUserListByIds(Integer[] ids);
	// 使用多个id获取用户列表by list
	public List<User> selectUserListByList(List<Integer> idList);

	//使用多个id获取用户列表by userVo  包装类
	public List<User> slectUserListByUserVo(User vo);
	

}
