package com.ems.dto;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "company")
public class Company {
	private Integer comp_id;
	private String comp_name;
	private Set<Event> event;

	@Id
	@Column(name = "comp_id")
	public Integer getComp_id() {
		return comp_id;
	}

	public void setComp_id(Integer comp_id) {
		this.comp_id = comp_id;
	}

	@Column(name = "comp_name")
	public String getComp_name() {
		return comp_name;
	}

	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}

	@OneToMany(targetEntity = Event.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "comp_id", referencedColumnName = "comp_id")
	public Set<Event> getEvent() {
		return event;
	}

	public void setEvent(Set<Event> event) {
		this.event = event;
	}

}
