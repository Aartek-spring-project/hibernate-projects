package com.prestige.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetUser {
public static void main(String[] args) {
	

	
	
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
	
	SessionFactory session=cfg.buildSessionFactory();
	
	Session ses1 = session.openSession();
Transaction t=	 ses1.beginTransaction();
	
	 
	UserDTO u=(UserDTO) ses1.load(UserDTO.class,new Integer(1));
	 
	

	System.out.println(u.getEmail());
	
	ses1.close();	
	
	 
	Session ses2 = session.openSession();
	
	UserDTO us=(UserDTO) ses2.load(UserDTO.class,new Integer(1));
	

	System.out.println(us.getEmail());
	

	
	
	
	
	
	
	ses2.close();
	
	
	
	
	
}
	
	
}
