package com.bway.eclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bway.eclinic.model.Admission;
import com.bway.eclinic.repository.AdmissionRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	private AdmissionRepository admRepo;

	@Override
	public void addUser(Admission user) {
		admRepo.save(user);
		
	}

	@Override
	public Admission getUserById(int id) {
		return admRepo.getById(id);
	}
	

}
