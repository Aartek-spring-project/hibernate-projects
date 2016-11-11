package com.ems.dto;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "event")
public class Event {
	private Integer event_id;
	private String e_name;
	private Location location;

	private Manager manager;
	private Set<Speaker> sid;
	private List<Attenders> attender;

	@Id
	@Column(name = "eid")
	public Integer getEvent_id() {
		return event_id;
	}

	public void setEvent_id(Integer event_id) {
		this.event_id = event_id;
	}

	@Column(name = "ename")
	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	@ManyToOne(targetEntity = Location.class, cascade = CascadeType.ALL)
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@ManyToMany(targetEntity = Speaker.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinTable(name = "event_speaker", joinColumns = @JoinColumn(name = "eid", referencedColumnName = "eid"), inverseJoinColumns = @JoinColumn(name = "speakid", referencedColumnName = "speakid"))
	public Set<Speaker> getSpeaker() {
		return sid;
	}

	public void setSpeaker(Set<Speaker> speaker) {
		this.sid = speaker;
	}

	@OneToOne(targetEntity = Manager.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "eid", referencedColumnName = "eid")
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@ManyToMany(targetEntity = Attenders.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinTable(name = "event_attenders", joinColumns = @JoinColumn(name = "eid", referencedColumnName = "eid"), inverseJoinColumns = @JoinColumn(name = "aid", referencedColumnName = "aid"))
	public List<Attenders> getAttender() {
		return attender;
	}

	public void setAttender(List<Attenders> attender) {
		this.attender = attender;
	}

}
