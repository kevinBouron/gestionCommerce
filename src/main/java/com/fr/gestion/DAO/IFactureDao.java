package com.fr.gestion.DAO;



import org.springframework.data.jpa.repository.JpaRepository;



import com.fr.gestion.entities.Facture;

public interface IFactureDao extends JpaRepository<Facture, Long>{


}
