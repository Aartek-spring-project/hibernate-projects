package com.ems.dto;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "attenders")
public class Attenders {
	private Integer aid;
	private String aname;
	private List<Event> ali;

	@Id
	@Column(name = "aid")
	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	@Column(name = "aname")
	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	@ManyToMany(targetEntity = Event.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinTable(name = "event_attenders", joinColumns = @JoinColumn(name = "aid", referencedColumnName = "aid"), inverseJoinColumns = @JoinColumn(name = "eid", referencedColumnName = "eid"))

	public List<Event> getAli() {
		return ali;
	}

	public void setAli(List<Event> ali) {
		this.ali = ali;
	}

}
