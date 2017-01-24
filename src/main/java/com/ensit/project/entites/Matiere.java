package com.ensit.project.entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Matiere implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMatiere;
	private String nom;
	@ManyToOne
	@JoinColumn(name="idEnsiegnant")
	private Enseignant enseignant;
	
	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	private String designation;
	private Double coef;
	
	
	@OneToMany(mappedBy="matiere")	
	private Collection<Note> note;

	
  
	public Long getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(Long idMatiere) {
		this.idMatiere = idMatiere;
	}


	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getCoef() {
		return coef;
	}

	public void setCoef(Double coef) {
		this.coef = coef;
	}

	public Collection<Note> getNote() {
		return note;
	}

	public void setNote(Collection<Note> note) {
		this.note = note;
	}

	
}
