package com.prestige.dto;


	import java.util.HashSet;
	import java.util.Set;
	 
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	 
	public class VendorDetails {
	 
	public static void main(String args[])
	{
	 
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	 
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	//parent object
	Vendor v =new Vendor();
	 
	v.setVendorId(1);
	v.setVendorName("JavaBook");
	 
	//creating 3 child objects
	Customer c1=new Customer();
	 
	c1.setCustomerId(501);
	c1.setCustomerName("customer1");
	 
	Customer c2=new Customer();
	 
	c2.setCustomerId(502);
	c2.setCustomerName("customer2");
	 
	Customer c3=new Customer();
	 
	c3.setCustomerId(503);
	c3.setCustomerName("customer3");
	 
	// adding child objects to set, as we taken 3rd property set in parent
	Set s=new HashSet();
	 
	s.add(c1);
	s.add(c2);
	s.add(c3);
	 
	v.setChildren(s);
	 
	Transaction tx = session.beginTransaction();
	 
	session.save(v);
	 
	tx.commit();
	session.close();
	System.out.println("One To Many is Done..!!");
	factory.close();
	}
}
