package com.prestige;

import java.util.*;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;

public class QueryLevel {




   public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		
	//	SessionFactory session=new Configuration().configure().buildSessionFactory();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
	//	 Query query = session.createQuery("from UserDTO u where u.id=1");
		
		 DetachedCriteria q = DetachedCriteria.forClass(UserDTO.class)
				    .add( Property.forName("address").eq("indore") );
		 List results = q.getExecutableCriteria(session).setMaxResults(100).list();
		 
		 Iterator it=results.iterator();
		 while(it.hasNext())
		 {
			 
			UserDTO ud=(UserDTO) it.next();
			System.out.println(ud.getId()+" : "+ud.getUserName()+" - " +ud.getAddress()); 
			
		 }
		 
		 
		 
		 tx.commit();
		 session.close();
	
	
}
	
}
