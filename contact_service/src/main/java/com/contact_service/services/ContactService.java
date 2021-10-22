package com.contact_service.services;

import java.util.Optional;

import com.contact_service.entity.Contact;

public interface ContactService {
	
	public Optional<Contact> getContact(int Id);
	public Contact saveContact(Contact contact);

}
