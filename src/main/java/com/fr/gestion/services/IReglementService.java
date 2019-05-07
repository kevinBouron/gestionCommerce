package com.fr.gestion.services;

import java.util.List;

import com.fr.gestion.DAO.IClientDao;
import com.fr.gestion.entities.Client;
import com.fr.gestion.entities.Reglement;

public interface IReglementService {

	Reglement findOneById(Long id);
	Reglement save(Reglement p);
	void delete(Reglement p);
	List<Reglement> getAll();
	

}
