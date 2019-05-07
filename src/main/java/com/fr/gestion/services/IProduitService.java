package com.fr.gestion.services;

import java.util.List;

import com.fr.gestion.entities.Produit;
import com.fr.gestion.entities.Produit;

public interface IProduitService {
	
	Produit findOneById(Long id);
	Produit save(Produit p);
	void delete(Produit p);
	List<Produit> getAll();

}
