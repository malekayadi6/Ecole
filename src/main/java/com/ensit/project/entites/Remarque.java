package com.ensit.project.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Remarque implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idRemarque;
	private String rem;
	@ManyToOne
	@JoinColumn(name="idEleve")
    private Eleve eleve;
	@ManyToOne
	@JoinColumn(name="idEnsiegnant")
	private Enseignant enseignant;
	public Long getIdRemarque() {
		return idRemarque;
	}
	public void setIdRemarque(Long idRemarque) {
		this.idRemarque = idRemarque;
	}

	public String getRem() {
		return rem;
	}
	public void setRem(String rem) {
		this.rem = rem;
	}
	public Eleve getEleve() {
		return eleve;
	}
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	
	
}
