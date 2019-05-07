package com.fr.gestion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.DAO.ICommandeDao;
import com.fr.gestion.DAO.IFactureDao;
import com.fr.gestion.entities.Commande;
import com.fr.gestion.entities.Facture;
import com.fr.gestion.entities.Produit;
import com.fr.gestion.entities.Reglement;


@Service
public class FactureService implements IFactureService {

	
	@Autowired
	private IFactureDao factureDao;

	@Autowired
	private ICommandeDao cDao;
	@Override
	public float CalculMontantTVA(Facture f) {
		
		float taux = 0.2f;
		float montantTVA= f.getTotalHT()*taux;
		f.setMontantTVA(montantTVA);
		return montantTVA;
		
	}

	@Override
	public float CalculMontantTTC(Facture f) {
		// TODO Auto-generated method stub
		float TTC= f.getTotalHT()+f.getMontantTVA();
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
		float reste= f.getMontantTTC() - f.getAccompte();
		f.setRestedu(reste);
		return reste;
	}

	@Override
	public float MontantRemise(Facture f) {
		// TODO Auto-generated method stub
		float tauxRemise= f.getTauxR()/100; // pourcentage de remise
		float prixRemis = f.getBaseHT()*tauxRemise; // la remise 


		f.setRemise(prixRemis);
		return prixRemis;
	}
	
	@Override
	public float totalHT(Facture f) {
		// TODO Auto-generated method stub
		float totalHT =  f.getBaseHT()-f.getRemise() + f.getFraisdeport();
		f.setTotalHT(totalHT);
		return totalHT;
	}

	@Override
	public float accompte(Facture f) {
		// TODO Auto-generated method stub
		float tauxAccompte= 0.4f; // pourcentage accompte
		float accompte= f.getMontantTTC()*tauxAccompte;
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




	@Override
	public float progression(Facture f) {
	
		
		float montantTTC =f.getMontantTTC();
		float Rest= f.getRestedu();
		float progression= Rest*100/montantTTC;
		return progression;
	}



	@Override
	public float reglement(Reglement r, Long id ) {
		// TODO Auto-generated method stub
		Facture f = factureDao.getOne(id);
		f.getRegs().add(r);
		float rest= f.getRestedu() - r.getMontant();
		f.setRestedu(rest);
		return rest;
	}





	

}
