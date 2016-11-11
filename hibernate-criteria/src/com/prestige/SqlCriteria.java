package com.prestige;

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




public class SqlCriteria {

public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");		
		SessionFactory session=new Configuration().configure().buildSessionFactory();
		Session s=session.openSession();		
		Criteria crit = s.createCriteria(UserDTO.class);
	    //crit.add(Restrictions.eq("UserName","abhi"));
	    //crit.add(Restrictions.gt("mobile",new Long (5000)));
        //crit.add(Restrictions.lt("mobile",new Long (5000)));
        //crit.add(Restrictions.like("UserName", "a%"));
	   
		
		List results = crit.list();
        Iterator it=results.iterator();
		while(it.hasNext())
		{
		    UserDTO ud=(UserDTO)it.next();
		    System.out.println("Id :"+ud.getId());
		    System.out.println("Name :"+ud.getUserName());
			System.out.println("City :"+ud.getAddress());
			System.out.println("----------");
		}
		
			s.close();
	}
	
	

}
