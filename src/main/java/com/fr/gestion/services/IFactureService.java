package com.fr.gestion.services;

import java.util.List;

import com.fr.gestion.entities.Facture;
import com.fr.gestion.entities.Reglement;

public interface IFactureService {

	
	float CalculMontantTVA (Facture f);
	float CalculMontantTTC(Facture f);
	float CalculBaseHT(Facture f);
	float Restedu(Facture f);
	float MontantRemise(Facture f);
	float accompte(Facture f);
	float totalHT(Facture f);
	
	Facture findOneById(Long id);
	Facture save(Facture p);
	void delete(Facture p);
	List<Facture> getAll();

	float reglement(Reglement r, Long id);
	float progression(Facture f);
	public Facture saveF(Facture f ,Long id);
}
