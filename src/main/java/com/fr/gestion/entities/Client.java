package com.fr.gestion.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Client implements Serializable {

	
	@Id
	@GeneratedValue
	private Long codeClient;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String adresse;
	private String nomSociete;
	private String telMobile;
	private String telFixe;
	private String fax;
	private String email;
	
	@OneToMany
	private List<Commande> commandes;


}
