package com.ems.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Location {
	private Integer loc_id;
	private String loc_name;

	@Id
	@Column(name = "loc_id")
	public Integer getLoc_id() {
		return loc_id;
	}

	public void setLoc_id(Integer loc_id) {
		this.loc_id = loc_id;
	}

	@Column(name = "loc_name")
	public String getLoc_name() {
		return loc_name;
	}

	public void setLoc_name(String loc_name) {
		this.loc_name = loc_name;
	}

}
