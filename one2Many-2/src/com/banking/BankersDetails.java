package com.banking;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class BankersDetails {
	public static void main(String args[])
	{
	 
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	 
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	//parent object
	Bank b =new Bank();
	 
	b.setBank_id(11);
	b.setBank_name("SBI");
	 
	
	Customer c1=new Customer();
	 
	c1.setCustomer_id(2);
	c1.setFirstname("Abhishek");
	 c1.setLastname("Chouhan");
	 
	 Customer c2=new Customer();
	 
		c2.setCustomer_id(3);
		c2.setFirstname("surya");
		 c2.setLastname("pandit");
	 
		 Customer c3=new Customer();
		 
			c3.setCustomer_id(4);
			c3.setFirstname("Ashish");
			 c3.setLastname("mishra");
	
	 
	// adding child objects to set, as we taken 3rd property set in parent
	Set s=new HashSet();
	 
	s.add(c1);
	s.add(c2);
	s.add(c3);
	 
	b.setBanking(s);;
	 
	Transaction tx = session.beginTransaction();
	 
	session.save(b);
	 
	tx.commit();
	session.close();
	System.out.println("One To Many is Done..!!");
	
	}
}
