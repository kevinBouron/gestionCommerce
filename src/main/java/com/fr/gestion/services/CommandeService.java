package com.fr.gestion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.DAO.ICommandeDao;
import com.fr.gestion.entities.Commande;



@Service
public class CommandeService implements ICommandeService{

	
	
	@Autowired
	private ICommandeDao commandeDao;

	public Commande findOneById(Long id) {
		// TODO Auto-generated method stub
		return commandeDao.getOne(id);
	}


	public Commande save(Commande c) {
		// TODO Auto-generated method stub
		return commandeDao.save(c);
	}

	public void delete(Commande c) {
		// TODO Auto-generated method stub
		commandeDao.delete(c);
	}


	public List<Commande> getAll() {
		// TODO Auto-generated method stub
		return commandeDao.findAll();
	}
	

	
	

}
