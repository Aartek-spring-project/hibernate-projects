package com.address;
import java.util.HashSet;
import java.util.Set;
 
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prestige.Book;
 

 
public class OurLogic {
 
   
     
    public static void main(String[] args) {
         
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
		Transaction transaction=session.beginTransaction();
		People p = (People)session.get(People.class,1 );
		session.delete(p);
        transaction.commit();
        session.close();
        
        
        
     //   suh.updateManyToManyHibernateMappingExample(student);
    }
}