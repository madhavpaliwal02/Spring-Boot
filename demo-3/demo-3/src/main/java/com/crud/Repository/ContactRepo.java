package com.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {
}
