package com.bway.eclinic.service;

import com.bway.eclinic.model.Contact;

public interface ContactService {

	void addContact(Contact contact);

	Contact getContactById(int id);
}
