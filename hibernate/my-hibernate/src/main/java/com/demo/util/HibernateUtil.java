package com.demo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author wobendiankun
 *2014-10-24 下午10:01:33
 */
public class HibernateUtil {
	private static  SessionFactory sessionFactory=getInstance();
	private static SessionFactory getInstance(){
		return new Configuration().configure().buildSessionFactory();
	}
	public static Session openSession(){
		return sessionFactory.openSession();
	}
	public static void closeSession(Session session){
		if(session !=null){
			session.close();
		}
	}
}
