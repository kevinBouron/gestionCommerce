package com.fr.gestion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.DAO.IProduitDao;
import com.fr.gestion.entities.Produit;

@Service
public class ProduitService implements IProduitService{

	@Autowired
	IProduitDao dao;
	@Override
	public Produit findOneById(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}

	@Override
	public Produit save(Produit p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public void delete(Produit p) {
		// TODO Auto-generated method stub
		dao.delete(p);
	}

	@Override
	public List<Produit> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	
	
}
