package com.fr.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.fr.gestion.entities.Facture;
import com.fr.gestion.services.IFactureService;

@RestController
public class FactureController {

	@Autowired
	private IFactureService factureS;
	
	

	@GetMapping("/api/get/{id}")
	public Facture findOneById(@PathVariable Long id) {

		return factureS.findOneById(id);

	}

	@PostMapping("/api/save")
	public Facture save(@RequestBody Facture p) {

		return factureS.save(p);

	}

	@DeleteMapping("/api/delete")
	public void delete(@RequestBody Facture p) {

		factureS.delete(p);
	}

	@GetMapping("/api/getall")
	public List<Facture> getAll() {
		return factureS.getAll();
	}
}
