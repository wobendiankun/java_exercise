package com.demo.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.junit.Test;

import com.demo.util.HibernateUtil;

/**多对多单向
 * @author wobendiankun
 *2014-11-2 下午08:41:35
 */
public class Many2ManySingleTest {
	@Test
	public void addTest() {
		User user1=new User("李三","111");
		User user2=new User("李四","111");
		Set<User> users=new HashSet<User>();
		users.add(user1);
		users.add(user2);
		
		Role role=new Role("开发组");
		role.setUsers(users);
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			session.save(user1);
			session.save(user2);
			session.save(role);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}
	}
	@Test
	public void loadTest(){
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			Role role=(Role)session.load(Role.class,2);
			System.out.println("角色名称"+role.getRoleName());
			System.out.println("users:"+role.getUsers());
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}
	}
	
}
