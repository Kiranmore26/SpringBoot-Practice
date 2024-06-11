package com.practiceproject.Model;

import jakarta.persistence.Column;

public class PatientDto 
{
	private int patientId;
	private String patientName;
	private String patientAddress;
	private int patientAge;
	private int patientphn;
	
	
	
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
