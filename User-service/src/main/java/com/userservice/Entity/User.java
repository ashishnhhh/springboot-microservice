package com.userservice.Entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Long UserId;
	private String Name;
	private String Phone;
	
    List<Contact> contacts = new ArrayList<>();	
	
	public User(Long UserId, String Name, String Phone,List<Contact> contacts) {
		this.contacts = contacts;
		this.Name = Name;
		this.Phone = Phone;
		this.UserId = UserId;
	}

	public User(Long UserId, String Name, String Phone) {
		this.Name = Name;
		this.Phone = Phone;
		this.UserId = UserId;
	}
	
	public User() {
		
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

}
