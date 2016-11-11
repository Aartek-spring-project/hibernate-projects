package com;
// Generated Jul 11, 2016 10:54:54 PM by Hibernate Tools 3.4.0.CR1

/**
 * EventAttendersId generated by hbm2java
 */
public class EventAttendersId implements java.io.Serializable {

	private int aid;
	private int eid;

	public EventAttendersId() {
	}

	public EventAttendersId(int aid, int eid) {
		this.aid = aid;
		this.eid = eid;
	}

	public int getAid() {
		return this.aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getEid() {
		return this.eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EventAttendersId))
			return false;
		EventAttendersId castOther = (EventAttendersId) other;

		return (this.getAid() == castOther.getAid()) && (this.getEid() == castOther.getEid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAid();
		result = 37 * result + this.getEid();
		return result;
	}

}