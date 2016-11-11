package com.prestige;
import java.util.HashSet;
import java.util.Set;
 
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 

 
public class OurLogic {
 
   
     
    public static void main(String[] args) {
         
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
		  Transaction transaction=session.beginTransaction();
        Student student = new Student();
        student.setStudent_id(1);
        student.setStudent_roll_no("BT2013091545");
         
        Training training1 = new Training();
        training1.setTraining_name("New Hibernate Training");
         
        Training training2 = new Training();
        training2.setTraining_name("Modified Hibernate Mapping");
         
        Set<Training> set_training = new HashSet<Training>();
        set_training.add(training1);
        set_training.add(training2);
        student.setStudentTraining(set_training);
        
        long student_id = student.getStudent_id();
        Student studentobj = (Student)session.get(Student.class, student_id);
        studentobj.setStudent_roll_no(student.getStudent_roll_no());
        studentobj.setStudentTraining(student.getStudentTraining());
        session.update(studentobj);
        transaction.commit();
        session.close();
        
        
     //   suh.updateManyToManyHibernateMappingExample(student);
    }
}