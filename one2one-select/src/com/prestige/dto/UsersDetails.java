package com.prestige.dto;


	import java.util.HashSet;
	import java.util.Set;
	 
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	 
	public class UsersDetails {
	 
	public static void main(String args[])
	{
	 
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	 
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	 Object o = session.get(Users.class, new Integer(101));
	 Users a = (Users)o;
     System.out.println("User Id :"+a.getUid());
     System.out.println("User Name :"+a.getuName());

     Profile p=a.getP();
     System.out.println("Account of "+p.getPname());

		    session.close();
		    System.out.println("One to One select is Done..!!");
		    factory.close();

	}
}
