package com.bway.eclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bway.eclinic.model.Contact;
import com.bway.eclinic.repository.ContactRepository;

@Controller
public class ContactController {
	
	/*
	 * @RequestMapping(value ="/contact", method=RequestMethod.GET) public String
	 * showIndex() {
	 * 
	 * return "contact"; }
	 */
	
	@Autowired
	private ContactRepository contrepo;

	@GetMapping("/contact")
	public String showContactForm() {
		return "contact";
	}

	@PostMapping("/contact")
	public String saveContact(@ModelAttribute Contact contact) {
		

		contrepo.save(contact);
		
		return "contact";
	
	
}
}
