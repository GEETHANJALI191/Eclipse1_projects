package com.pojo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int sid;
	String sname;
	public Student()
	{
		
	}
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="adharnumber")
	Adharcard a=new Adharcard();
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", a=" + a + ", phones=" + phones + "]";
	}


	public Adharcard getA() {
		return a;
	}


	public void setA(Adharcard a) {
		this.a = a;
	}

	@OneToMany(mappedBy="std")
	@ElementCollection
	private Collection<Phone> phones=new ArrayList<Phone>();
	


	public Collection<Phone> getPhones() {
		return phones;
	}


	public void setPhones(Collection<Phone> phones) {
		this.phones = phones;
	}


	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	

}
