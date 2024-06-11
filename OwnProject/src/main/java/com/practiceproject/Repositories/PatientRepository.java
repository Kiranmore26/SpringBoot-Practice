package com.practiceproject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practiceproject.Entities.Patients;

public interface PatientRepository extends JpaRepository<Patients, Integer>
{

}
