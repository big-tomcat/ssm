package cn.itlu.ssm.dao;

import java.util.List;

import cn.itlu.ssm.po.User;



/*
 * dao�ӿ�
 */
public interface UserDao {
	//����id��ѯ�û���Ϣ
	public User findUserById(int id) throws Exception;

}
