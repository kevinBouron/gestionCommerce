package com.fr.gestion.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue
	private Long idUser;
	private String userName;
	private String password;
	private boolean actived;
	private String nom;
	private String prenom;
	private String mail;
	@ManyToMany
	private List<Role> roles;
	
	
	
}
