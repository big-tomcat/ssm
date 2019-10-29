package cn.itlu.ssm.mapper;



import cn.itlu.ssm.po.User;
/*
 * mapper接口， dao接口
 */
public interface UserMapper {
	//根据id查询用户信息
	public User findUserById(int id) throws Exception;
	
	
	
}
