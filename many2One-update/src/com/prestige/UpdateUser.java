package com.prestige;

import java.util.*;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateUser {
	 public void updateManyToOneUpdateMapping(StudentCourse student_prm,SessionFactory factory)
	    {
	        Session session = factory.openSession();
	        Transaction transaction = null;
	        try {
	            transaction = session.beginTransaction();
	             
	            long course_id = student_prm.getCourse_id();
	            StudentCourse studentcourse = 
	                 (StudentCourse)session.get(StudentCourse.class, course_id);
	            studentcourse.setCourse_name(student_prm.getCourse_name());
	            studentcourse.setCourse_duration(student_prm.getCourse_duration());
	            session.update(studentcourse);
	            transaction.commit();
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	    }
   public static void main(String[] args) 
	   {
		   
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml"); 
	 
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();		
			Transaction tx=session.beginTransaction();
			UpdateUser suh = new UpdateUser();
			  StudentCourse studentcourse = new StudentCourse();
		        studentcourse.setCourse_id(1);
		        studentcourse.setCourse_name("Electronic Science");
		        studentcourse.setCourse_duration(5);
		        suh.updateManyToOneUpdateMapping(studentcourse,factory);
			tx.commit();
	        session.close();
			System.out.println("many to one Update done..!!");
			    factory.close();       
	 
		}
}