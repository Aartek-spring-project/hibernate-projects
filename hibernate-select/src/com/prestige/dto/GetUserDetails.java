package com.prestige.dto;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetUserDetails {
public static void main(String[] args)
{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory session=cfg.buildSessionFactory();
		Session s=session.openSession();
		Transaction tx=s.beginTransaction();
		
		
		//Query query = s.createQuery("from SelectUser");
		List results = s.createQuery("from SelectUser").list();
		
		Iterator i=results.iterator();
		
		while(i.hasNext())
		{
			Object o = (Object)i.next();
			SelectUser u = (SelectUser)o;
			System.out.println("id : "+u.getId());
			System.out.println("FName : "+u.getFirstname());
			System.out.println("LName: "+u.getLastname());
			System.out.println("Salary : "+u.getSalary());
			System.out.println("Address : "+u.getAddress());
			System.out.println("----------------------");
			
		}
		
	
		
		tx.commit();
		s.close();
	
	
	
	
}


	
	
	
	
}

