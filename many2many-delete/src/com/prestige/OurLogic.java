package com.prestige;
import java.util.HashSet;
import java.util.Set;
 
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 

 
public class OurLogic {
 
   
     
    public static void main(String[] args) {
         
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
		Transaction transaction=session.beginTransaction();
		Book b = (Book)session.get(Book.class,1 );
		session.delete(b);
        transaction.commit();
        session.close();
        
        
     //   suh.updateManyToManyHibernateMappingExample(student);
    }
}