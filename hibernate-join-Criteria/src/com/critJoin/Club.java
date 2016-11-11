package com.critJoin;

import javax.annotation.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="club")
public class Club {
	@GeneratedValue
	@Id
	@Column(name="clubId")
	private int id;
	@Column(name="name")
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
