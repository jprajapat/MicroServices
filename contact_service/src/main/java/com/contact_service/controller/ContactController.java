package com.contact_service.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact_service.entity.Contact;
import com.contact_service.services.ContactService;

@RestController
@RequestMapping("/contact_service")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping("/saveContact")
	public Contact saveContact(@RequestBody Contact contact) {
		return contactService.saveContact(contact);
		
	}
	
	@GetMapping("/getContactbyId/{id}")
	public Optional<Contact> getContact(@PathVariable("id") int id){
		return contactService.getContact(id);
		
	}

}
