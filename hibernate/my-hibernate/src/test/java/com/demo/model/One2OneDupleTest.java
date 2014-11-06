package com.demo.model;

import org.hibernate.Session;
import org.junit.Test;

import com.demo.util.HibernateUtil;

/**1对1双向
 * @author wobendiankun
 *2014-11-1 上午10:32:55
 */
public class One2OneDupleTest {
	@Test
	public void addTest(){
		Student student=new Student();
		student.setStudentName("大宝");
		student.setAge(45);
		
		User user=new User();
		user.setUserName("db");
		user.setPassword("111111");
		//设置双向关系
		user.setStudent(student);
		student.setUser(user);
		
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			session.save(student);
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}
	}
	@Test
	public void updateTest(){
		User user=new User();
		user.setUserId(21);
		user.setUserName("dddd");
		Student student=new Student();
		student.setStudentId(102);
		student.setStudentName("二宝");
		//设置关联关系
		student.setUser(user);
		
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			session.update(student);
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
			User user=(User)session.load(User.class,21);
			System.out.println("login:"+user.getUserName());
			System.out.println("student:"+user.getStudent().getStudentName());
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}
	}
}
