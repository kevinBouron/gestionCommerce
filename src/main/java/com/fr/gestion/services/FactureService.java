package com.fr.gestion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.DAO.IFactureDao;
import com.fr.gestion.entities.Facture;


@Service
public class FactureService implements IFactureService {

	
	@Autowired
	private IFactureDao factureDao;

	@Override
	public float CalculMontantTVA(Facture f) {
		float taux = 0.20f;
		float montantTVA= CalculBaseHT(f)*taux;
		return montantTVA;
	}

	@Override
	public float CalculMontantTTC(Facture f) {
		// TODO Auto-generated method stub
		float TTC= CalculBaseHT(f)+CalculMontantTVA(f);
		return TTC;
	}

	@Override
	public float CalculBaseHT(Facture f) {
		// TODO Auto-generated method stub
		return f.getCommande()*f.getCommande() ; //selectionner la qtite et le produit du prix dans commande puis get lis
	}

	@Override
	public float Restedu(Facture f) {
		// TODO Auto-generated method stub
		return MontantRemise(f) - accompte(f);
	}

	@Override
	public float MontantRemise(Facture f) {
		// TODO Auto-generated method stub
		float tauxRemise= 0.05f; // pourcentage de remise
		float prixRemis = CalculMontantTTC(f)*tauxRemise; // la remise 
		float prixFinal = CalculMontantTTC(f) - prixRemis; // prix apres remise
		return prixFinal;
	}

	@Override
	public float accompte(Facture f) {
		// TODO Auto-generated method stub
		float tauxAccompte= 0.4f; // pourcentage accompte
		float accompte= MontantRemise(f)*tauxAccompte;
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
