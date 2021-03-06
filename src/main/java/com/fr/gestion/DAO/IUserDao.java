package com.fr.gestion.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.gestion.entities.User;

@Repository
public interface IUserDao extends JpaRepository<User, Long> {

	User findOneByUserName(String login);
	
}


