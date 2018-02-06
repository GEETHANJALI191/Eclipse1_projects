package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="phone")
public class Phone {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long phno;
	@ManyToOne
	@JoinColumn(name="phone_student")
	Student std;
	
	
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	
	public Phone()
	{
		
	}
	
	public Phone(long phno, Student std) {
		super();
		this.phno = phno;
		this.std = std;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Phone [phno=" + phno + ", std=" + std + "]";
	}

	
	
	
}
