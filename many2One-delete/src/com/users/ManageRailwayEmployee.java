package com.users;

import java.util.*;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageRailwayEmployee {
   
   public static void main(String[] args) 
	   {
		   
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml"); 
	 
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();		
	 
			Object o = session.get(R_Employee.class, new Integer(1));
			R_Employee c = (R_Employee)o;		
	 
			    Transaction tx = session.beginTransaction();
			                      session.delete(c);
			    tx.commit();
	 
			    session.close();
			    System.out.println("many to one delete done..!!");
			    factory.close();       
	 
		}
}