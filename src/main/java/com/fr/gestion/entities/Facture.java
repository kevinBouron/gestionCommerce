package com.fr.gestion.entities;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Facture implements Serializable {


	@Id @GeneratedValue
	private Long codeFacture;
	
	private int numeroCommande;
	private Date dateCommande;
	private String modePaiement;
	private int numTVA;
	private Date dateLivraison;
	private float remise;
	

	
	
	private float fraisdeport;
	private float tva;
	private float BaseHT;
	private float montantTVA;
	private float montantTTC;
	
	private Date dateecheance;
	private float montantecheance;
	private float restedu;
	
	@OneToOne
	private Commande commande;
}
