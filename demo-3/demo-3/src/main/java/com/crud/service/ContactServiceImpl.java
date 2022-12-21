package com.crud.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.crud.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	// fake contacts

	List<Contact> list2 = List.of(new Contact(1, "Agar", "MP", 27), new Contact(2, "Indore", "MP", 39),
			new Contact(3, "Agar", "MP", 27), new Contact(4, "Barwah", "MP", 8), new Contact(5, "Indore", "MP", 11));

	@Override
	public List<Contact> getContact(int userId) {
		// TODO Auto-generated method stub
		return list2.stream().filter(contact -> contact.getUserId() == userId).collect(Collectors.toList());
	}

}
