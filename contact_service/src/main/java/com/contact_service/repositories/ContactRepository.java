package com.contact_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact_service.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
