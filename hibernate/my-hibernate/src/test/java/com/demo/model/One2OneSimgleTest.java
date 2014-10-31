package com.demo.model;

import org.hibernate.Session;
import org.junit.Test;

import com.demo.util.HibernateUtil;

/**one2one单向
 * @author wobendiankun
 *2014-10-30 下午09:47:40
 */
public class One2OneSimgleTest {
	@Test
	public void addTest(){
		Student student=new Student();
		student.setStudentName("赵虎");
		student.setAge(35);
		
		User user=new User();
		user.setUserName("zhf");
		user.setPassword("111111");
		user.setStudent(student);
		
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
		Student student=new Student();
		student.setStudentId(63);
		User user=new User();
		user.setUserId(1);
		user.setStudent(student);
		user.setUserName("yy");
		
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			session.update(user);
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
			User user=(User)session.load(User.class, 1);
			System.out.println("用户名:"+user.getUserName());
			System.out.println("学员姓名:"+user.getStudent().getStudentName());
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}
	}
}
