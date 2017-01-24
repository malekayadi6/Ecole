package com.ensit.project.form;

import java.util.List;

import com.ensit.project.entites.AbsenceEleve;

public class formAbsences {
	Long idMatiere;
	String date;
	String debutCour;
	String finCour;
    List<AbsenceEleve> absenceEleves;
	public Long getIdMatiere() {
		return idMatiere;
	}
	public void setIdMatiere(Long idMatiere) {
		this.idMatiere = idMatiere;
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
	public String getFinCour() {
		return finCour;
	}
	public void setFinCour(String finCour) {
		this.finCour = finCour;
	}
	public List<AbsenceEleve> getAbsenceEleves() {
		return absenceEleves;
	}
	public void setAbsenceEleves(List<AbsenceEleve> absenceEleves) {
		this.absenceEleves = absenceEleves;
	}
	

}
