package com.practiceproject.Util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.practiceproject.Entities.Patients;
import com.practiceproject.Model.PatientDto;

@Component
public class PatientConverter 
{
	public Patients convertToPatientEntity(PatientDto patientDto)
	{
		Patients patients = new Patients();
		
		if(patientDto!=null)
		{
			BeanUtils.copyProperties(patientDto, patients);
		}
		
		return patients;
	}
	
	public PatientDto convertToPatientDto (Patients patients) 
	{
		PatientDto patientDto = new PatientDto();
		
		if(patients!=null)
		{
			BeanUtils.copyProperties(patients, patientDto);
		}
		return patientDto;
	}
}
