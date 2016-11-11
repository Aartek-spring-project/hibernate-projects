
package com.prestige;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;




public class Aggregation {

public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");		
		SessionFactory session=new Configuration().configure().buildSessionFactory();
		Session s=session.openSession();		
		Criteria crit = s.createCriteria(UserDTO.class);
	   
	    //ProjectionList p1=Projections.projectionList();
        //p1.add(Projections.id());
        //p1.add(Projections.property(""));	
		//crit.setProjection(Projections.min("mobile"));
		//crit.setProjection(Projections.count("mobile"));
		//crit.setProjection(Projections.max("mobile"));
		crit.setProjection(Projections.avg("mobile"));
		crit.setProjection(Projections.property("UserName"));
		List results = crit.list();
        Iterator it=results.iterator();
		/*while(it.hasNext())
		{
			Double ud=(Double)it.next();
		    System.out.println("Total  :"+ud);
		   
			System.out.println("----------");
		}*/
        //for using "Projections.property"
        while(it.hasNext())
		{
		    String ud=(String)it.next();
		    System.out.println("Id :"+ud);
		   
		}
		
			s.close();
	}
	
	

}
