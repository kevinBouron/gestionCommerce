package com.fr.gestion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fr.gestion.DAO.IClientDao;
import com.fr.gestion.entities.Client;

@Service
public class ClientService implements IClientService{

	@Autowired
	IClientDao dao;
	
	public Client update(Client client) {
		return dao.save(client);
	}

	@Override
	public Client findOneById(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}

	@Override
	public Client save(Client p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public void delete(Client p) {
		// TODO Auto-generated method stub
		dao.delete(p);
	}

	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
