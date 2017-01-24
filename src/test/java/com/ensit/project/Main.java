package com.ensit.project;

import static org.junit.Assert.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ensit.project.entites.Adresse;
import com.ensit.project.entites.Enseignant;
import com.ensit.project.metier.IAdminMetier;
/*
import com.ensit.project.entites.Categorie;
import com.ensit.project.entites.Personne;
import com.ensit.project.entites.User;
import com.ensit.project.metier.BoutiqueMetier;
import com.ensit.project.metier.IAdminCategorieMetier;
import com.ensit.project.metier.IAdminProduitMetier;
*/
public class Main {

	@Autowired
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
	           IAdminMetier adMetier=(IAdminMetier) app.getBean("metier");
	          
	           Adresse adresse=new Adresse();
	           adresse.setAdress("14 rue astemt anino");
	           adresse.setCodePostale(1547L);
	           adresse.setPays("bardo");
	          Enseignant c=new Enseignant();
	          c.setNom("malek");
	          c.setAdresse(adresse);
	          c.setSex("homme");
	           
	        //   catMetier.ajouterUser(c);
	           /* System.out.println("bien");
	           Personne personne=new Personne();
	           personne.setPrenom("mm");
	           catMetier.ajouterPersonne(personne);
	           
				
		*/
	}catch(Exception e){
		System.out.println("errer"+e.getMessage());
	}

}
}
