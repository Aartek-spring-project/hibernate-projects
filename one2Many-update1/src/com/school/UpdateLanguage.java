package com.school;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateLanguage {
	Configuration cfg;
	public static void main(String args[])
	{
	 
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	Object o=session.get(Country_l.class, new Integer(1));
	Country_l c=(Country_l)o;
	System.out.println(c.getCid());
	System.out.println(c.getC_name()); 
	c.setC_name("India");
	Set st=c.getLanguage();
	Iterator it = st.iterator();
	while(it.hasNext())
	{
	 
	Object o1 = it.next();
	Language_l s = (Language_l) o1;
	System.out.println("---------------------------");
	System.out.println("City");
	System.out.println("---------------------------");
	s.setL_name("Hindi");
	System.out.println("---------------------------");
	}
    //session.saveOrUpdate(t);
	session.saveOrUpdate(c);
    tx.commit();
    session.close();
	System.out.println("One To Many is Done..!!");
	
	}

	
}
