package com.gontuseries.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name="STUDENT_INFORMATION")
public class Student_Info {

	@Id 
	private int    roll_no;

	@Transient
	@Column(name="FULL_NAME", nullable=false)
	private String name;

	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Student_Info() {
		
	}
	
	public Student_Info(String name, int roll_no, Date date) {
		
		this.name    = name;
		this.roll_no = roll_no;
		this.birthDate = date;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
