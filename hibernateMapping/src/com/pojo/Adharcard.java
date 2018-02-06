package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adhar")
public class Adharcard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long adharno;
	
	public Adharcard(){
		
	}

	public Adharcard(long adharno) {
		super();
		this.adharno = adharno;
	}

	public long getAdharno() {
		return adharno;
	}

	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}

	
	
}
