package cn.itlu.ssm.po;

import java.util.List;

/*
 * �û���װ����
 */
public class UserQueryVo {
	//������id
	private List<Integer> ids;
	
	//��װ����Ҫ�Ĳ�ѯ����
	//�û���ѯ����	
	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	private UserCustomer userCustomer;

	public UserCustomer getUserCustomer() {
		return userCustomer;
	}

	public void setUserCustomer(UserCustomer userCustomer) {
		this.userCustomer = userCustomer;
	}
	//���԰�װ�����Ĳ�ѯ��������������Ʒ
	

}
