package com.users;
import com.customers.Address;

public class R_Employee{
   private int id;
   private String firstName; 
   private String lastName;   
   private int salary;
   private R_Address address;

   public int getId() {
      return id;
   }
   public void setId( int id ) {
      this.id = id;
   }
   public String getFirstName() {
      return firstName;
   }
   public void setFirstName( String first_name ) {
      this.firstName = first_name;
   }
   public String getLastName() {
      return lastName;
   }
   public void setLastName( String last_name ) {
      this.lastName = last_name;
   }
   public int getSalary() {
      return salary;
   }
   public void setSalary( int salary ) {
      this.salary = salary;
   }
public R_Address getAddress() {
	return address;
}
public void setAddress(R_Address address) {
	this.address = address;
}

  
}
