package com.demo.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.junit.Test;

import com.demo.util.HibernateUtil;

public class One2ManyTest {
	@Test
	public void addTest() {
		Certificate certificate1 = new Certificate();
		certificate1.setCertificateName("aa");
		certificate1.setCertificateNo("3a10001");
		Certificate certificate2 = new Certificate();
		certificate2.setCertificateName("bb");
		certificate2.setCertificateNo("3a10002");
		Set<Certificate> set=new HashSet<Certificate>();
		set.add(certificate1);
		set.add(certificate2);
		
		Student student = new Student();
		student.setStudentName("钱六");
		student.setAge(35);
		student.setCertificates(set);
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			session.save(student);
			session.save(certificate1);
			session.save(certificate2);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}

	}
	@Test
	public void loadTest() {
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			Student student =(Student) session.load(Student.class, 23);
			System.out.println("姓名:"+student.getStudentName());
			System.out.println("数量:"+student.getCertificates().size());
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}
		
	}
	@Test
	public void loadLazyExtraTest() {
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			Student student =(Student) session.load(Student.class, 23);
			System.out.println("姓名:"+student.getStudentName());
			System.out.println("数量:"+student.getCertificates().size());
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}
	}
	@Test
	public void loadAssociatesTest() {
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			Student student =(Student) session.load(Student.class, 23);
			System.out.println("姓名:"+student.getStudentName());
			for(Certificate c:student.getCertificates()){
				System.out.println("编号:"+c.getCertificateNo());
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}
	}
}
