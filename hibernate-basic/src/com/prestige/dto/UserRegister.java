package com.prestige.dto;
import com.prestige.dto.*;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
public class UserRegister {
	
	

	
	
public static void main(String[] args) {
	 


	      
	    //creating configuration object  
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=new Configuration().configure().buildSessionFactory(); 
	      System.out.println("created");
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	          
	    UserDTO ud=new UserDTO();
	   
		ud.setUserName("abhi");
		ud.setPassword("12345");
		
		ud.setAddress("208 indore");
		ud.setMobile("987456321");
	      
	    session.save(ud);//persisting the object  
	      
	    t.commit();//transaction is committed  
	    session.close();  
	      
	    System.out.println("successfully saved");  
	      
	
	
}
}
