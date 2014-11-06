package com.demo.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.junit.Test;

import com.demo.util.HibernateUtil;

/**多对多双向
 * @author wobendiankun
 *2014-11-3 下午08:43:56
 */
public class Many2ManyDuplexTest {
	@Test
	public void addTest(){
		/*User user1=new User("赵三","111");
		User user2=new User("无四","111");
		Set<User> users=new HashSet<User>();
		users.add(user1);
		users.add(user2);
		
		Role role=new Role("财务部");
		Set<Role> roles=new HashSet<Role>();
		//设置双向关系
		role.setUsers(users);
		user1.setRoles(roles);
		user2.setRoles(roles);
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			session.save(role);
			session.save(user1);
			session.save(user2);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}*/
	}
	@Test
	public void loadTest(){
		/*Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			Role role=(Role)session.load(Role.class,3);
			System.out.println("角色名称:"+role.getRoleName());
			System.out.println("users:"+role.getUsers());
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}*/
	}
}
