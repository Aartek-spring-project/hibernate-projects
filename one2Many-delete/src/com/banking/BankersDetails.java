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

	
	 
	Object o = session.get(Bank.class, new Integer(12));
	Bank b = (Bank)o;
	 
	Transaction tx = session.beginTransaction();
	session.delete(b);
	 
	tx.commit();
	session.close();
	System.out.println("One To Many is Done..!!");
	
	}
}
