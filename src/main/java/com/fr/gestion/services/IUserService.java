package com.fr.gestion.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fr.gestion.DAO.IUserDao;
import com.fr.gestion.entities.User;


public interface IUserService  {

	User findOneById(Long id);
	User save(User p);
	void delete(User p);
	List<User> getAll();
	
	User findOneByLOgin(String login);
}
