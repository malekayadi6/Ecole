package com.ensit.project;

import static org.junit.Assert.assertTrue;

import java.awt.color.CMMException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ensit.project.entites.Classe;
import com.ensit.project.entites.Eleve;
import com.ensit.project.entites.Enseignant;
import com.ensit.project.entites.Exercice;
import com.ensit.project.entites.Message;
import com.ensit.project.metier.IAdminMetier;
import com.ensit.project.metier.IEnseignantMetier;
import com.ensit.project.metier.metier;

public class TestEnseignant {
	@Before
	public void setUp() throws Exception {
		

		
	}
	@Test
	public void test1(){
	try{
		ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
       
	   IAdminMetier metier=(IAdminMetier) app.getBean("metier");
		/*ArrayList<Classe> classes=(ArrayList<Classe>) metier.listerClasseEnseigant(1L);
		System.out.println(classes.size());
		/*Collection<Classe> classes= metier.listerClasseEnseigant(1l);
		for (Classe classe:classes){
			System.out.println(classe.getClasseNom());	
				}*/
	   
	  System.out.println(metier.listerClasseEnsiegnant(1L));
	   
	 /* Exercice exercice=new Exercice();
	   exercice.setSujet("ex pour 2m1");
	   metier.ajouterExercice(exercice, 1L, 1L);
	//   metier.addEleveToParent(1L, 1L);
	  /* Classe classe=new Classe();
	   classe.setClasseNom("c1");
	   Enseignant enseignant=new Enseignant();
	   enseignant.setNom("ens");
	   Eleve eleve=new Eleve();
	   eleve.setNom("malek");
	   metier.addEleve(eleve);
	   metier.addEnseignant(enseignant);
	   metier.ajouterClasse(classe);
	   metier.addEnseignantToClasse(1l,1l);		
	 metier.addEleveToClasse(1l, 1l);
	 //  System.out.println(((ArrayList<Classe>)metier.listerClasseEnsiegnant(3l)).size());
	/*   ArrayList<Classe> classes=(ArrayList<Classe>) metier.listerClasseEnsiegnant(3L);
	   for(Classe classe:classes){
		   System.out.println(classe.getIdClasse());
	   }
	 //  public List<Eleve> liserEleveParclasse(Long idClasse);
	  System.out.println(metier.liserEleveParclasse(8L).size());
	   

	// Classe classe=new Classe();
		//classe.setClasseNom("fff");
		
		Eleve eleve=new Eleve();
		eleve.setNom("gggg");
		metier.addEleve(eleve);
		metier.ajouterClasse(classe);
		metier.addEleveToClasse(2l,8l);*/
	
		
	 //   System.out.println(	metier.listerEleveParclasse(1l));
		
		
	
	    assertTrue(true);
			}catch(Exception e){
				assertTrue(e.getMessage(),false);
				
			}
	}
	@Test
	public void test2(){
	try{
		ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
       
	   IAdminMetier metier=(IAdminMetier) app.getBean("metier");
	/*   Message message=new Message();
	   message.setMsg("malek");
	   message.setObjet("etude");
	  metier.ajouterMessage(message, 1L, 1L);
	  Exercice exercice=new Exercice();
	  exercice.setSujet("sujet1");
	  metier.ajouterExercice(exercice, 1L,1L,1L);*/
	   Exercice exercice=new Exercice();
	   exercice.setSujet("gg");
	   metier.ajouterExercice(exercice, 1L, 1L, 1L);

	    assertTrue(true);
			}catch(Exception e){
				assertTrue(e.getMessage(),false);
				
			}
}}
