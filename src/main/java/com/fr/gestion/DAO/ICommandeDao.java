package com.fr.gestion.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fr.gestion.entities.Commande;

@RepositoryRestResource
public interface ICommandeDao extends JpaRepository<Commande, Long>{

}
