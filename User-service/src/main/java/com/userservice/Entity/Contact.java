package com.userservice.Entity;

public class Contact {
	private String email,ContactName;
	private Long cId, userId;
	
	

	private Contact(String email, String contactName, Long cId, Long userId) {
		this.email = email;
		this.ContactName = contactName;
		this.cId = cId;
		this.userId = userId;
	}
	
	public Contact () {
		
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return ContactName;
	}

	public void setContactName(String contactName) {
		ContactName = contactName;
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}
