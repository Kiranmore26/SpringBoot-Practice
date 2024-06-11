package com.practiceproject.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practiceproject.Entities.Patients;
import com.practiceproject.Model.PatientDto;
import com.practiceproject.Repositories.PatientRepository;
import com.practiceproject.Services.PatientService;
import com.practiceproject.Util.PatientConverter;

@Service
public class PatientServiceImpl implements PatientService
{
	@Autowired
	PatientRepository patientRepository;
	
	@Autowired
	PatientConverter patientConverter;
	
	@Override
	public PatientDto createPatient(Patients patients) 
	{
		Patients patients2=patientRepository.save(patients);
		return patientConverter.convertToPatientDto(patients2);
	}

	
	@Override
	public List<PatientDto> displayall() 
	{
		// TODO Auto-generated method stub
		
		List<Patients>  patients=patientRepository.findAll();
		List<PatientDto> patientDtos=new ArrayList<>();
		
		for(Patients p: patients)
		{
			patientDtos.add(patientConverter.convertToPatientDto(p));
			
		}
		return patientDtos;
	}


	@Override
	public PatientDto displaybyid(int id) 
	{
		Patients patients=patientRepository.findById(id).get();
		return patientConverter.convertToPatientDto(patients);
	}


	@Override
	public String delete(int id) 
	{
		patientRepository.deleteById(id);
		return "Data deleted";
		// TODO Auto-generated method stub
		
	}
	
}
