package com.prestige.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDelete {
public static void main(String[] args) {
	
	UserDTO ud=new UserDTO();
	ud.setId(2);
	
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
	
	SessionFactory session=new Configuration().configure().buildSessionFactory();
	
	Session s=session.openSession();
	
	Transaction t=s.beginTransaction();
	
	
	s.delete(ud);
	
	
	t.commit();
	
	s.close();
	
	
	
	
	
}
	
	
}
