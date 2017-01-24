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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="eleves")
public class Eleve  implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String cin;
	private String nom;
	private String prenom;
	private String dateDeNaissance;
	private String lieuNaissance;
	private String sex;
	private String telMobile;
	@OneToOne(cascade={CascadeType.ALL})
	private Adresse adresse;

    @ManyToOne
    @JoinColumn(name="id_parent")
    private EleveParent eleveParent;
    @OneToMany(mappedBy="eleve")
    private Collection<Note> notes;
 
    @ManyToOne
    @JoinColumn(name="idClasse")
    private Classe classse;
    
  
    

    



	public Classe getClassse() {
		return classse;
	}

	public void setClassse(Classe classse) {
		this.classse = classse;
	}




	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getLieuNaissance() {
		return lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelMobile() {
		return telMobile;
	}

	public void setTelMobile(String telMobile) {
		this.telMobile = telMobile;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public Collection<Note> getNotes() {
		return notes;
	}

	public void setNotes(Collection<Note> notes) {
		this.notes = notes;
	}

	public EleveParent getEleveParent() {
		return eleveParent;
	}

	public void setEleveParent(EleveParent eleveParent) {
		this.eleveParent = eleveParent;
	}
    
    
}
