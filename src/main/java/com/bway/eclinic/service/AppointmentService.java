package com.bway.eclinic.service;

import com.bway.eclinic.model.Admission;

public interface AppointmentService {
	
	void addUser(Admission user);

	Admission getUserById(int id);
	

}
