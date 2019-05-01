package com.fr.gestion.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fr.gestion.entities.Produit;

@RepositoryRestResource
public interface IProduitDao extends JpaRepository<Produit, Long>{

}
