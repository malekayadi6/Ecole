package com.ensit.project.entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.ensit.project.entites.Eleve;

import org.springframework.format.annotation.DateTimeFormat;



public class AbsenceEleve implements Serializable {
	
    private Long id;
    private String date;
	private String debutCour; 
   
    private Boolean absence;
    private Matiere matiere;
    private Eleve eleve;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDebutCour() {
		return debutCour;
	}
	public void setDebutCour(String debutCour) {
		this.debutCour = debutCour;
	}
	public Boolean getAbsence() {
		return absence;
	}
	public void setAbsence(Boolean absence) {
		this.absence = absence;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	public Eleve getEleve() {
		return eleve;
	}
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
    
    
    
    
	
}
