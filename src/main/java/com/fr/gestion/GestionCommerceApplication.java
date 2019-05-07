package com.fr.gestion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fr.gestion.DAO.ICommandeDao;
import com.fr.gestion.DAO.IFactureDao;
import com.fr.gestion.DAO.IProduitDao;
import com.fr.gestion.entities.Commande;
import com.fr.gestion.entities.Facture;
import com.fr.gestion.entities.Produit;
import com.fr.gestion.entities.Reglement;
import com.fr.gestion.services.IFactureService;
import com.fr.gestion.services.IReglementService;

@SpringBootApplication
public class GestionCommerceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GestionCommerceApplication.class, args);
		IProduitDao produitDao = ctx.getBean(com.fr.gestion.DAO.IProduitDao.class);
		
		ICommandeDao cDao = ctx.getBean(com.fr.gestion.DAO.ICommandeDao.class);
		IFactureService fDao = ctx.getBean(com.fr.gestion.services.IFactureService.class);
		IReglementService rDao = ctx.getBean(com.fr.gestion.services.IReglementService.class);
		Produit p1 = new Produit(null,"modele1","fab","bleu",null,50,3);
		produitDao.save(p1);
		Produit p2 = new Produit(null,"modele2","fab","rouge",null,40,3);
		produitDao.save(p2);
		
		List<Produit> list = new ArrayList<Produit>();

		list.add(p1);
		list.add(p2);
		Commande c = new Commande(null, false, false, false, null, null, null, null, list);

		cDao.save(c);
		Facture f = new Facture();
		f.setCommande(c);
		f.setFraisdeport(20);
		f.setTauxR(5);
		Reglement r =new Reglement(null, null, 23, 0);
		f.getRegs().add(r);
		rDao.save(r);
		fDao.save(f);
		
		
		System.out.println(f.getCommande().getProduits());
		System.out.println(fDao.CalculBaseHT(f));
		System.out.println(fDao.MontantRemise(f));
		System.out.println(fDao.totalHT(f));
		System.out.println(fDao.CalculMontantTVA(f));
		System.out.println(fDao.CalculMontantTTC(f));
		System.out.println(fDao.accompte(f));
		System.out.println(fDao.Restedu(f));

		
		System.out.println(fDao.findOneById(f.getCodeFacture()));
}

}
