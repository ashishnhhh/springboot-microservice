package com.userservice.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.userservice.Entity.User;

@Service
public class UserServiceImpl implements UserServices {
	
	List<User> list = List.of(
			new User ( 13221L,"Ashish","9035"),
			new User (13222L,"Soumya","9980"),
			new User( 13223L,"Naveen","9845")
			);
	
	
	
	@Override
	public User getUser(Long id) {
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
