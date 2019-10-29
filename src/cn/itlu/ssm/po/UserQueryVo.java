package cn.itlu.ssm.po;

import java.util.List;

/*
 * 用户包装类型
 */
public class UserQueryVo {
	//传入多个id
	private List<Integer> ids;
	
	//包装所需要的查询条件
	//用户查询条件	
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
	//可以包装其他的查询条件，订单，商品
	

}
