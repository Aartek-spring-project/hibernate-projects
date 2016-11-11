package com.prestige;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String args[])
	{
	 
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	 
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession(); 
	Object o = session.get(Teacher.class, new Integer(3));
	Teacher t = (Teacher)o; 
	Transaction tx = session.beginTransaction();
	session.delete(t);
	tx.commit();
	session.close();
	System.out.println("One To Many is Done..!!");
	
	}
}
