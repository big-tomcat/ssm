package cn.itlu.ssm.mapper;



import cn.itlu.ssm.po.User;
/*
 * mapper�ӿڣ� dao�ӿ�
 */
public interface UserMapper {
	//����id��ѯ�û���Ϣ
	public User findUserById(int id) throws Exception;
	
	
	
}
