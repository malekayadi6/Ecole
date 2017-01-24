package com.ensit.project;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ensit.project.dao.IEcoleDao;
import com.ensit.project.entites.Classe;
import com.ensit.project.entites.Eleve;
import com.ensit.project.metier.IEnseignantMetier;

public class TestDao {
	@Before
	public void setUp() throws Exception {
		

		
	}
	@Test
	public void test1(){
	try{
		ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
       
		IEcoleDao dao=(IEcoleDao) app.getBean("dao");
		Eleve eleve=new Eleve();
		eleve.setNom("mohamed");
			dao.ajouterEleve(eleve);
			Classe classe=new Classe();
			classe.setClasseNom("ccccccccc");
			dao.ajouterClasse(classe);
			
		
		
		
	    assertTrue(true);
			}catch(Exception e){
				assertTrue(e.getMessage(),false);
				
			}
	}

}
