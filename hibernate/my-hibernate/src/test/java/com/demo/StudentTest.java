package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	SessionFactory sessionFactory ;
	@Before
	public void init(){
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}
	
	@Test
	public void createTest(){
	}
	
}
