package com.school;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class SchoolDetails {
	Configuration cfg;
	public static void main(String args[])
	{
	 
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	 
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	Object o=session.get(Teacher.class, new Integer(1));
	Teacher c=(Teacher)o;
	System.out.println(c.getTeacher_id());
	System.out.println(c.getSubject()); 
	c.setSubject("Physics");
	Set st=c.getTeaching();
	Iterator it = st.iterator();
	while(it.hasNext())
	{
	 
	Object o1 = it.next();
	Students s = (Students) o1;
	System.out.println("---------------------------");
	System.out.println("Teaching records");
	System.out.println("---------------------------");
	s.setAddress("Indore");
	System.out.println("---------------------------");
	}
    //session.saveOrUpdate(t);
	session.saveOrUpdate(c);
    tx.commit();
    session.close();
	System.out.println("One To Many is Done..!!");
	
	}
   	
}
