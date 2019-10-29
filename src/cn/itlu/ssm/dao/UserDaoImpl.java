package cn.itlu.ssm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.itlu.ssm.po.User;
import javassist.tools.reflect.Sample;
/*
 * dao接口实现类
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	

	public User findUserById(int id) throws Exception {
		//继承SqlSessionDaoSupport,通过this.SqlSession()得到SQLSession
		SqlSession sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("test.findUserById", id);
		return user;
	}
	

	
}
