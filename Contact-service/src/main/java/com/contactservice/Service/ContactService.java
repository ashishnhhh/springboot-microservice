package com.contactservice.Service;

import java.util.List;

import com.contactservice.Entity.Contact;

public interface ContactService {
	
	public List<Contact> getContactsOfUser(Long userId);
}
