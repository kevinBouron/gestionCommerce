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

import com.fr.gestion.entities.Client;
import com.fr.gestion.services.IClientService;
@CrossOrigin
@RestController
public class ClientController {

	
	@Autowired
	private IClientService clientS;
	
	

	@GetMapping("/Client/get/{id}")
	public Client findOneById(@PathVariable Long id) {

		return clientS.findOneById(id);

	}

	@PostMapping("/Client/save")
	public Client save(@RequestBody Client p) {

		return clientS.save(p);

	}

	@DeleteMapping("/Client/delete")
	public void delete(@RequestBody Client p) {

		clientS.delete(p);
	}

	@GetMapping("/Client/getall")
	public List<Client> getAll() {
		return clientS.getAll();
	}
}
