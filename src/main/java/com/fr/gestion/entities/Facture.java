package com.fr.gestion.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Facture implements Serializable{

	@Id
	@GeneratedValue
	private Long id;
	private String modeReglement;
	private float TVA;
	private Date dateLivraison;
	private String description;
	private float montantPaye;
	private int numPiece;
	private Date dateEcheance;
}
