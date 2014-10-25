package com.demo.model;

import org.hibernate.Session;
import org.junit.Test;

import com.demo.util.HibernateUtil;

public class Many2OneTest {
	@Test
	public void addTest() {
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
	public void deleteTest() {
		Student student = new Student();
		student.setStudentId(1);
		Certificate certificate1 = new Certificate();
		certificate1.setCertificateId(1);
		Certificate certificate2 = new Certificate();
		certificate2.setCertificateId(2);
		Session session = null;

		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			session.delete(certificate1);
			session.delete(certificate2);
			session.delete(student);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}
	}

	@Test
	public void updateTest() {
		Student student = new Student();
		student.setStudentId(2);
		student.setStudentName("赵四");
		Certificate certificate1 = new Certificate();
		certificate1.setCertificateId(3);
		certificate1.setCertificateName("cc");
		certificate1.setCertificateNo("s0001");
		certificate1.setStudent(student);
		Certificate certificate2 = new Certificate();
		certificate2.setCertificateId(4);
		certificate2.setCertificateName("dd");
		certificate2.setCertificateNo("s0002");
		certificate2.setStudent(student);
		Session session = null;

		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			session.update(certificate1);
			session.update(certificate2);
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
	public void getTest() {
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.beginTransaction();
			Certificate certificate = (Certificate) session.get(
					Certificate.class, 3);
			System.out.println(certificate.getCertificateId());
			System.out.println("证书名称:"+certificate.getCertificateName());
			System.out.println("学员名称:"+certificate.getStudent().getStudentName());
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
			Certificate certificate = (Certificate) session.load(
					Certificate.class, 3);
			System.out.println(certificate.getCertificateId());
			System.out.println("证书名称:"+certificate.getCertificateName());
			System.out.println("学员名称:"+certificate.getStudent().getStudentName());
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}
	}
}
