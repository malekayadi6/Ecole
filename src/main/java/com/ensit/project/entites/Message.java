package com.ensit.project.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Message implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMessage;
	private String msg;
	//private Date date;
	private String objet;
	
	@ManyToOne
	@JoinColumn(name="idParent")
	private EleveParent eleveParent;
	
	@ManyToOne
	@JoinColumn(name="idEnseignant")
	private Enseignant ens;
	public Long getIdMessage() {
		return idMessage;
	}
	public void setIdMessage(Long idMessage) {
		this.idMessage = idMessage;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	/*
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}*/
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public EleveParent getEleveParent() {
		return eleveParent;
	}
	public void setEleveParent(EleveParent eleveParent) {
		this.eleveParent = eleveParent;
	}
	public Enseignant getEns() {
		return ens;
	}
	public void setEns(Enseignant ens) {
		this.ens = ens;
	}


	
	
}
