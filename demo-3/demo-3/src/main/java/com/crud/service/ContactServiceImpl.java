package com.crud.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.Repository.ContactRepo;
import com.crud.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepo contactRepo;

	// fake contacts

//	 List<Contact> list = List.of(new Contact(1, "Agar", "MP", 27), new
//	 Contact(2, "Indore", "MP", 39),
//	 new Contact(3, "Agar", "MP", 27), new Contact(4, "Barwah", "MP", 8), new
//	 Contact(5, "Indore", "MP", 11));

	@Override
	public List<Contact> getContact(int userId) {
		// TODO Auto-generated method stub
		List<Contact> list = this.contactRepo.findAll();
		return list.stream().filter(contact -> contact.getUserId() == userId).collect(Collectors.toList());
	}

}
