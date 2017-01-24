package com.ensit.project.metier;

import java.util.List;

import com.ensit.project.entites.Classe;
import com.ensit.project.entites.Eleve;
import com.ensit.project.entites.EleveParent;
import com.ensit.project.entites.Enseignant;
import com.ensit.project.entites.Matiere;

public interface IAdminMetier extends IEnseignantMetier {
	public Eleve ajouterEleve(Eleve eleve,Long idClasse,Long idParent);
	public EleveParent ajouterParents(EleveParent eleveParent);
	
	public Classe ajouterClasse(Classe classe);
	public Enseignant ajouetrEnseignant(Enseignant enseignant,List<Classe> classes) ;
	
	public List<Classe> listerClasses();
	List<EleveParent> listerEleveParents();
	public void addMatierToEnsiegnat(Long idEnsignant, Long idMatiere) ;
	
	   public Eleve modifierEleve(Eleve eleve);
	   public Enseignant modifierEnseignant(Enseignant enseignant);
	   public EleveParent modifierEleveParent(EleveParent eleveParent);
	   
	   
	   public void supprimerEleve(Long idEleve);
	   public void supprimerEnseignant(Long idEnseignant);
	   public void supprimerEleveParent(Long idEleveParent);
	   
	   public Matiere ajouterMatiere(Matiere matiere);
		public void addEleveToClasse(Long idEleve,Long idClasse);
    public Eleve addEleve(Eleve eleve);
     public Enseignant addEnseignant(Enseignant enseignant);
 	public void addEnseignantToClasse(Long idEnseignant,Long idClasse);
 	public void addEleveToParent(Long idEleve, Long idParent);

}
