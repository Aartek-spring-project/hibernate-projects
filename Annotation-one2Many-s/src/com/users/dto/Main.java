package com.users.dto;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx=session.beginTransaction();
			Set<Phone> phoneNumbers = new HashSet<Phone>();
			phoneNumbers.add(new Phone("house","32354353"));
			phoneNumbers.add(new Phone("mobile","9889343423"));
			
			Student student = new Student("Eswar", phoneNumbers);
			session.save(student);
			
			tx.commit();
			
		} 

	
}