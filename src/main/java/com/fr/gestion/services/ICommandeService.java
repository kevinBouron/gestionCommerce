package com.fr.gestion.services;

import java.util.List;

import com.fr.gestion.entities.Commande;



public interface ICommandeService {

	
	Commande findOneById(Long id);
	Commande save(Commande c);
	void delete(Commande c);
	List<Commande> getAll();
	
}
