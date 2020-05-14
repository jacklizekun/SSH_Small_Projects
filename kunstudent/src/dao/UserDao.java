package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pojo.UserInfo;

public class UserDao extends HibernateDaoSupport implements IUserDao {

	public void save(UserInfo userInfo) throws Exception {
		this.getHibernateTemplate().save(userInfo);

	}

	public List queryAllUser() throws Exception {
		return this.getHibernateTemplate().find("from UserInfo");
	}

	public UserInfo queryByName(String userName) throws Exception {
		String hql = "from UserInfo as u where u.userName=?";
		Object[] condition = { userName };
		List list = this.getHibernateTemplate().find(hql, condition);	
		if (list.size()>0) {
			return (UserInfo) list.get(0);
		}else{
			return null;
		}
	}

}
