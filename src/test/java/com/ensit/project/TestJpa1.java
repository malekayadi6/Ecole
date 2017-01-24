package com.ensit.project;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ensit.project.entites.Adresse;
import com.ensit.project.entites.Classe;
import com.ensit.project.entites.Eleve;
import com.ensit.project.entites.EleveParent;
import com.ensit.project.entites.Enseignant;
import com.ensit.project.metier.IAdminMetier;
/*
import com.ensit.project.entites.Categorie;
import com.ensit.project.entites.Produit;
import com.ensit.project.metier.IAdminCategorieMetier;
import com.ensit.project.metier.IAdminProduitMetier;*/
import com.ensit.project.metier.metier;

public class TestJpa1 {

	@Before
	public void setUp() throws Exception {
		

		
	}

	/*@Test
	public void test() {
		try{
		ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		assertTrue(true);
		}catch(Exception e){
			assertTrue(e.getMessage(),false);
			
		}
	}*/
	@Test
	public void test2() {
		try{
			ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
           
			IAdminMetier catMetier=(IAdminMetier) app.getBean("metier");
			
			 Eleve eleve=new Eleve();
			 Eleve eleve2=new Eleve();
			 eleve2.setNom("ayadi");
			 eleve.setNom("malek");
			 
			 Classe classe=new Classe();
			 classe.setClasseNom("classe1");
			 Classe classe3=new Classe();
			 classe.setClasseNom("classe2");
			 Classe classe2=new Classe();
			 classe.setClasseNom("classe3");
			 catMetier.ajouterClasse(classe2);
			 catMetier.ajouterClasse(classe3);
			 catMetier.ajouterClasse(classe);
	      // Collection<Eleve> eleves=new ArrayList<Eleve>();
			//eleves.add(eleve);
		/*	eleves.add(eleve2);
			classe.AjouterElever(eleve2);
			classe.AjouterElever(eleve);
			 
			 Collection<Eleve> eleves2=catMetier.listerElevesParClasse(1L);
			 System.out.println(eleves2);
			 List<Classe> classes=catMetier.listerClasses();
			 Eleve eleve3=catMetier.getEleve(2L);
			 System.out.println(eleve3.getNom());
			/* List<Eleve> eleves;
			 for(Classe classe2:classes){
				 eleves=classe2.getEleves();
				 for(Eleve elevee:eleves){
					 System.out.println(elevee.getNom());
				 }
			 }*/
		/*
			for(Eleve m:eleves2){
				 System.out.println(m.getNom());
			 }
			
			//catMetier.ajouterClasse(classe);
           //Categorie c=new Categorie();
            
           //c.setDescription("cccffffff");
           //c.setNomCategorie("pffffffffc");
           //catMetier.ajouterCategorie(c);
          
          
		  //Produit p=new Produit("mmmm", "aaaaa", 12.0, true, "pjot.jpeg", 145);
		  //Long idP=produitMetier.ajouterProduit(produit);*/
  Adresse adresse=new Adresse();
			adresse.setAdress("mmm");
			adresse.setPays("tunis");
			adresse.setCodePostale(147);
			
			
          // Enseignant enseignant=new Enseignant();
           //enseignant.setNom("malek");
         //  enseignant.setAdresse(adresse);
           
           EleveParent eleveParent=new EleveParent();
          // eleveParent.setAdresse(adresse);
           eleveParent.setNom("parent");
         //  catMetier.ajouetrEnseignant(enseignant);
           catMetier.ajouterParents(eleveParent);
           
           
       
           
		    /*catMetier.ajouetrEnseignant(enseignant);
		    List<Enseignant> enseignants=catMetier.listerEnseignants();
		    
		    for(Enseignant enseignant2:enseignants){
		    	System.out.println(enseignant2.getAdresse().getVille()+"+"+enseignant2.getNom()+"+"+enseignant2.getAdresse().getPays());
		    	
		    }
		  //  catMetier.supprimerEnseignant(1L);*/
           assertTrue(true);
		}catch(Exception e){
			assertTrue(e.getMessage(),false);
			
		}
	}
	@Test
	public void ajouterEnsiegnnat() {
		try{
			ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
           
			IAdminMetier catMetier=(IAdminMetier) app.getBean("metier");
			Enseignant enseignant=new Enseignant();
			enseignant.setNom("en1");
			Classe classe1=new Classe();
			classe1.setClasseNom("c1");
			Classe classe2=new Classe();
			classe2.setClasseNom("c2");
			catMetier.ajouterClasse(classe1);
			catMetier.ajouterClasse(classe2);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			classes.add(classe1);
			classes.add(classe2);
			catMetier.ajouetrEnseignant(enseignant, classes);


	        assertTrue(true);

		}catch(Exception e){
			assertTrue(e.getMessage(),false);
		}
	}
	@Test
	public void test3() {
		try{
			ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
           
			IAdminMetier catMetier=(IAdminMetier) app.getBean("metier");
		/*Classe classe=new Classe();
			classe.setClasseNom("classetest");
			Eleve eleves=new Eleve();
			eleves.setClassse(classe);
		      ArrayList<Eleve> eleves2=new ArrayList<Eleve>();
		      eleves2.add(eleves);
			classe.setEleves(eleves2);
			catMetier.ajouterClasse(classe);
		/*	ArrayList<Classe> classes=(ArrayList<Classe>) catMetier.listerClasses();
			for(Classe classe2:classes){
				System.out.println(classe2.getClasseNom());
				
				Collection<Eleve> eleves3=classe2.getEleves();
				for(Eleve eleve:eleves3){
					System.out.println(eleve.getNom());
				}
			}
			*/
		ArrayList<Eleve> eleves=(ArrayList<Eleve>) catMetier.liserEleveParclasse(7L);
		for(Eleve eleve:eleves){
			System.out.println(eleve.getId());
		}
		System.out.println("suuce");
        assertTrue(true);

		}catch(Exception e){
			assertTrue(e.getMessage(),false);
		}
	}
	

}
