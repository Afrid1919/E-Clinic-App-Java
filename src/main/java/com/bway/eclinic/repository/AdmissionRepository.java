package com.bway.eclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.eclinic.model.Admission;

public interface AdmissionRepository extends JpaRepository<Admission, Integer>{

	
}
