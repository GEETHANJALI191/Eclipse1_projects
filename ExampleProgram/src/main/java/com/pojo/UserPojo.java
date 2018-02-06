package com.pojo;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity	
@Table(name="usertable")
public class  UserPojo{
	@Id								
	private int userid;
	private String fristname;
	private String lastname;
	private Date dob;
@Column(name="userid")
@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return userid;
	}

	public void setId(int userid) {
		this.userid = userid;
	}

@Column(name="firstname")
	public String getFirstname() {
		return fristname;
	}

	public void setFirstname(String fristname) {
		this.fristname = fristname;
	}

@Column(name="lastname")
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

@Column(name="dob")
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
