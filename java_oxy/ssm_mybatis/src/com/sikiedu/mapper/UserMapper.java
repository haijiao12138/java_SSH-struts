package com.sikiedu.mapper;

import java.util.List;

import com.sikiedu.bean.User;
import com.sikiedu.bean.UserVo;

public interface UserMapper {

	// =====mapper��̬�������Ĵ�ԭ��+һ��ע��============
	// ͨ��id��ѯһ���û�
	// 1--�ӿڷ�������Ҫ��mapper.xml�з�����õ�SQL���ʱ��idһ��
	// 2--�ӿڵ��β�����Ҫ��mapper,xml parameterTypeһ��
	// 3--�ӿ��еķ���ֵ��Ҫ��mapper.xml resultTypeһ��
	// 4--mapper�е�namespaceҪ��ӿڵ�ȫ����һ��,Ϊ���ҵ��ӿ�
	// 5--ע��,��mapper��̬��������,���ݷ���ֵ�����������Զ�ѡ��
	public User selectUserById(Integer id);

	// ͨ���û���ģ����ѯ��ȡ��̬�б�,����ֵ��һ������,��List,����ֵ��String
	public List<User> selectUserByName(String name);

	// ͨ��UseerVo id��ѯһ���û�
	public User selectUserByUserVold(UserVo vo);

	// ���ӳ��,�ӿ�,��ѯ�û�������:
	public Integer selectUserCount();

	// ��ѯ�����û�
	public List<UserVo> selectAllUserVo();

	//
	// ��������ѯͨ���û������еĲ�ѯ������ѯ�û��б�
	public List<User> selectUserListByUser(User u);

	// ��������ѯͨ���û������еĲ�ѯ������ѯ�û��б�trim
	public List<User> Test_selectUserListByUserTrim(User u);

	// �����û���
	public void updateSetUser(User user);

	// ʹ�ö��id��ȡ�û��б�by array
	// public List<User> selectUserListByIds();
	public List<User> selectUserListByIds(Integer[] ids);
	// ʹ�ö��id��ȡ�û��б�by list
	public List<User> selectUserListByList(List<Integer> idList);

	//ʹ�ö��id��ȡ�û��б�by userVo  ��װ��
	public List<User> slectUserListByUserVo(User vo);
	

}
