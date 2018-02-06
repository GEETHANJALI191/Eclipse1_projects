package com.orchard.program;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Team_Lead")
public class TeamLead {
	@Id
	@Column(name="Mid")
	private int mid;
	@Column(name="Name")
	private String leadName;
	@Column(name="Track")
	private String track;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
}
