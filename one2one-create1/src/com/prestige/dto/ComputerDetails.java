package com.prestige.dto;


	import java.util.HashSet;
	import java.util.Set;
	 
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	 
	public class ComputerDetails {
	 
	public static void main(String args[])
	{
	 
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	 
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	//parent object
	Employees v =new Employees();
	 
	v.seteId(101);
	v.setEname("Abhishek");;
	v.setDepartment("Developer");
	//creating 3 child objects
	Computers c1=new Computers();
	 
	c1.setCid(10);;
	c1.setComp_desc("42");;
	c1.setE(v);
	 
	Transaction tx = session.beginTransaction();
	 
	session.save(c1);
	 
	tx.commit();
	session.close();
	System.out.println("One To Many is Done..!!");
	factory.close();
	}
}
