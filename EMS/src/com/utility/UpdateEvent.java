package com.utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ems.dto.Event;
import com.ems.dto.Location;
import com.ems.dto.Speaker;

public class UpdateEvent {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Event e = (Event) session.load(Event.class, 1104);
		e.setE_name(e.getE_name());
		Location l = e.getLocation();
		Location loc = (Location) session.load(Location.class, l.getLoc_id());
		loc.setLoc_name("210 MG Road Indore");
		Set sp = e.getSpeaker();
		Iterator it = sp.iterator();
		while (it.hasNext()) {
			Speaker s = (Speaker) it.next();
			System.out.println(s.getSpeaker_id());
			s.setSpeaker_name("Abhishek");

		}
		session.merge(loc);
		tx.commit();
		System.out.println("Update  SuccessFully");
	}
}
