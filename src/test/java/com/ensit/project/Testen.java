package com.ensit.project;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ensit.project.entites.Classe;
import com.ensit.project.entites.Eleve;
import com.ensit.project.entites.EleveParent;
import com.ensit.project.entites.Enseignant;
import com.ensit.project.entites.Matiere;
import com.ensit.project.entites.Message;
import com.ensit.project.entites.Note;
import com.ensit.project.form.FormNote;
import com.ensit.project.metier.IAdminMetier;

public class Testen {
	@Before
	public void setUp() throws Exception {
		

		
	}
	@Test
	public void test1(){
	try{
		ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
       
	   IAdminMetier metier=(IAdminMetier) app.getBean("metier");
	   FormNote formNote=new FormNote();
	   List<Note> notes=new ArrayList<Note>();
	   Note note=new Note();
	   note.setNote(14.4);
	   Note note2=new Note();
	   note2.setNote(12.2);
	   notes.add(note);
	   notes.add(note2);
	   formNote.setNotes(notes);
	   List<Note> notes2=formNote.getNotes();
	   for(Note note3:notes2){
		   metier.ajouterNote(note3, 1L, 1L);

	   }
	  
/*	Enseignant enseignant=new Enseignant();
	    enseignant.setNom("ddddddddddd");
	    metier.addEnseignant(enseignant);
	    Classe classe=new Classe();
	    classe.setClasseNom("c");
	    Classe classe1=new Classe();
	    classe.setClasseNom("c1");
	    metier.ajouterClasse(classe1);
	    metier.ajouterClasse(classe);
	  
  Eleve eleve=new Eleve();
	    eleve.setNom("m");
	    metier.addEleve(eleve);
	    Matiere matiere=new Matiere();
	    matiere.setDesignation("ffff");
	    metier.ajouterMatiere(matiere);
	    EleveParent eleveParent=new EleveParent();
	    eleveParent.setNom("vvv");
	    metier.ajouterParents(eleveParent);
	    metier.addEleveToClasse(1L, 1L);
	    
        /*   Note note=new Note();
           note.setNote(14.5);
           note.setType("s");
           metier.ajouterNote(note, 1l,1L);
           System.out.println(metier.lisetNoteParMatier(1L,1L));
           Message message=new Message();
           message.setMsg("votre enfants OKKKKKKKK");
           metier.ajouterMessage(message, 1L, 1L);
          /* ArrayList<Message> messages=(ArrayList<Message>) metier.listerMessage(1L);
           for(Message message2:messages){
        	   System.out.println(message2.getIdMessage());
           }
         
   */
	   System.out.println(metier.listerExercice(1L));
		
	    assertTrue(true);
			}catch(Exception e){
				assertTrue(e.getMessage(),false);
				
			}
	}

}
