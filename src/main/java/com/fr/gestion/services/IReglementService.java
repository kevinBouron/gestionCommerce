package com.fr.gestion.services;

import java.util.List;

import com.fr.gestion.DAO.IClientDao;
import com.fr.gestion.entities.Client;
import com.fr.gestion.entities.Reglement;

public interface IReglementService {

	Client findOneById(Long id);
	Client save(Client p);
	void delete(Client p);
	List<Client> getAll();
	
	void reglement(Reglement r);
}
