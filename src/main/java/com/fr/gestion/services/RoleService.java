package com.fr.gestion.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.gestion.DAO.IRoleDao;
import com.fr.gestion.entities.Role;

@Service
public class RoleService implements IRoleService{

	@Autowired
	IRoleDao dao ;
	@Override
	public Role findOneById(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}

	@Override
	public Role save(Role p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public void delete(Role p) {
		// TODO Auto-generated method stub
		dao.delete(p);
	}

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	
	

	
	
	
	
}
