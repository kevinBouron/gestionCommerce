package com.fr.gestion.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.gestion.entities.Client;
import com.fr.gestion.entities.Reglement;



@Repository
public interface IReglementDao extends JpaRepository<Reglement, Long> {

	
	
	
	
}
