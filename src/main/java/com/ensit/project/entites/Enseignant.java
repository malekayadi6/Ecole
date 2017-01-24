package com.ensit.project.entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Enseignant implements Serializable  {
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
	
	
	
	@OneToMany(cascade={CascadeType.ALL},mappedBy="enseignant")	
	private Collection<Classe> classes;
	
	  @OneToMany(mappedBy="ens")
	 private Collection<Message> messages;
	  @OneToMany(mappedBy="enseignant")
	 private Collection<Matiere> matieres;
	  
	  
	

	public Collection<Matiere> getMatieres() {
		return matieres;
	}
	public void setMatieres(Collection<Matiere> matieres) {
		this.matieres = matieres;
	}
	public Collection<Message> getMessages() {
		return messages;
	}
	public void setMessages(Collection<Message> messages) {
		this.messages = messages;
	}
	public Collection<Classe> getClasses() {
		return classes;
	}
	public void setClasses(Collection<Classe> classes) {
		this.classes = classes;
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
	
	
	

}
