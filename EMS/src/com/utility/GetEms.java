package com.utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetEms {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		SQLQuery query = session.createSQLQuery("SELECT * FROM event e,location l,company c WHERE e.eid=1104");

		List results = query.list();
		Iterator i = results.iterator();
		while (i.hasNext()) {
			Object[] a = (Object[]) i.next();
			System.out.println("---------------------");
			System.out.println("Event Id :" + a[0].toString());
			System.out.println("Event Name :" + a[1].toString());
			System.out.println("Event Organizer :" + a[7].toString());
			System.out.println("Location :" + a[5].toString());
			System.out.println("---------------------");
		}
		tx.commit();
		System.out.println("Done");
	}
}