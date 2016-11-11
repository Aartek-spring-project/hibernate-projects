package com.prestige;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

public class DitachedCriteria {
   public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session1 = factory.openSession();
		DetachedCriteria dt=DetachedCriteria.forClass(UserDTO.class);
		//dt.add( Restrictions.like("firstname", "a%"));
		//dt.add( Restrictions.between("salary", 1000, 2000));
		dt.add(Restrictions.idEq(1));
		List<UserDTO> rs=dt.getExecutableCriteria(session1).list();
	    //Criteria executableCriteria = dt.getExecutableCriteria(getc);
		for(UserDTO ud:rs)
			{
		     	System.out.println(ud.getId());
				System.out.println(ud.getFirstname());
				System.out.println(ud.getAddress());
				System.out.println("--------------");
			}
		session1.close();
		}
	
}
