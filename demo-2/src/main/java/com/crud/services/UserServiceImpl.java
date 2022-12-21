package com.crud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.entity.User;

@Service
public class UserServiceImpl implements UserService {

//	@Autowired
//	private UserRepository userRepo;

	// Fake List

	List<User> list = List.of(new User(27, "Madhav", "mp@gmail.com"), new User(39, "Palak", "pp@gmail.com"),
			new User(8, "Avanti", "ag@gmail.com"), new User(11, "Chirag", "cs@gmail.com"));

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user -> user.getId() == id).findAny().orElse(null);
	}

}
