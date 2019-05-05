package com.fr.gestion.DAO;

import org.springframework.data.jpa.repository.JpaRepository;



import com.fr.gestion.entities.Facture;

public interface IFactureDao extends JpaRepository<Facture, Long>{

	Facture findOneById(Long id);
	float CalculMontantTVA ();
	float CalculMontantTTC();
	float CalculBaseHT();
	float Restedu();
	float MontantRemise();
	float accompte();
}
