package com.fr.gestion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.fr.gestion.DAO.FactureDao;
import com.fr.gestion.DAO.IFactureDao;
import com.fr.gestion.entities.Facture;


@Service
public class FactureService implements IFactureService {

	
	@Autowired
	private IFactureDao factureDao;
	

	
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
	public Float totalHTRemise() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float totalTVA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float totalHTnet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float totalTTC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float accompte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float netAPayer() {
		// TODO Auto-generated method stub
		return null;
	}


}
