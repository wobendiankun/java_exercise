package com.demo.model;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.junit.Test;

import com.demo.util.HibernateUtil;

public class ThreeStatusTest {
	@Test
	public void transient01Test(){
		Student student=new Student();
		student.setStudentName("张三");
		student.setAge(20);
	}
	@Test
	public void persistent01Test(){
		Student student=new Student();
		student.setStudentName("张三");
		student.setAge(20);
		Session session=null;
		try {
			session=HibernateUtil.openSession();
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().commit();
		}finally{
			HibernateUtil.closeSession(session);
		}
	}
	@Test
	public void persistent02Test(){
		Student student=new Student();
		student.setStudentName("张三");
		student.setAge(20);
		Session session=null;
		try {
			session=HibernateUtil.openSession();
			session.beginTransaction();
			session.save(student);
			student.setStudentName("aa");
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().commit();
		}finally{
			HibernateUtil.closeSession(session);
		}
	}
	@Test
	public void persistent04Test(){
		Student student=new Student();
		student.setStudentName("张三");
		student.setAge(20);
		Session session=null;
		try {
			session=HibernateUtil.openSession();
			session.beginTransaction();
			session.save(student);
			student.setStudentName("aa");
			session.update(student);
			student.setAge(55);
			session.update(student);
			session.save(student);
			session.save(student);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().commit();
		}finally{
			HibernateUtil.closeSession(session);
		}
	}
	@Test
	public void detach01Test(){
		Student student=new Student();
		student.setStudentId(2);
		student.setStudentName("2b");
		student.setAge(22);
		Session session=null;
		try {
			session=HibernateUtil.openSession();
			session.beginTransaction();
			session.update(student);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().commit();
		}finally{
			HibernateUtil.closeSession(session);
		}
	}
	@Test
	public void detach02Test(){
		Student student=new Student();
		student.setStudentId(2);
		Session session=null;
		try {
			session=HibernateUtil.openSession();
			session.beginTransaction();
			session.delete(student);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().commit();
		}finally{
			HibernateUtil.closeSession(session);
		}
	}
	@Test
	public void detach03Test(){
		Session session=null;
		try {
			session=HibernateUtil.openSession();
			session.beginTransaction();
			Student student=(Student)session.get(Student.class,3);
			student.setStudentName("ddddd");
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().commit();
		}finally{
			HibernateUtil.closeSession(session);
		}
	}
}
