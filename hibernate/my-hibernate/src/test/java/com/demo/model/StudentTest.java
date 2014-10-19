package com.demo.model;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

import com.demo.model.Student;

/**
 * @author wobendiankun
 *2014-10-19 下午08:54:13
 */
public class StudentTest {
	SessionFactory sessionFactory ;
	@Before
	public void init(){
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}
	
	@Test
	public void addTest(){
		Student student=new Student();
		student.setAge(20);
		student.setStudentName("旺财");
		Session session=null;
		try {
			//开启session
			session=sessionFactory.openSession();
			//开启事务
			session.beginTransaction();
			session.save(student);
			//提交事务
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			//回滚事务
			session.getTransaction().rollback();
			
		}finally{
			if(session!=null){
				session.close();
			}
		}
	}
	@Test
	public void deleteTest(){
		Student student=new Student();
		student.setStudentId(1);
		Session session=null;
		try {
			session=sessionFactory.openSession();
			session.beginTransaction();
			session.delete(student);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			
		}finally{
			if(session!=null){
				session.close();
			}
		}
	}
	
	@Test
	public void updateTest(){
		Student student=new Student();
		student.setStudentId(2);
		student.setAge(35);
		Session session=null;
		try {
			session=sessionFactory.openSession();
			session.beginTransaction();
			//注意:update方法更新t_student的除了主键外的所有字段,
			//student_name为未设置值，默认为空值，
			//表中的数据将被更新为空值
			session.update(student);//update t_student set student_name=?, age=? where student_id=?
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			
		}finally{
			if(session!=null){
				session.close();
			}
		}
	}
	
	@Test
	public void getTest(){
		Session session=null;
		Student student=null;
		try {
			session=sessionFactory.openSession();
			student=(Student) session.get(Student.class, 2);
		}finally{
			if(session!=null){
				session.close();
			}
		}
		System.out.println(student);
	}
	@Test
	public void listTest(){
		Session session=null;
		List<Student> list=null;
		try {
			session=sessionFactory.openSession();
			Query query= session.createQuery("from Student");
			list=query.list();
		}finally{
			if(session!=null){
				session.close();
			}
		}
		for(Student student:list){
			System.out.println(student);
		}
	}
}
