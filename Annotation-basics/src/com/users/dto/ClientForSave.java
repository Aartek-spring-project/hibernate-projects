package com.users.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;;
 
public class ClientForSave { 
	 
    public static void main(String[] args)
    {
 
    	Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
 
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Product p=new Product(); 
 
        p.setProductId(107);
        p.setProName("Java4s");
        p.setPrice(18000);
 
        Transaction tx = session.beginTransaction();
        session.save(p);
        System.out.println("Object saved successfully using annotations.....!!");
        tx.commit();
        session.close();
        factory.close();
    }
 
}