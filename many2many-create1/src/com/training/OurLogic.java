package com.training;

import java.util.HashSet;
import java.util.Set;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class OurLogic {
 
	public static void main(String args[])
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
 
		Training t1=new Training();
		
		t1.settName("Ajay Sir");
		t1.settSubject("Hibernate");
		t1.settId(1);
 
	/*	Training t2=new Training();
		t2.settId(2);
		t2.settName("Naveen Sir");
		t2.settSubject("Java");
 */
		Course_t c1=new Course_t();
		
		c1.setCourseName("Hibernate");
		c1.setDuration(7);
		c1.setCourseId(500);
/*		Course_t c2=new Course_t();
		c2.setCourseId(501);
		c2.setCourseName("Java");
		c2.setDuration(30);
*/ 
		Set s =new HashSet();
		      s.add(c1);
//		      s.add(c2);
 
		t1.setCourses(s);
		//t2.setCourses(s);
 
		    Transaction tx = session.beginTransaction();
 
		                      session.save(t1);
		  //                    session.save(t2);
 
		    tx.commit();
 
		    session.close();
		    System.out.println("Many To Many  is Done..!!");
		    factory.close();
 
	}
}