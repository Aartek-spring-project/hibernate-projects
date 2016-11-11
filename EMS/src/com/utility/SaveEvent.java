package com.utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ems.dto.Attenders;
import com.ems.dto.Company;
import com.ems.dto.Event;
import com.ems.dto.Location;
import com.ems.dto.Manager;
import com.ems.dto.Speaker;

public class SaveEvent {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Event e = new Event();
		e.setEvent_id(1104);
		e.setE_name("Java");

		Attenders ad = new Attenders();
		ad.setAid(254);
		ad.setAname("Abhishek");

		Attenders ad1 = new Attenders();
		ad1.setAid(255);
		ad1.setAname("Pradeep");

		Company comp = new Company();
		comp.setComp_id(303);
		comp.setComp_name("Websource");

		Speaker sp = new Speaker();
		sp.setSpeaker_id(402);
		sp.setSpeaker_name("niket");

		Location lc = new Location();
		lc.setLoc_id(502);
		lc.setLoc_name("Bhopal");

		Manager m = new Manager();
		m.setMgr_name("Ajay Sir");
		m.setMgr_id(201);

		Set s = new HashSet();
		s.add(e);

		Set s1 = new HashSet();
		s1.add(e);
		// sp.setSpeakerval(s1);

		List s3 = new ArrayList();
		s3.add(e);
		// ad.setAli(s3);

		e.setLocation(lc);
		e.setManager(m);
		
		// e.setSpeaker(s1);
		m.setEvent(e);
		sp.setSpeakerval(s1);
		ad.setAli(s3);
		comp.setEvent(s);

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