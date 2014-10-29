package com.demo.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.junit.Test;

import com.demo.util.HibernateUtil;

public class One2ManyDuplexTest {
	@Test
	public void addTest(){
		Set<Certificate> certificates=new HashSet<Certificate>();
		Student student = new Student();
		student.setStudentName("王五");
		student.setAge(35);
		
		Certificate certificate1 = new Certificate();
		certificate1.setCertificateName("aa");
		certificate1.setCertificateNo("3a10001");
		certificate1.setStudent(student);
		Certificate certificate2 = new Certificate();
		certificate2.setCertificateName("bb");
		certificate2.setCertificateNo("3a10002");
		certificate2.setStudent(student);
		
		Session session = null;
		
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			// 先保存one,再保存many
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
	public void updateStudentTest(){
		Student student=new Student();
		student.setStudentId(63);
		student.setStudentName("李九");
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
	public void updateStudentWithInverseTest(){
		Student student=new Student();
		student.setStudentId(63);
		student.setStudentName("李九");
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
	public void loadCertificateTest(){
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			Certificate certificate=(Certificate)session.load(Certificate.class, 65);
			Certificate certificate2=(Certificate)session.load(Certificate.class, 66);
			System.out.println("编号:"+certificate.getCertificateNo());
			System.out.println("姓名:"+certificate.getStudent().getStudentName());
			System.out.println("---------------------------");
			System.out.println("编号:"+certificate2.getCertificateNo());
			System.out.println("姓名:"+certificate2.getStudent().getStudentName());
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}
	}
	@Test
	public void loadStudentTest(){
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			Student student=(Student)session.load(Student.class, 63);
			System.out.println("姓名:"+student.getStudentName());
			for(Certificate c:student.getCertificates()){
				System.out.println("\t编号:"+c.getCertificateNo());
			}
			System.out.println("-------------------");
			Certificate c1=(Certificate)session.get(Certificate.class, 65);
			System.out.println("编号:"+c1.getCertificateNo());
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}
	}
}
