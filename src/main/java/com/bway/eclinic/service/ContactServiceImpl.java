package com.bway.eclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bway.eclinic.model.Contact;
import com.bway.eclinic.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{

	
	@Autowired
	private ContactRepository contRepo;

	@Override
	public void addContact(Contact contact) {
		contRepo.save(contact);
		
	}

	@Override
	public Contact getContactById(int id) {
		return contRepo.getById(id);
	}
	
}
