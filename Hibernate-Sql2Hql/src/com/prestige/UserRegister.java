package com.prestige;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class UserRegister {
	
public static void  findAdrress(Session s)
			{
				Transaction t=s.beginTransaction();
				//SQLQuery query = s.createSQLQuery("select * from register where address=?");
	
				Query query =s.createQuery("from UserDTO where address=:address");
				query.setString("address","indore");
				//query.addEntity(UserDTO.class);
				//query.setParameter(0, "bhopal");
				List results = query.list();
				Iterator i=results.iterator();
				// List<Object[]> entities = query.list();
				while(i.hasNext())
					{
						UserDTO ud=(UserDTO)i.next();
						System.out.println(ud.getAddress())    	;
					}
						int a=	query.executeUpdate();
						System.out.println("ok"+a);
						t.commit();    
		            }
	

public static void  findColumns(Session s)
	{
				SQLQuery query = s.createSQLQuery("select * from register where id=1 ").addEntity(UserDTO.class);
				//	Query query = s.createQuery("from UserDTO  where id=1");	
				//	List result = query.list(); 
				List result = query.list(); 
				Iterator it=result.iterator();
				while(it.hasNext())
					{
						UserDTO ud=	(UserDTO) it.next();
						System.out.println(ud.getAddress());
					}
				/*for(int i=0;i<result.size();i++)
				{
	    		Object[] data = result.get(i);
	    		System.out.println("Employee ID " + data[0]);
	    		System.out.println("Employee Name " + data[1]);
	    		System.out.println("last Name" + data[2]);   
	 
	    		System.out.println("=====================");
				}*/
			}
public static void  searchUser(Session s)
		{	 		
	     	String keyword = "a";
            //SQLQuery query = s.createSQLQuery("select * from register where  username LIKE 'n%'").addEntity(UserDTO.class);
	 	    Query query = s.createQuery("from UserDTO u  where u.UserName like :keyword");
	        //query.setParameter("keyword",keyword + "%");
	 	    List result = query.setParameter("keyword",keyword + "%").list();
	 	    //List result = query.list(); 
	 	    Iterator it=result.iterator();
	 	    while(it.hasNext())
	         {
	 	    	UserDTO ud=	(UserDTO) it.next();		
	 	    	System.out.println(ud.getAddress());
	         }
	 	    s.close();
		}

public static void deleteUser(Session s) {
		 //  SQLQuery query = s.createSQLQuery("delete from  register where id=2");
	 	     Query query = s.createQuery("delete from UserDTO where  id=:status");
	 	     query.setInteger("status", 2);
		     int rowsDeleted=query.executeUpdate();
		     System.out.println("Successfully Deleted "+rowsDeleted);
		     Transaction tx=s.beginTransaction();
	         tx.commit();
	 	      s.close();
	   }  

public static void updateUser(Session s) {
			  //SQLQuery query = s.createSQLQuery("update register set ADDRESS='bhopal' where id=1");
		 	  Query query = s.createQuery("update UserDTO set address=:address where id=:id");
		 	  query.setString("address", "Indore");
		 	  query.setInteger("id", 1);
			  int rowsDeleted=query.executeUpdate();
			     
			  System.out.println("Successfully Update "+rowsDeleted);
			  Transaction tx=s.beginTransaction();
			     
		      tx.commit();
		 	  s.close();
			  }
public static void avgNumber(Session s) {
		  //  SQLQuery query = s.createSQLQuery("SELECT avg(mobile) FROM register");
	 	     Query query = s.createQuery("SELECT avg(mobile) FROM UserDTO");
	 	     List result=query.list();
		     Iterator itr=result.iterator();
			 while(itr.hasNext())
			     {
				// BigDecimal e=(BigDecimal)itr.next();
				   Double e=(Double)itr.next();
				    System.out.print("Total Average "+e);	
			     }
		     Transaction tx=s.beginTransaction();
		     tx.commit();
		     s.close();
		  }
public static void countNumber(Session s) {
			 SQLQuery query = s.createSQLQuery("SELECT count(id) FROM register");
		 	 //Query query = s.createQuery("SELECT count(id) FROM UserDTO");
		 	 List result=query.list();
			 Iterator itr=result.iterator();
			 while(itr.hasNext())
				     {
					// BigDecimal e=(BigDecimal)itr.next();
					 BigInteger e=(BigInteger)itr.next();
					// Long e=(Long)itr.next();
					    System.out.print("Total Count "+e);	
				     }

			   Transaction tx=s.beginTransaction();
			   tx.commit();
			   s.close();
		  }
public static void maxNumber(Session s) {
		     //SQLQuery query = s.createSQLQuery("SELECT max(mobile) FROM register");
	 	     Query query = s.createQuery("SELECT max(mobile) FROM UserDTO");
	 	     List result=query.list();
		     Iterator itr=result.iterator();
			 while(itr.hasNext())
			     {
				
				// Integer e=(Integer)itr.next(); 
				 Long e=(Long)itr.next();
				    System.out.print(e);	
			     }
		     Transaction tx=s.beginTransaction();
		     tx.commit();
		     s.close();
		  }
public static void minNumber(Session s) {
			 SQLQuery query = s.createSQLQuery("SELECT min(mobile) FROM register");
		 	  //  Query query = s.createQuery("SELECT min(mobile) FROM UserDTO");
		 	  List result=query.list();
			  Iterator itr=result.iterator();
			  while(itr.hasNext())
				     {
					   Integer e=(Integer)itr.next(); 
					// Long e=(Long)itr.next();
					    System.out.print("Minumum :"+e);	
				     }

			   Transaction tx=s.beginTransaction();
			   tx.commit();
			   s.close();
		 }
public static void usingAndOr(Session s) {
		    // And Query
			// SQLQuery query = s.createSQLQuery("SELECT * FROM register where user_name='abhi' AND address='indore'");
		    // query.addEntity(UserDTO.class);
			// Or Query
			   SQLQuery query = s.createSQLQuery("SELECT * FROM register where user_name='abhi' OR address='indore'");
		       query.addEntity(UserDTO.class);
		    // Query query = s.createQuery("FROM UserDTO where UserName=:UserName AND address=:address");
		    // query.setString("UserName","abhi");
		    // query.setString("address","indore");
	 	       List result=query.list();
		       Iterator itr=result.iterator();
			   while(itr.hasNext())
			     {
				
				    Object e1=(Object)itr.next(); 
				    UserDTO e=(UserDTO)e1;
				    System.out.println("Id: "+e.getId()+" ");	
				    System.out.println("UserName  "+e.getUserName());
				    System.out.println("Address "+e.getAddress());
				    System.out.println("---------------");
			     }

		       Transaction tx=s.beginTransaction();
		       tx.commit();
		       s.close();
		  }
public static void sortById(Session s) {
         
			   //SQLQuery query = s.createSQLQuery("select * from register order by id ASC");
			   //query.addEntity(UserDTO.class);
			   Query query = s.createQuery("from UserDTO order by mobile DESC");
			   List result=query.list();
			   Iterator itr=result.iterator();
			   while(itr.hasNext())
				     {
					
					    Object e1=(Object)itr.next(); 
					    UserDTO e=(UserDTO)e1;
					    System.out.println("Id: "+e.getId()+" ");	
					    System.out.println("UserName  "+e.getUserName());
					    System.out.println("Address "+e.getAddress());
					    System.out.println("---------------");
				     }

				Transaction tx=s.beginTransaction();
				tx.commit();
				s.close();
  }
public static void paginationQuery(Session s) {

	   Query query = s.createQuery("from UserDTO");
	   query.setFirstResult(0);
	   query.setMaxResults(2);
	   List result=query.list();
	   Iterator itr=result.iterator();
	   while(itr.hasNext())
		     {
			
			    Object e1=(Object)itr.next(); 
			    UserDTO e=(UserDTO)e1;
			    System.out.println("Id: "+e.getId()+" ");	
			    System.out.println("UserName  "+e.getUserName());
			    System.out.println("Address "+e.getAddress());
			    System.out.println("---------------");
		     }

		Transaction tx=s.beginTransaction();
		tx.commit();
		s.close();
}
public static void comparisonQuery(Session s) {
    
	   SQLQuery query = s.createSQLQuery("select * from register where mobile>2500");
	   query.addEntity(UserDTO.class);
	   //Query query = s.createQuery("from UserDTO where mobile >2500");
	   List result=query.list();
	   Iterator itr=result.iterator();
	   while(itr.hasNext())
		     {
			
			    Object e1=(Object)itr.next(); 
			    UserDTO e=(UserDTO)e1;
			    System.out.println("Id: "+e.getId()+" ");	
			    System.out.println("UserName  "+e.getUserName());
			    System.out.println("Address "+e.getMobile());
			    System.out.println("---------------");
		     }

		Transaction tx=s.beginTransaction();
		tx.commit();
		s.close();
}
public static void sumNumber(Session s) {
    
	   SQLQuery query = s.createSQLQuery("select sum(mobile) from register");
	   //Query query = s.createQuery("select sum(mobile) from UserDTO");
	   List result=query.list();
	   Iterator itr=result.iterator();
	   while(itr.hasNext())
		     {
		           BigDecimal e=(BigDecimal)itr.next(); 
				   // Long e=(Long)itr.next();
				   System.out.println("Total Sum : "+e);	
		     }

		Transaction tx=s.beginTransaction();
		tx.commit();
		s.close();
}
public static void havingclause(Session s) {
    
	   SQLQuery query = s.createSQLQuery("SELECT * FROM register WHERE user_name='abhi' HAVING address='indore'");
	   query.addEntity(UserDTO.class);
	
	   //Query query = s.createQuery("from UserDTO WHERE user_name='abhi' HAVING address='indore'");
	   List result=query.list();
	   Iterator itr=result.iterator();
	   while(itr.hasNext())
	     {
		
		    Object e1=(Object)itr.next(); 
		    UserDTO e=(UserDTO)e1;
		    System.out.println("Id: "+e.getId()+" ");	
		    System.out.println("UserName  "+e.getUserName());
		    System.out.println("Address "+e.getMobile());
		    System.out.println("---------------");
	     }

		Transaction tx=s.beginTransaction();
		tx.commit();
		s.close();
}
		
	
public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory session=new Configuration().configure().buildSessionFactory();
		Session s=session.openSession();
		//findAdrress(s);
		//findColumns(s);
		//searchUser(s);
		//deleteUser(s);
		//updateUser(s);
		//havingclause(s);
		//avgNumber(s);
		//countNumber(s);
		//maxNumber(s);
		//minNumber(s);
		//usingAndOr(s);
		//sortById(s);
		//paginationQuery(s);
		//comparisonQuery(s);
		sumNumber(s);
		
	
	}
	
	
	
}
