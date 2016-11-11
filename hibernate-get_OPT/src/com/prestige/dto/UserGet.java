package com.prestige.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserGet {
public static void main(String[] args) {
	
	UserDTO ud=new UserDTO();
//	ud.setId(6);
	
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
	
	SessionFactory session=new Configuration().configure().buildSessionFactory();
	
	Session s=session.openSession();
	
	Transaction t=s.beginTransaction();
	
	
	UserDTO  us=(UserDTO)s.get(UserDTO.class, 4);
	System.out.println(us.getFname());
	System.out.println(us.getLname());

	
	t.commit();
	
	s.close();
	
	
	
	
	
}
	
	
}
