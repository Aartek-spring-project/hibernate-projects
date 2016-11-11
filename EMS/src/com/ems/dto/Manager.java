package com.ems.dto;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "manager")
public class Manager {
	private Integer mgr_id;
	private String mgr_name;

	private Event event;

	@Id
	@Column(name = "mid")
	public Integer getMgr_id() {
		return mgr_id;
	}

	public void setMgr_id(Integer mgr_id) {
		this.mgr_id = mgr_id;
	}

	@Column(name = "mname")
	public String getMgr_name() {
		return mgr_name;
	}

	public void setMgr_name(String mgr_name) {
		this.mgr_name = mgr_name;
	}

	/*
	 * @OneToOne(fetch = FetchType.LAZY, mappedBy = "manager", cascade =
	 * CascadeType.ALL)
	 */
	@OneToOne(targetEntity = Event.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "eid", referencedColumnName = "eid")
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {

		this.event = event;
	}

}
