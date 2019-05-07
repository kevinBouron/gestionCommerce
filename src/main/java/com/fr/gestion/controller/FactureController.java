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
import com.fr.gestion.entities.Reglement;
import com.fr.gestion.services.IFactureService;

@RestController
public class FactureController {

	@Autowired
	private IFactureService factureS;
	
	

	@GetMapping("/Facture/get/{id}")
	public Facture findOneById(@PathVariable Long id) {

		return factureS.findOneById(id);

	}

	@PostMapping("/Facture/save")
	public Facture save(@RequestBody Facture p) {

		return factureS.save(p);

	}

	@DeleteMapping("/Facture/delete")
	public void delete(@RequestBody Facture p) {

		factureS.delete(p);
	}

	@GetMapping("/Facture/getall")
	public List<Facture> getAll() {
		return factureS.getAll();
	}
	
	@PostMapping("/Facture/CalculMontantTVA/{id}")
	public float CalculMontantTVA(@PathVariable Long id) {
		Facture f = findOneById(id);
		return factureS.CalculMontantTVA(f);

	}
	
	@PostMapping("/Facture/CalculMontantTTC/{id}")
	public float CalculMontantTTC(@PathVariable Long id) {
		Facture f = findOneById(id);
		return factureS.CalculMontantTTC(f);

	}
	
	@PostMapping("/Facture/MontantRemise/{id}")
	public float MontantRemise(@PathVariable Long id) {
		Facture f = findOneById(id);
		return factureS.MontantRemise(f);

	}
	
	@PostMapping("/Facture/Restedu/{id}")
	public float Restedu(@PathVariable Long id) {
		Facture f = findOneById(id);
		return factureS.Restedu(f);

	}
	
	@PostMapping("/Facture/CalculBaseHT/{id}")
	public float CalculBaseHT(@PathVariable Long id) {
		Facture f = findOneById(id);
		return factureS.CalculBaseHT(f);

	}
	
	@PostMapping("/Facture/accompte/{id}")
	public float accompte(@PathVariable Long id) {
		Facture f = findOneById(id);
		return factureS.accompte(f);

	}
	
	@PostMapping("/Facture/progression")
	public float progression(@RequestBody Facture p) {

		return factureS.progression(p);

	}
	
	@PostMapping("/Facture/reglement/{id}")
	public float reglement(@RequestBody Reglement p,@PathVariable Long id) {

		return factureS.reglement(p, id);

	}
	
}
