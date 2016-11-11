package com;



import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Attenders;
import com.Company;
import com.Event;
import com.Location;
import com.Manager;
import com.Speaker;

public class Main {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Event e = new Event();
		e.setEid(1104);
		e.setEname("Java");

		Attenders ad = new Attenders();
		ad.setAid(254);
		ad.setAname("Abhishek");

		Attenders ad1 = new Attenders();
		ad1.setAid(255);
		ad1.setAname("Pradeep");

		Company comp = new Company();
		comp.setCompId(303);
		comp.setCompName("Websource");

		Speaker sp = new Speaker();
		sp.setSpeakid(402);
		sp.setSName("niket");

		Location lc = new Location();
		lc.setLocId(502);
		lc.setLocName("Bhopal");

		Manager m = new Manager();
		m.setMname("Ajay Sir");
		m.setMid(201);

		Set s = new HashSet();
		s.add(e);

		Set s1 = new HashSet();
		s1.add(e);
		// sp.setSpeakerval(s1);

		List s3 = new ArrayList();
		s3.add(e);
		// ad.setAli(s3);

		e.setLocation(lc);
	//	e.setManagers(m);
		
		// e.setSpeaker(s1);
		m.setEvent(e);
	//sp.setSpeakid(s1);
		//ad.setAid(s3);
		comp.setEvents(s);

		// session.save(ad);
		session.save(e);
		session.save(m);
		session.save(lc);
		session.save(comp);
		session.save(sp);
		session.save(ad);
		tx.commit();
		System.out.println("Done");
	}
}