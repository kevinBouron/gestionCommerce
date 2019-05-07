package com.fr.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.gestion.entities.Commande;
import com.fr.gestion.services.ICommandeService;

@RestController
public class CommandeController {

	
	@Autowired
	private ICommandeService CommandeS;
	
	

	@GetMapping("/Commande/get/{id}")
	public Commande findOneById(@PathVariable Long id) {

		return CommandeS.findOneById(id);

	}

	@PostMapping("/Commande/save")
	public Commande save(@RequestBody Commande p) {

		return CommandeS.save(p);

	}

	@DeleteMapping("/Commande/delete")
	public void delete(@RequestBody Commande p) {

		CommandeS.delete(p);
	}

	@GetMapping("/Commande/getall")
	public List<Commande> getAll() {
		return CommandeS.getAll();
	}
}
