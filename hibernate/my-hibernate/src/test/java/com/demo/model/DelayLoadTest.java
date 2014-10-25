package com.demo.model;

import org.hibernate.Session;
import org.junit.Test;

import com.demo.util.HibernateUtil;

/**延迟加载
 * @author wobendiankun
 *2014-10-24 下午10:03:28
 */
public class DelayLoadTest {
	@Test
	public void getTest(){
		Session session=null;
		Student student=null;
		try{
			session=HibernateUtil.openSession();
			student=(Student) session.get(Student.class, 3);
			System.out.println("id:"+student.getStudentId());
			System.out.println("name:"+student.getStudentName());
		}finally{
			session.close();
		}
	}
	@Test
	public void loadTest(){
		Session session=null;
		Student student=null;
		try{
			session=HibernateUtil.openSession();
			student=(Student) session.load(Student.class, 3);
			System.out.println("id:"+student.getStudentId());
			System.out.println("name:"+student.getStudentName());
		}finally{
			session.close();
		}
		
	}
	@Test
	public void get2Test(){
		Session session=null;
		Student student=null;
		try{
			session=HibernateUtil.openSession();
			student=(Student) session.get(Student.class, 3);
		}finally{
			session.close();
		}
		System.out.println("id:"+student.getStudentId());
		System.out.println("name:"+student.getStudentName());
	}
	@Test
	public void load2Test(){
		Session session=null;
		Student student=null;
		try{
			session=HibernateUtil.openSession();
			student=(Student) session.load(Student.class, 3);
		}finally{
			session.close();
		}
		System.out.println("id:"+student.getStudentId());
		System.out.println("name:"+student.getStudentName());
	}
}
