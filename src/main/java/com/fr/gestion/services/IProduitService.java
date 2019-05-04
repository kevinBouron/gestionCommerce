package com.fr.gestion.services;

import java.util.List;

import com.fr.gestion.entities.Produit;

public interface IProduitService {
	
	public Produit save(Produit p);
	public void delete (Produit p);
	public Produit findOneById(long id);
	public List<Produit> getAll();

}
