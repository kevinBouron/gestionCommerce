package com.fr.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.gestion.entities.Produit;
import com.fr.gestion.services.IProduitService;

@RestController
public class ProduitController {

	
	@Autowired
	private IProduitService ProduitS;
	
	

	@GetMapping("/Produit/get/{id}")
	public Produit findOneById(@PathVariable Long id) {

		return ProduitS.findOneById(id);

	}

	@PostMapping("/Produit/save")
	public Produit save(@RequestBody Produit p) {

		return ProduitS.save(p);

	}

	@DeleteMapping("/Produit/delete")
	public void delete(@RequestBody Produit p) {

		ProduitS.delete(p);
	}

	@GetMapping("/Produit/getall")
	public List<Produit> getAll() {
		return ProduitS.getAll();
	}
}