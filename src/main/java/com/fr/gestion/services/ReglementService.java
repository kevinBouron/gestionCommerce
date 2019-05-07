package com.fr.gestion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.DAO.IReglementDao;

import com.fr.gestion.entities.Reglement;


@Service
public class ReglementService implements IReglementService {

	
	@Autowired
	IReglementDao dao;
	
	@Override
	public Reglement findOneById(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}

	@Override
	public Reglement save(Reglement p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public void delete(Reglement p) {
		// TODO Auto-generated method stub
		dao.delete(p);
	}

	@Override
	public List<Reglement> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}



}
