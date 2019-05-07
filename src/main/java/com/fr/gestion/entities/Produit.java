package com.fr.gestion.entities;

import java.io.Serializable;

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
public class Produit implements Serializable{
	@Id
	@GeneratedValue
	private Long code;
	private String modele;
	private String fabricant;
	private String couleur;
	private String taille;
	private float prix;
	private int qtite;

}
