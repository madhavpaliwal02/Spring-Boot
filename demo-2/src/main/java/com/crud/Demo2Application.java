package com.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crud.entity.User;
import com.crud.repository.UserRepository;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userRepo.save(new User(27, "Madhav Paliwal", "mp@gmail.com"));
		userRepo.save(new User(39, "Palak Porwal", "pp@gmail.com"));
	}

}
