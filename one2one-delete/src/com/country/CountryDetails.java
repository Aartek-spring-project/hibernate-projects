package com.country;


	import java.util.HashSet;
	import java.util.Set;
	 
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	 
	public class CountryDetails {
	 
	public static void main(String args[])
	{
	 
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	 
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	 Object o = session.get(deleteState.class, new Integer(1));
	 deleteState a = (deleteState)o;
     System.out.println("Id :"+a.getHid());
     System.out.println("Head Of State :"+a.getsName());

     Country p=a.getP();
     System.out.println("Country Name "+p.getCname());

		    session.close();
		    System.out.println("One to One select is Done..!!");
		    factory.close();

	}
}
