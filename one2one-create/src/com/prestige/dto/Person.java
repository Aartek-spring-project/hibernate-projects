package com.prestige.dto;
import java.util.Set;

	
	 
	public class Person {
	 
		private int pid;  
		private String name,city;  
		private String passport_number;  
		private Passport p;
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getPassport_number() {
			return passport_number;
		}
		public void setPassport_number(String passport_number) {
			this.passport_number = passport_number;
		}
		public Passport getP() {
			return p;
		}
		public void setP(Passport p) {
			this.p = p;
		}
		
		
}
