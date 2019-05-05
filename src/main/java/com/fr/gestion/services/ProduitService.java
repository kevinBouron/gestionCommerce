package com.fr.gestion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.DAO.IProduitDao;
import com.fr.gestion.entities.Produit;
@Service
public class ProduitService implements IProduitService{
	
	@Autowired
	private IProduitDao produitDao;

	@Override
	public Produit save(Produit p) {
		return produitDao.save(p);
	}

	@Override
	public void delete(Produit p) {
		produitDao.delete(p);		
	}

	@Override
	public Produit findOneById(long id) {
		return produitDao.getOne(id);
	}

	@Override
	public List<Produit> getAll() {
		return produitDao.findAll();
	}

}
