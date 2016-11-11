package com.prestige;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
 
import org.hibernate.HibernateException;
import org.hibernate.Query;
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
		//print Training table
		 Query qry=session.createQuery("from Training c");
		 System.out.println("Get Records from Training");
		    List l=qry.list();
		    Iterator it = l.iterator();
		    while(it.hasNext())
		    {
		    	Object o = it.next();
		    	Training c = (Training)o;
		    	System.out.println("Trainer ID : "+c.getTraining_id());
		    	System.out.println("Training Subject : "+c.getTraining_name());
		       	Set v= c.getStudent();
		    	
		    	
		    	
		    }
	 
		    session.close();
			    System.out.println("many to one select done..!!");
			    factory.close();       
	 
		}		
}