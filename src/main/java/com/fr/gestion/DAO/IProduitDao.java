package com.fr.gestion.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.fr.gestion.entities.Produit;

@Repository
public interface IProduitDao extends JpaRepository<Produit, Long>{

}
