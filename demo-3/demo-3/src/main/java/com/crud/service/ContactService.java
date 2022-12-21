package com.crud.service;

import java.util.List;

import com.crud.model.Contact;

public interface ContactService {
	
	public List<Contact> getContact(int userId);
}
