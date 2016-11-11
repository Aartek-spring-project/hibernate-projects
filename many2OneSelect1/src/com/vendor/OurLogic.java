package com.vendor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OurLogic {

	public static void main(String args[])
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
		
		Object o = session.get(Product.class, new Integer(1));		 
		Product c = (Product)o;
		
		System.out.println("Product : "+c.getpName());
		System.out.println("price :"+c.getPrice());
		Supplier v=c.getParentObjects();
		System.out.println("Supplier :"+v.getsName());  
		    session.close();
		    System.out.println("many to one delete done..!!");
		    factory.close();       

		
	}
}
