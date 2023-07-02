package com.contactservice.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contactservice.Entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	List<Contact> list = List.of(
			new Contact("Ashish","ashishnhansbhavi@gmail.com",1L,13221L),
			new Contact("Soumya","soumyahansbhavi@gmail.com",2L,13222L),
			new Contact("Naveen","naveenhbl@gmail.com",3L,13223L),
			new Contact("Hanuman","Shriram@gmail.com",4L,13224L)
			);
	
	
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
