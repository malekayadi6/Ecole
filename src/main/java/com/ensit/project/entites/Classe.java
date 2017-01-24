package com.ensit.project.entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Classe implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClasse;
	private String classeNom;
	private int nombreDeEleve;
	@OneToMany(cascade={CascadeType.ALL},mappedBy="classse")
	private Collection<Eleve> eleves;
	@ManyToOne
	@JoinColumn(name="idenseignant")
	private Enseignant enseignant;
		public Long getIdClasse() {
		return idClasse;
	}
	public Enseignant getEnseignant() {
			return enseignant;
		}
		public void setEnseignant(Enseignant enseignant) {
			this.enseignant = enseignant;
		}
	public void setIdClasse(Long idClasse) {
		this.idClasse = idClasse;
	}
	public String getClasseNom() {
		return classeNom;
	}
	public void setClasseNom(String classeNom) {
		this.classeNom = classeNom;
	}
	public int getNombreDeEleve() {
		return eleves.size();
	}
	public void setNombreDeEleve(int nombreDeEleve) {
		this.nombreDeEleve = nombreDeEleve;
	}
	public Collection<Eleve> getEleves() {
		return eleves;
	}
	public void setEleves(Collection<Eleve> eleves) {
		this.eleves = eleves;
	}
	
	public void AjouterElever(Eleve eleve){
		this.eleves.add(eleve);
	}
	
	
	
	

}
