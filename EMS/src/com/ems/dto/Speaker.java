package com.ems.dto;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "speaker")
public class Speaker {

	private Integer speakid;
	private String speaker_name;

	private Set<Event> speakerval;

	@Id
	@Column(name = "speakid")
	public Integer getSpeaker_id() {
		return speakid;
	}

	public void setSpeaker_id(Integer speaker_id) {
		this.speakid = speaker_id;
	}

	@Column(name = "s_name")
	public String getSpeaker_name() {
		return speaker_name;
	}

	public void setSpeaker_name(String speaker_name) {
		this.speaker_name = speaker_name;
	}

	// @ManyToMany(targetEntity=Event.class,mappedBy="sid")
	@ManyToMany(targetEntity = Event.class, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinTable(name = "event_speaker", joinColumns = @JoinColumn(name = "speakid", referencedColumnName = "speakid"), inverseJoinColumns = @JoinColumn(name = "eid", referencedColumnName = "eid"))
	public Set getSpeakerval() {
		return speakerval;
	}

	public void setSpeakerval(Set<Event> speakerval) {
		this.speakerval = speakerval;
	}

}
