package com.practiceproject.Services;

import java.util.List;

import com.practiceproject.Entities.Patients;
import com.practiceproject.Model.PatientDto;

public interface PatientService 
{
	PatientDto createPatient(Patients patients);
	
	List<PatientDto> displayall();
	
	PatientDto displaybyid(int id);
	
	String delete(int id);
	
	
}
