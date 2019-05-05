package com.fr.gestion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fr.gestion.DAO.FactureDao;
import com.fr.gestion.DAO.IFactureDao;
import com.fr.gestion.entities.Facture;

public class FactureService implements IFactureService{

	@Autowired
	private IFactureDao factureDao;
	private FactureDao dao;
	
	@Override
	public Facture findOneById(Long id) {
		// TODO Auto-generated method stub
		return factureDao.findOneById(id);
	}

	@Override
	public Facture save(Facture f) {
		// TODO Auto-generated method stub
		return factureDao.save(f);
	}

	@Override
	public void delete(Facture f) {
		factureDao.delete(f);
		
	}
//
	@Override
	public List<Facture> getAll() {
		
		return factureDao.findAll();
	}

	float CalculMontantTVA() {
		return dao.CalculMontantTVA();
		
	};
	float CalculMontantTTC() {
		return dao.CalculMontantTTC();
		
	};
	float CalculBaseHT() {
		return dao.CalculBaseHT();
		
	};
}
