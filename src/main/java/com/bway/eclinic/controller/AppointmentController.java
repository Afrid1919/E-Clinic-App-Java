package com.bway.eclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.eclinic.model.Admission;
import com.bway.eclinic.repository.AdmissionRepository;

@Controller
public class AppointmentController {
	
	@Autowired
	private AdmissionRepository admrepo;
	
	@GetMapping("/appointment")
	public String showAppointmentForm() {
		return "appointment";
	}
	
	@PostMapping("/appointment")
	public String saveAppointment(@ModelAttribute Admission user) {
		

		admrepo.save(user);
		
		return "appointment";
		
	}
	
}
