package com.railway;

import java.util.*;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.prestige.StudentCourse;
import com.prestige.UpdateUser;

public class ManageRailwayEmployee {
   
	 public void updateManyToOneUpdateMapping(R_Employee r,SessionFactory factory)
	    {
	        Session session = factory.openSession();
	        Transaction transaction = null;
	        try {
	            transaction = session.beginTransaction();
	             
	            long eid = r.getId();
	            R_Address ad = 
	                 (R_Address)session.get(R_Address.class, eid);
	   //         ad.set((r.getAddress());
	       //     ad.setCourse_duration(r.getAddress());
	            session.update(ad);
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
			ManageRailwayEmployee m=new ManageRailwayEmployee();
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();		
			Transaction tx=session.beginTransaction();
			UpdateUser suh = new UpdateUser();
			  R_Employee  r = new R_Employee();
		        r.setId(1);
		        r.setFirstName("Abhishe");;
		        r.setLastName("Chouhan");
		      r.setSalary(6000);
		      
		    /*  R_Address  ad=new R_Address();
		      ad.setId(2);
		      ad.setCity("Bhopal");
		      ad.setZipcode("5555");
		      ad.setState("Mp");
		      
		      r.setAddress(ad);*/
		      
	//	      session.update(r);
		      
		      int eid = r.getId();
	            R_Address ad = 
	                 (R_Address)session.get(R_Address.class, eid);
	          ad.setCity("cIndore");
	       //     ad.setCourse_duration(r.getAddress());
	            session.update(ad);
		      
		      
		      
		      
		      
		      
		      
		      
		      
		    //    m.updateManyToOneUpdateMapping(r,factory);
			tx.commit();
	        session.close();
			System.out.println("many to one Update done..!!");
			    factory.close();       
	 
		}
}