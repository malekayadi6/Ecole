package com.ensit.project.metier;

import java.util.List;

import com.ensit.project.entites.Eleve;
import com.ensit.project.entites.Enseignant;
import com.ensit.project.entites.Exercice;
import com.ensit.project.entites.Message;
import com.ensit.project.entites.Note;
import com.ensit.project.entites.Remarque;

public interface IParentMetier {
	public List<Eleve> listerEleve(Long idParent);
	public List<Note> lisetNoteParMatier(Long idEleve,Long idMatiere);
	public List<Message> listerMessage(Long idParent);
	public List<Note> listerNoteEleve(Long idEleve);
	public void ajouterMessage(Message message,Long idParent,Long idEnseignant);
	public List<Enseignant> listerEnseignants() ;
	public List<Exercice> listerExercice(Long idEleve) ;
	public List<Remarque> listerRemarque(Long idEleve);
	
	

}
