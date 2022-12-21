package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Contact;
import com.crud.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;

	@GetMapping("/contacts/{userId}")
	public List<Contact> getContactByUserId(@PathVariable("userId") int id) {
		return this.contactService.getContact(id);
	}
}
