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

import com.ems.dto.Event;
import com.ems.dto.Manager;

public class DeleteEvent {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		/*
		 * Event e = new Event(); e.setEvent_id(1104);
		 * 
		 * session.delete(e);
		 */
		
		Object e = session.load(Event.class, new Integer(1104));
		Event o = (Event) e;
		Manager mmm = o.getManager();
		Object m = session.load(Manager.class, new Integer(201));
		Manager o1 = (Manager) m;
		session.delete(o1);
		/*
		 * Event e = new Event(); e.setEvent_id(1104); session.delete(e);
		 */
		tx.commit();
		System.out.println("Delete SuccessFully");
	}
}