package com.prestige;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondCache {




   public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		
	//	SessionFactory session=new Configuration().configure().buildSessionFactory();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session1 = factory.openSession();
		Object o=session1.load(UserDTO.class,new Integer(1));
 
		UserDTO s=(UserDTO)o;
		System.out.println("address"+s.getAddress());
		System.out.println("Object Loaded successfully.....!!");
		session1.close();
 
		System.out.println("------------------------------");
		System.out.println("Waiting......");
 
		try{
			Thread.sleep(100000);
		}
		catch (Exception e) {
		}		
 
		System.out.println("6 seconds compelted......!!!!!!!!");
 
		Session session2 = factory.openSession();
		Object o2=session2.load(UserDTO.class,new Integer(1));
 
		UserDTO s2=(UserDTO)o2;
		System.out.println("address"+s2.getAddress());
		System.out.println("Object loaded from the database...!!");
		session2.close();
 
		Session session3 = factory.openSession();
		Object o3=session3.load(UserDTO.class,new Integer(1));
 
		UserDTO s3=(UserDTO)o3;
		System.out.println("address"+s3.getAddress());
		System.out.println("Object loaded from global cache successfully.....!!");
		session3.close();
 
		factory.close();
		
	
	
}
	
}
