package com.ensit.project.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Exercice implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idExercice;
	private String sujet;
	private String date;
	@OneToOne
	@JoinColumn(name="idClasse")
	private Classe classe;
	@OneToOne
	@JoinColumn(name="idEnseignant")
	private Enseignant enseignant;
	@ManyToOne
	@JoinColumn(name="idMatiere")
	private Matiere matiere;
	public Long getIdExercice() {
		return idExercice;
	}
	public void setIdExercice(Long idExercice) {
		this.idExercice = idExercice;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	

}
