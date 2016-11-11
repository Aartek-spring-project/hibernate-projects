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
	 
	
	Object o=session.get(Country.class, new Integer(1));
	Country c=(Country)o;
	System.out.println(c.getCid());
	System.out.println(c.getCountry_name());
	 
	Set st=c.getSelection();
	Iterator it = st.iterator();
	 
	while(it.hasNext())
	{
	 
	Object o1 = it.next();
	State s = (State) o1;
	System.out.println("---------------------------");
	System.out.println("States");
	System.out.println("---------------------------");
	System.out.println(s.getSid());
	System.out.println(s.getState_name());
	
	System.out.println("---------------------------");
	}
	 
	
 
	tx.commit();
	session.close();
	System.out.println("One To Many is Done..!!");
	
	}
}
