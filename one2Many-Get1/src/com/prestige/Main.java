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
	Object o=session.get(State.class, new Integer(1));
	State c=(State)o;
	System.out.println(c.getSid());
	System.out.println(c.getState_name()); 
	Set st=c.getSelection();
	Iterator it = st.iterator();
	 
	while(it.hasNext())
	{
	 
	Object o1 = it.next();
	City s = (City) o1;
	System.out.println("---------------------------");
	System.out.println("City");
	System.out.println("---------------------------");
	System.out.println(s.getCid());
	System.out.println(s.getCity_name());
	
	System.out.println("---------------------------");
	}
	tx.commit();
	session.close();
	System.out.println("One To Many is Done..!!");
	
	}
}
