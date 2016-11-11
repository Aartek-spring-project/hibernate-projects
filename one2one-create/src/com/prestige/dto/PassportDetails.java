package com.prestige.dto;


	import java.util.HashSet;
	import java.util.Set;
	 
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	 
	public class PassportDetails {
	 
	public static void main(String args[])
	{
	 
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	 
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	//parent object
	Passport v =new Passport();
	 
	v.setPassport_id(101);
	v.setName("Abhishek");;
	
	//creating 3 child objects
	Person c1=new Person();
	 
	c1.setPid(1);
	c1.setName("Abhishek");
	c1.setP(v);
	 
	Transaction tx = session.beginTransaction();
	 
	session.save(c1);
	 
	tx.commit();
	session.close();
	System.out.println("One To Many is Done..!!");
	factory.close();
	}
}
