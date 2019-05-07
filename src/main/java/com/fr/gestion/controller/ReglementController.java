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

import com.fr.gestion.entities.Reglement;
import com.fr.gestion.services.IReglementService;
@CrossOrigin
@RestController
public class ReglementController {

	
	@Autowired
	private IReglementService ReglementS;
	
	

	@GetMapping("/Reglement/get/{id}")
	public Reglement findOneById(@PathVariable Long id) {

		return ReglementS.findOneById(id);

	}

	@PostMapping("/Reglement/save")
	public Reglement save(@RequestBody Reglement p) {

		return ReglementS.save(p);

	}

	@DeleteMapping("/Reglement/delete")
	public void delete(@RequestBody Reglement p) {

		ReglementS.delete(p);
	}

	@GetMapping("/Reglement/getall")
	public List<Reglement> getAll() {
		return ReglementS.getAll();
	}
}
