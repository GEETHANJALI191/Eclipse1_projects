package com.daniel.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity										//used to map given class to table in db
public class Application {
	@Id									//used to map object with defined minds table

	private int userid;
	private String fristname;
	private String lastname;
	private Date dob;

	public int getId() {
		return userid;
	}

	public void setId(int userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return fristname;
	}

	public void setFirstname(String fristname) {
		this.fristname = fristname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstName=" + fristname
				+ ", lastName=" + lastname + ", dob=" + dob + "]";  
	}
}
