package com.orchard.program;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Campus_Minds")
public class CampusMinds {
@Id
@Column(name="Mid")
private int mid;
private String mindname;
private String track;
@OneToOne
private TeamLead tl;

public TeamLead getTl() {
	return tl;
}
public void setTl(TeamLead tl) {
	this.tl = tl;
}


public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getMindname() {
	return mindname;
}
public void setMindname(String mindname) {
	this.mindname = mindname;
}
public String getTrack() {
	return track;
}
public void setTrack(String track) {
	this.track = track;
}

}
