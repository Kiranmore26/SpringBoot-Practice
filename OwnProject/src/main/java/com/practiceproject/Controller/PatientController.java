package com.practiceproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practiceproject.Entities.Patients;
import com.practiceproject.Model.PatientDto;
import com.practiceproject.Services.PatientService;
import com.practiceproject.Util.PatientConverter;

@RestController
@RequestMapping("/api")
public class PatientController 
{
	@Autowired
	PatientService patientService;
	
	@Autowired
	PatientConverter patientConverter;
	
	
	@PostMapping("/create")
	ResponseEntity<PatientDto>  createPatient(@RequestBody PatientDto patientDto)
	{
		final Patients patients=patientConverter.convertToPatientEntity(patientDto);
		return new ResponseEntity<PatientDto>(patientService.createPatient(patients),HttpStatus.CREATED);
	}
	

	
	@GetMapping("/display")
	List<PatientDto> displayall()
	{
		return patientService.displayall();
	}
	@GetMapping("/byid/{cid}")
	PatientDto displaybyid(@PathVariable("cid") int id)
	{
		return patientService.displaybyid(id);
	}
	
	@DeleteMapping("/delete/{cid}")
	String delete(@PathVariable("cid") int id)
	{
		return patientService.delete(id);
	}
}
