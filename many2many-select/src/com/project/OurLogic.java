package com.project;
import java.util.Date;
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
	long time=	System.nanoTime();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
		//print Training table
		 Query qry=session.createSQLQuery("SELECT * FROM employee e,project p WHERE e.empId=p.pId AND p.pId=1");
		 System.out.println("Get Records from Training");
		    Iterator l=qry.list().iterator();
		    
		    while(l.hasNext())
		    {
		    Object[] o=(Object[])	l.next();
		   
		    System.out.println("Employee Id :"+o[0]);
		    System.out.println("FName "+o[1]);
		    System.out.println("LName "+o[2]);
		    System.out.println("Project ID "+o[3]);
		    System.out.println("Project Name :"+o[4]);
		    System.out.println("Date :"+o[5]);
		    
		    }
		    
		    
		    
	/*	    
		    Iterator it = l.iterator();
		    
		    while(it.hasNext())
		    {
		    	Object o = it.next();
		    	Employee c = (Employee)o;
		    	System.out.println("Trainer ID : "+c.getEmpId());
		    	System.out.println("Training Subject : "+c.getfName());
		     //  	Set v= c.getStudent();
		    	*/
		    	
		    
		    
		              
		
		
		    session.close();
			    System.out.println("many to one select done..!!");
			    long time1=	System.nanoTime();
			    long total=time1-time;
			    factory.close();       
	 
		}		
}