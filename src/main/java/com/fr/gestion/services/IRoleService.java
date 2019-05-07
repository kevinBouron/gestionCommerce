package com.fr.gestion.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fr.gestion.DAO.IRoleDao;
import com.fr.gestion.entities.Role;


public interface IRoleService  {

	Role findOneById(Long id);
	Role save(Role p);
	void delete(Role p);
	List<Role> getAll();
}
