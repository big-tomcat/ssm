package cn.itlu.ssm.dao;

import java.util.List;

import cn.itlu.ssm.po.User;



/*
 * dao接口
 */
public interface UserDao {
	//根据id查询用户信息
	public User findUserById(int id) throws Exception;

}
