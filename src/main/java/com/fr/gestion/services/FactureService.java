package com.fr.gestion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.DAO.IFactureDao;
import com.fr.gestion.entities.Facture;
import com.fr.gestion.entities.Produit;


@Service
public class FactureService implements IFactureService {

	
	@Autowired
	private IFactureDao factureDao;

	@Override
	public float CalculMontantTVA(Facture f) {
		
		float taux = 0.2f;
		float montantTVA= totalHT(f)*taux;
		f.setMontantTVA(montantTVA);
		return montantTVA;
		
	}

	@Override
	public float CalculMontantTTC(Facture f) {
		// TODO Auto-generated method stub
		float TTC= totalHT(f)+CalculMontantTVA(f);
		f.setMontantTTC(TTC);
		return TTC;
	}

	@Override
	public float CalculBaseHT(Facture f) {
		// TODO Auto-generated method stub

		float prixHT =0;
		 for(Produit p : f.getCommande().getProduits()) {
			 prixHT =prixHT + p.getPrix()*p.getQtite();
		 }
		 f.setBaseHT(prixHT);
		 return prixHT;
		 

	}

	@Override
	public float Restedu(Facture f) {
		// TODO Auto-generated method stub
		float reste= CalculMontantTTC(f) - accompte(f);
		f.setRestedu(reste);
		return reste;
	}

	@Override
	public float MontantRemise(Facture f) {
		// TODO Auto-generated method stub
		float tauxRemise= f.getTauxR()/100; // pourcentage de remise
		float prixRemis = CalculBaseHT(f)*tauxRemise; // la remise 


		f.setRemise(prixRemis);
		return prixRemis;
	}
	
	@Override
	public float totalHT(Facture f) {
		// TODO Auto-generated method stub
		float totalHT =  CalculBaseHT(f)-MontantRemise(f) + f.getFraisdeport();
		f.setTotalHT(totalHT);
		return totalHT;
	}

	@Override
	public float accompte(Facture f) {
		// TODO Auto-generated method stub
		float tauxAccompte= 0.4f; // pourcentage accompte
		float accompte= CalculMontantTTC(f)*tauxAccompte;
		f.setAccompte(accompte);
		return accompte;
	}

	@Override
	public Facture findOneById(Long id) {
		// TODO Auto-generated method stub
		return factureDao.getOne(id);
	}

	@Override
	public Facture save(Facture p) {
		// TODO Auto-generated method stub
		return factureDao.save(p);
	}

	@Override
	public void delete(Facture p) {
		// TODO Auto-generated method stub
		factureDao.delete(p);
	}

	@Override
	public List<Facture> getAll() {
		// TODO Auto-generated method stub
		return factureDao.findAll();
	}


	

	

}
