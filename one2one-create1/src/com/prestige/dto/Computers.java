package com.prestige.dto;
import java.util.Set;

	
	 
	public class Computers {
	 
		private int cid;  
		private String comp_desc;  
		
		private Employees e;

		public int getCid() {
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}

		public String getComp_desc() {
			return comp_desc;
		}

		public void setComp_desc(String comp_desc) {
			this.comp_desc = comp_desc;
		}

		public Employees getE() {
			return e;
		}

		public void setE(Employees e) {
			this.e = e;
		}
		
}
