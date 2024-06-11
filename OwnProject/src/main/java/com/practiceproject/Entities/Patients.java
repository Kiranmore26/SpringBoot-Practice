package com.practiceproject.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PatentsDetails")
public class Patients 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patientId")
	private int patientId;
	@Column(name = "patientName",length = 50)
	private String patientName;
	@Column(name = "patientAddress",length = 80)
	private String patientAddress;
	@Column(name = "patientAge",length = 10)
	private int patientAge;
	@Column(name = "patientPhn",length = 20)
	private int patientphn;
	
	
	
	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Patients(int patientId, String patientName, String patientAddress, int patientAge, int patientphn) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.patientAge = patientAge;
		this.patientphn = patientphn;
	}



	public int getPatientId() {
		return patientId;
	}



	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}



	public String getPatientName() {
		return patientName;
	}



	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}



	public String getPatientAddress() {
		return patientAddress;
	}



	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}



	public int getPatientAge() {
		return patientAge;
	}



	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}



	public int getPatientphn() {
		return patientphn;
	}



	public void setPatientphn(int patientphn) {
		this.patientphn = patientphn;
	}
	
	
	
	
	
	
}
