package com.fr.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.gestion.entities.User;
import com.fr.gestion.services.IUserService;
@CrossOrigin
@RestController
public class UserController {

	
	@Autowired
	private IUserService UserS;
	
	

	@GetMapping("/User/get/{id}")
	public User findOneById(@PathVariable Long id) {

		return UserS.findOneById(id);

	}

	@PostMapping("/User/save")
	public User save(@RequestBody User p) {

		return UserS.save(p);

	}

	@DeleteMapping("/User/delete")
	public void delete(@RequestBody User p) {

		UserS.delete(p);
	}

	@GetMapping("/User/getall")
	public List<User> getAll() {
		return UserS.getAll();
	}
	
//	@PostMapping("/login/{userName}")
//	public User login(@PathVariable userName) {
//
//		return UserS.findOneByLOgin(login);
//
//	}
}