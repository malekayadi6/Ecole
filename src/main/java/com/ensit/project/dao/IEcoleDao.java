package com.ensit.project.dao;

import java.util.Collection;
import java.util.List;

import com.ensit.project.entites.Classe;
import com.ensit.project.entites.Eleve;
import com.ensit.project.entites.EleveParent;
import com.ensit.project.entites.Enseignant;
import com.ensit.project.entites.Exercice;
import com.ensit.project.entites.Matiere;
import com.ensit.project.entites.Message;
import com.ensit.project.entites.Note;
import com.ensit.project.entites.Remarque;

public interface IEcoleDao {

	
	//operation d'ajouter 
	public Classe ajouterClasse(Classe classe);
	public Eleve ajouterEleve(Eleve eleve);
	public Enseignant ajouetrEnseignant(Enseignant enseignant);
	public EleveParent ajouterParents(EleveParent eleveParent);
	public Matiere ajouterMatiere(Matiere matiere);
	public void ajouterMessage(Message message,Long idParent,Long idEnseignant);
	public void ajouterRemarque(Remarque remarque,Long idEleve,Long idEnseignant);
	public Exercice ajouterExercice(Exercice exercice,Long idClasse,Long idEnseignant,Long idMatiere);

	public Matiere  getMteire(Long idMatiere);

	
	//opration get by id 
	EleveParent geEleveParent(Long idEleveParent);
	Classe getClasse(Long idClasse);
	Enseignant geEnseignant(Long idEnseignant);
	public Eleve getEleve(Long idEleve);
	
	//operation lister 
	List<Enseignant> listerEnseignants();
	List<EleveParent> listerEleveParents();
	public List<Matiere> listerMatieres();
	List<Classe> listerClasses();
	List<Eleve> listerEleves();
	public List<Eleve> liserEleveParclasse(Long idClasse);
	
	public List<Remarque> listerRemarque(Long idEleve);
	
	
	public List<Note> listerNoteParMatier(Long idEleve,Long idMatiere);
	public List<Message> listerMessage(Long idParent);
	public List<Note> listerNoteEleve(Long idEleve);
	public List<Exercice> listerExercice(Long idEleve);
	public List<Classe> ListerClasseEnseignant(Long idEnseignant);
	public List<Matiere> Matierenseignee(Long idEnsiegnant); 
	
	

	

	
	
	//operation add to 
	public void addEleveToClasse(Long idEleve,Long idClasse);
	public void addEnseignantToClasse(Long idEnseignant,Long idClasse);
	public void addEleveToParent(Long idEleve,Long idParent);
	public void addMatierToEnsiegnat(Long idEnsignant,Long idMatiere);
	
     	
	public List<Eleve> listerEleveParParent(Long idParent);

	

	public Eleve modifierEleve(Eleve eleve);

	public Enseignant modifierEnseignant(Enseignant enseignant);

	public EleveParent modifierEleveParent(EleveParent eleveParent);

	public void supprimerEleve(Long idEleve);

	public void supprimerEnseignant(Long idEnseignant);

	public void supprimerEleveParent(Long idEleveParent);



	

	EleveParent listerParentParEleve(Long idEleve);

	// operation sur les notes
	Note ajouterNote(Note note, Long idMatier, Long idEleve);

	Note ModifierNote(Long idNote, Long idMatiere, Long idEleve);

	public void supprimerNote(Long idNote, Long idMateire, Long idEleve);

	List<Note> consulterNotesEleve(Long idEleve);

	List<Matiere> consulterMatieresEleve(Long idEleve);

	Note consulterNoteParMateire(Long idEleve);
	
	

	public List<Exercice> listerExerciceEnseignant(Long idClasse,Long idEnseignant);

	
	

}
