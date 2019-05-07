package com.fr.gestion.services;

import java.util.List;

import com.fr.gestion.DAO.IClientDao;
import com.fr.gestion.entities.Client;

public interface IClientService {

	Client findOneById(Long id);
	Client save(Client p);
	void delete(Client p);
	List<Client> getAll();
}
