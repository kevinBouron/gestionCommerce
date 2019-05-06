package com.fr.gestion.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fr.gestion.entities.User;

public interface IUserDao extends JpaRepository<User, Long> {

	
	
}


