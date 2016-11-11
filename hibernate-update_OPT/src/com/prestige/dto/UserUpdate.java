package com.prestige.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserUpdate {
public static void main(String[] args) {
	
	
	
	
	
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
	
	SessionFactory session=new Configuration().configure().buildSessionFactory();
	
	Session s=session.openSession();
	
	Transaction t=s.beginTransaction();
	
	
	UserDTO current = (UserDTO)s.load(UserDTO.class, 1);
    System.out.println("Before merge: " + current.getFname());
  //  Student changed = new Student();
	
    UserDTO changed = new UserDTO();
    changed.setId(1);
    changed.setFname("abhishek");
    changed.setAddress("indore");
    // session.update(changed); // Throws NonUniqueObjectException
    s.merge(changed); 
    System.out.println("After merge: " + current.getFname());
	
	
	
	//s.update(ud);
	
	
	t.commit();
	
	s.close();
	
	
	
	
	
}
	
	
}
