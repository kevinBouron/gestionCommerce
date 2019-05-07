package com.fr.gestion.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Commande {
	
	@Id
	@GeneratedValue
	private Long idCommande;
	
	private boolean CoupeEnBout;
	private boolean thermo;
	private boolean empDbl;
	private String thermoType;
	private String faconnier;
	private String societe;
	private String receptionneur;
//	private int quantiteCommande;
	

	@OneToMany
	private List<Produit> produits  = new ArrayList<Produit>();
}
