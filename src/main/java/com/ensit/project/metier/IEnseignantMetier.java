package com.ensit.project.metier;

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

public interface IEnseignantMetier extends IParentMetier {

		public List<Classe> listerClasseEnsiegnant(Long idEnseignnat);
 		public Note ajouterNote(Note note, Long idMatier, Long idEleve) ;
 		public List<Exercice> listerExerciceEnseignant(Long idClasse,Long idEnseignant);
 		public Exercice ajouterExercice(Exercice exercice,Long idClasse,Long idEnseignant,Long idMatiere);
 		 public List<Eleve> listerEleveParclasse(Long idClasse) ;
 		Enseignant geEnseignant(Long idEnseignant);
 		public Eleve getEleve(Long idEleve);
 		public void ajouterRemarque(Remarque remarque, Long idEleve, Long idEnseignant) ;
       public List<Matiere> matieres();
       Classe getClasse(Long idClasse);
   	public Matiere getMteire(Long idMatiere) ;
	public List<Matiere> matiereEnseignee(Long idEnsiegnant) ;



		
		
		
		



}
