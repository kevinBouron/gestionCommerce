package com.fr.gestion.services;

import java.util.List;



import com.fr.gestion.entities.Facture;

public interface IFactureService {

	Facture findOneById(Long id);
	Facture save(Facture f);
	void delete(Facture f);
	List<Facture> getAll();


}
