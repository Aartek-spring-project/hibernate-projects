package com.critJoin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "AdminDto")
public class AdminDTO {

	@Id
	@GeneratedValue
	@Column(name = "aid")
	@JoinColumn(name = "id")
	private int id;
	@Column(name = "AdminuserName")
	private String UserName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	
	
}
