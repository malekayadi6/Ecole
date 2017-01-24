package com.ensit.project.metier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.print.attribute.DocAttribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ensit.project.dao.IEcoleDao;
import com.ensit.project.entites.Classe;
import com.ensit.project.entites.Eleve;
import com.ensit.project.entites.EleveParent;
import com.ensit.project.entites.Enseignant;
import com.ensit.project.entites.Exercice;
import com.ensit.project.entites.Matiere;
import com.ensit.project.entites.Message;
import com.ensit.project.entites.Note;
import com.ensit.project.entites.Remarque;
@Transactional
public class metier implements IAdminMetier {
	
	@Autowired
	private IEcoleDao dao;
   
	public IEcoleDao getDao() {
		return dao;
	}

	public void setDao(IEcoleDao dao) {
		this.dao = dao;
	}

	public Enseignant ajouetrEnseignant(Enseignant enseignant,List<Classe> classes) {
		ArrayList<Classe> classes2=new ArrayList<Classe>();
		for(Classe classe:classes){
			classes2.add(dao.getClasse(classe.getIdClasse()));
		}
		enseignant.setClasses(classes);
		dao.ajouetrEnseignant(enseignant);
		return enseignant;
	}

	@Override
	public List<Enseignant> listerEnseignants() {
		return dao.listerEnseignants();

	}

	@Override
	public Eleve modifierEleve(Eleve eleve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enseignant modifierEnseignant(Enseignant enseignant) {
		// TODO Auto-generated method stub
		dao.modifierEnseignant(enseignant);
		return enseignant;
	}

	@Override
	public EleveParent modifierEleveParent(EleveParent eleveParent) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void supprimerEleve(Long idEleve) {
		// TODO Auto-generated method stub
		dao.supprimerEleve(idEleve);
		
	}

	@Override
	public void supprimerEnseignant(Long idEnseignant) {
		// TODO Auto-generated method stub
		dao.supprimerEnseignant(idEnseignant);
		
	}

	@Override
	public void supprimerEleveParent(Long idEleveParent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Matiere ajouterMatiere(Matiere matiere) {
		// TODO Auto-generated method stub
		return dao.ajouterMatiere(matiere);
	}






	@Override
	public Eleve getEleve(Long idEleve) {
		// TODO Auto-generated method stub
		return dao.getEleve(idEleve);
	}

	@Override
	public List<Classe> listerClasses() {
		// TODO Auto-generated method stub
		return dao.listerClasses();
	}

	@Override
	public List<EleveParent> listerEleveParents() {
		// TODO Auto-generated method stub
		return dao.listerEleveParents();
	}

	@Override
	public Classe ajouterClasse(Classe classe) {
		// TODO Auto-generated method stub
		return dao.ajouterClasse(classe);
	}



	@Override
	public Eleve ajouterEleve(Eleve eleve,Long idClasse,Long idParent) {
		EleveParent eleveParent=dao.geEleveParent(idParent);
     Classe classe=dao.getClasse(idClasse);
		
     
         
     eleve.setClassse(classe);
		eleve.setEleveParent(eleveParent);
		
		return dao.ajouterEleve(eleve);

	}

	@Override
	public EleveParent ajouterParents(EleveParent eleveParent) {
		// TODO Auto-generated method stub
		return dao.ajouterParents(eleveParent);
	}

	@Override
	public List<Eleve> listerEleveParclasse(Long idClasse) {
		// TODO Auto-generated method stub
		return dao.liserEleveParclasse(idClasse);
	}

	


	@Override
	public void addEleveToClasse(Long idEleve, Long idClasse) {
		dao.addEleveToClasse(idEleve, idClasse);
		
	}


	@Override
	public Eleve addEleve(Eleve eleve) {
		// TODO Auto-generated method stub
		return dao.ajouterEleve(eleve);
	}

	@Override
	public List<Classe> listerClasseEnsiegnant(Long idEnseignnat) {
		// TODO Auto-generated method stub
		return dao.ListerClasseEnseignant(idEnseignnat);
	}

	@Override
	public Enseignant addEnseignant(Enseignant enseignant) {
		// TODO Auto-generated method stub
		return dao.ajouetrEnseignant(enseignant);
		
		
	}

	@Override
	public void addEnseignantToClasse(Long idEnseignant, Long idClasse) {
		dao.addEnseignantToClasse(idEnseignant, idClasse);
		
	}

	@Override
	public List<Eleve> listerEleve(Long idParent) {
		// TODO Auto-generated method stub
		return dao.listerEleveParParent(idParent);
	}

	@Override
	public Note ajouterNote(Note note, Long idMatier, Long idEleve) {
		// TODO Auto-generated method stub
		return dao.ajouterNote(note, idMatier, idEleve);
	}

	@Override
	public List<Note> lisetNoteParMatier(Long idEleve, Long idMatiere) {
		// TODO Auto-generated method stub
		return dao.listerNoteParMatier(idEleve, idMatiere);
	}

	@Override
	public void ajouterMessage(Message message, Long idParent, Long idEnseignant) {
		dao.ajouterMessage(message, idParent, idEnseignant);
		
	}

	@Override
	public List<Message> listerMessage(Long idParent) {
		// TODO Auto-generated method stub
		return dao.listerMessage(idParent);
	}

	@Override
	public List<Note> listerNoteEleve(Long idEleve) {
		// TODO Auto-generated method stub
		return dao.listerNoteEleve(idEleve);
	}

	@Override
	public void addEleveToParent(Long idEleve, Long idParent) {
		dao.addEleveToParent(idEleve, idParent);
		
	}

	@Override
	public List<Exercice> listerExerciceEnseignant(Long idClasse, Long idEnseignant) {
		// TODO Auto-generated method stub
		return dao.listerExerciceEnseignant(idClasse, idEnseignant);
	}

	@Override
	public Exercice ajouterExercice(Exercice exercice, Long idClasse, Long idEnseignant,Long idMatiere) {
		// TODO Auto-generated method stub
		return dao.ajouterExercice(exercice, idClasse, idEnseignant, idMatiere);
	}

	@Override
	public List<Exercice> listerExercice(Long idEleve) {
		// TODO Auto-generated method stub
		return dao.listerExercice(idEleve);
	}

	@Override
	public Enseignant geEnseignant(Long idEnseignant) {
		// TODO Auto-generated method stub
		return dao.geEnseignant(idEnseignant);
	}

	@Override
	public void ajouterRemarque(Remarque remarque, Long idEleve, Long idEnseignant) {
		dao.ajouterRemarque(remarque, idEleve, idEnseignant);
		
	}

	@Override
	public List<Remarque> listerRemarque(Long idEleve) {
		// TODO Auto-generated method stub
		return dao.listerRemarque(idEleve);
	}

	@Override
	public List<Matiere> matieres() {
		// TODO Auto-generated method stub
		return dao.listerMatieres();
	}

	@Override
	public Classe getClasse(Long idClasse) {
		// TODO Auto-generated method stub
		return dao.getClasse(idClasse);
	}

	@Override
	public Matiere getMteire(Long idMatiere) {
		// TODO Auto-generated method stub
		return dao.getMteire(idMatiere);
	}

	@Override
	public void addMatierToEnsiegnat(Long idEnsignant, Long idMatiere) {
		dao.addMatierToEnsiegnat(idEnsignant, idMatiere);
		
	}

	@Override
	public List<Matiere> matiereEnseignee(Long idEnsiegnant) {
		// TODO Auto-generated method stub
		return dao.Matierenseignee(idEnsiegnant);
	}


	
}
