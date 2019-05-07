package com.fr.gestion.DAO;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.gestion.entities.Facture;

@Repository
public interface IFactureDao extends JpaRepository<Facture, Long>{


}
