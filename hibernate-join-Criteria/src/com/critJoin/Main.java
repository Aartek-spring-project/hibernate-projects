package com.critJoin;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.critJoin.*;


public class Main {

	public static void main(String[] args) {
		
	
	
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");		
	SessionFactory sessionf=new Configuration().configure().buildSessionFactory();
	Session session=sessionf.openSession();	
	
	Criteria criteria = session.createCriteria(Club.class,"club")
		    .createAlias("club.team","team")
		    .add(Restrictions.eq("club.name", "Arsenal"))
		    .add(Restrictions.eq("team.teamname", "Team A"));
		    List list = criteria.list();
    
		    System.out.println("Output");
	
		session.close();
}
	
}

