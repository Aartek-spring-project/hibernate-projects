package com.prestige;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OurLogic {
    //Many To One Select All Child Objects With Parents
	public static void main(String args[])
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
		
		 Query qry=session.createQuery("from Pets c");
		 
		    List l=qry.list();
		    Iterator it = l.iterator();
		    while(it.hasNext())
		    {
		    	Object o = it.next();
		    	Pets c = (Pets)o;
		    	System.out.println("Category : "+c.getPetCategory());
		    	Owner v=c.getParentObjects();
		    	System.out.println("Owner :"+v.getOwnerName());
		    }
	 
		    session.close();
			    System.out.println("many to one select done..!!");
			    factory.close();       
	 
		}		
	}

