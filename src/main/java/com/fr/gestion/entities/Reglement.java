package com.fr.gestion.entities;

import java.util.Date;

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
public class Reglement {

	
	@Id
	@GeneratedValue
	private Long idR;
	enum modePaiement {CHEQUE, CB, ESPECE};
	private Date date;
	private float montant;
}
