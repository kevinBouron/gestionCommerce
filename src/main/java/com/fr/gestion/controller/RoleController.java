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

import com.fr.gestion.entities.Role;
import com.fr.gestion.services.IRoleService;
@CrossOrigin
@RestController
public class RoleController {

	
	@Autowired
	private IRoleService RoleS;
	
	

	@GetMapping("/Role/get/{id}")
	public Role findOneById(@PathVariable Long id) {

		return RoleS.findOneById(id);

	}

	@PostMapping("/Role/save")
	public Role save(@RequestBody Role p) {

		return RoleS.save(p);

	}

	@DeleteMapping("/Role/delete")
	public void delete(@RequestBody Role p) {

		RoleS.delete(p);
	}

	@GetMapping("/Role/getall")
	public List<Role> getAll() {
		return RoleS.getAll();
	}
}