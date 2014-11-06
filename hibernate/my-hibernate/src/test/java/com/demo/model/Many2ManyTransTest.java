package com.demo.model;

import org.hibernate.Session;
import org.junit.Test;

import com.demo.util.HibernateUtil;

/**多对多变形
 * @author wobendiankun
 *2014-11-6 下午10:42:34
 */
public class Many2ManyTransTest {
	@Test
	public void addTest(){
		UserRole userRole1=new UserRole("aa");
		userRole1.setUser(new User(61));
		userRole1.setRole(new Role(3));
		UserRole userRole2=new UserRole("bb");
		userRole2.setUser(new User(65));
		userRole2.setRole(new Role(3));
		
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			session.save(userRole1);
			session.save(userRole2);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}
	}
}
