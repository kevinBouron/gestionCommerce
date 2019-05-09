package com.fr.gestion.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.gestion.entities.Client;



@Repository
public interface IClientDao extends JpaRepository<Client, Long> {


	
	
	
}
