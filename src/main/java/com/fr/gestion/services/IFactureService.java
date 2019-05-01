package com.fr.gestion.services;

import java.util.List;

import com.fr.gestion.entities.Facture;

public interface IFactureService  {

	Facture findOneById(Long id);

	Facture save(Facture p);

	void delete(Facture p);

	List<Facture> getAll();
	
	Float totalHTRemise();
	
	Float totalTVA();
	
	Float totalHTnet();
	
	Float totalTTC();
	
	Float accompte();
	
	Float netAPayer();
	
}
