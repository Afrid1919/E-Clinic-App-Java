package com.bway.eclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.eclinic.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
	

}
