package com.fr.gestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fr.gestion.DAO.IProduitDao;
import com.fr.gestion.entities.Produit;

@SpringBootApplication
public class GestionCommerceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GestionCommerceApplication.class, args);
		IProduitDao produitDao = ctx.getBean(com.fr.gestion.DAO.IProduitDao.class);
		
		Produit p1 = new Produit(null,"modele1","fab","bleu",50);
		produitDao.save(p1);
	}

}
