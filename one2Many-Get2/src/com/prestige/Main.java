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
	Transaction tx = session.beginTransaction();	
	Object o=session.get(Teacher.class, new Integer(1));
	Teacher ft=(Teacher)o;
	System.out.println(ft.getTid());
	System.out.println(ft.getT_name());
	Set st=ft.getSelection();
	Iterator it = st.iterator();
	while(it.hasNext())
	{
	 
	Object o1 = it.next();
	Classes s = (Classes) o1;
	System.out.println("---------------------------");
	System.out.println("Classes");
	System.out.println("---------------------------");
	System.out.println(s.getCid());
	System.out.println(s.getClass());
	System.out.println(s.getCource_code());
	System.out.println(s.getDayofWeek());
	
	System.out.println("---------------------------");
	}
	tx.commit();
	session.close();
	System.out.println("One To Many is Done..!!");
	
	}
}
