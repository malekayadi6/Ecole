package com.ensit.project.form;

import java.util.ArrayList;
import java.util.List;

import com.ensit.project.entites.Note;

public class FormNote {
   private List<Note> notes=new ArrayList<Note>();
   private Long idMatiere;
   private Long idEleve;

   
public Long getIdMatiere() {
	return idMatiere;
}


public void setIdMatiere(Long idMatiere) {
	this.idMatiere = idMatiere;
}


public Long getIdEleve() {
	return idEleve;
}


public void setIdEleve(Long idEleve) {
	this.idEleve = idEleve;
}


public List<Note> getNotes() {
	return this.notes;
}


public void setNotes(List<Note> notess) {
	for(Note note:notess){
		this.notes.add(note);
	}
}



   
   
}
