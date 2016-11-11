package org.alexsotob.querycache;


import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class WhenDnaIsRequired {

	@Autowired
	private SessionFactory sessionFactory;

	

	@Test
	public void fiftyFirstDnaSequenceShouldBeReturnedAndCached() throws Exception {

		for (int i = 0; i < 5; i++) {

			Session session = sessionFactory.openSession();
			session.beginTransaction();
			
			Time elapsedTime = new Time("findDna"+i);
			
			List<Dna> list = session.createQuery(
					"from dna").setFirstResult(0).setMaxResults(50).setCacheable(true).list();
			
			
			session.getTransaction().commit();
			session.close();
			System.out.println("************************************");
			elapsedTime.miliseconds(System.out);
			System.out.println("************************************");

			for (Dna dna : list) {
				System.out.println(dna);
			}
			
		}

	}

}
