package com.contact_service.servicesImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact_service.entity.Contact;
import com.contact_service.repositories.ContactRepository;
import com.contact_service.services.ContactService;


@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	

	@Override
	public Optional<Contact> getContact(int id) {
		
		return contactRepository.findById(id);
	}

	@Override
	public Contact saveContact(Contact contact) {
		return contactRepository.save(contact);
	}

}
