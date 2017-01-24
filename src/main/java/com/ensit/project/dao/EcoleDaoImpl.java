package com.ensit.project.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ensit.project.entites.Classe;
import com.ensit.project.entites.Eleve;
import com.ensit.project.entites.EleveParent;
import com.ensit.project.entites.Enseignant;
import com.ensit.project.entites.Exercice;
import com.ensit.project.entites.Matiere;
import com.ensit.project.entites.Message;
import com.ensit.project.entites.Note;
import com.ensit.project.entites.Remarque;

public class EcoleDaoImpl implements IEcoleDao {
	
    @PersistenceContext
    private EntityManager em;
	@Override
	public List<Enseignant> listerEnseignants() {
		Query req=em.createQuery("select e from Enseignant e");
		return req.getResultList();
	}

	@Override
	public List<EleveParent> listerEleveParents() {
		Query req=em.createQuery("select e from EleveParent e");
		return req.getResultList();
	}

	@Override
	public Eleve ajouterEleve(Eleve eleve) {
		// TODO Auto-generated method stub
		em.persist(eleve);
		return eleve;
	}

	@Override
	public Enseignant ajouetrEnseignant(Enseignant enseignant) {
		em.persist(enseignant);
		em.flush();
		return enseignant;
	}

	@Override
	public EleveParent ajouterParents(EleveParent eleveParent) {
            em.persist(eleveParent);
  		return eleveParent;
	}

	@Override
	public Eleve modifierEleve(Eleve eleve) {
		em.merge(eleve);
 		return eleve;
	}

	@Override
	public Enseignant modifierEnseignant(Enseignant enseignant) {
         em.merge(enseignant);
		return enseignant;
	}

	@Override
	public EleveParent modifierEleveParent(EleveParent eleveParent) {
		// TODO Auto-generated method stub
		em.merge(eleveParent);
		return eleveParent;
	}

	@Override
	public void supprimerEleve(Long idEleve) {
		Eleve eleve=getEleve(idEleve);
		em.remove(eleve);
		
	}

	@Override
	public void supprimerEnseignant(Long idEnseignant) {
		// TODO Auto-generated method stub
		Enseignant enseignant=geEnseignant(idEnseignant);
		em.remove(enseignant);
		
	}

	@Override
	public void supprimerEleveParent(Long idEleveParent) {
		// TODO Auto-generated method stub
		EleveParent eleveParent=geEleveParent(idEleveParent);
		em.remove(eleveParent);
		
	}

	@Override
	public Matiere ajouterMatiere(Matiere matiere) {
		// TODO Auto-generated method stub
		em.persist(matiere);
		return matiere;
	}


	

	@Override
	public Note ajouterNote(Note note, Long idMatier, Long idEleve) {
		Eleve eleve=em.find(Eleve.class, idEleve);
		Matiere matiere=em.find(Matiere.class,idMatier);
		note.setMatiere(matiere);
		matiere.getNote().add(note);
		eleve.getNotes().add(note);
		note.setEleve(eleve);
		em.persist(note);

		
		return null;
	}

	@Override
	public Note ModifierNote(Long idNote, Long idMatiere, Long idEleve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerNote(Long idNote, Long idMateire, Long idEleve) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Note> consulterNotesEleve(Long idEleve) {
		// TODO Auto-generated method stub
		Eleve eleve=em.find(Eleve.class, idEleve);
		return (List<Note>) eleve.getNotes();
	}

	@Override
	public List<Matiere> consulterMatieresEleve(Long idEleve) {
		// TODO Auto-generated method stub
		Eleve eleve=em.find(Eleve.class, idEleve);
		return null;
	}

	@Override
	public Note consulterNoteParMateire(Long idEleve) {
		// TODO Auto-generated method stub
	     
	    
	    
		return null;
				
	}

	@Override
	public EleveParent geEleveParent(Long idEleveParent) {
		// TODO Auto-generated method stub
		
		return em.find(EleveParent.class, idEleveParent);
	}

	@Override
	public Enseignant geEnseignant(Long idEnseignant) {
          Enseignant enseignant=em.find(Enseignant.class, idEnseignant);
		return enseignant;
	}

	@Override
	public Eleve getEleve(Long idEleve) {
		// TODO Auto-generated method stub
		
		return em.find(Eleve.class,idEleve);
	}

	@Override
	public List<Classe> listerClasses() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select c from Classe c");

		return req.getResultList();
	}

	@Override
	public Classe ajouterClasse(Classe classe) {
         em.persist(classe);
		return classe;
	}

	@Override
	public Classe getClasse(Long idClasse) {
		
		return em.find(Classe.class,idClasse);

	}

	@Override
	public List<Eleve> liserEleveParclasse(Long idClasse) {
		//Query req=em.cre
		Query req=em.createQuery("select e from Eleve e where e.classse.idClasse = :x").setParameter("x",idClasse);
		//req.setParameter("x",idClasse);
		return req.getResultList();
	}



	@Override
	public void addEleveToClasse(Long idEleve, Long idClasse) {
		Eleve eleve=em.find(Eleve.class,idEleve);
		Classe classe=em.find(Classe.class,idClasse);
		classe.getEleves().add(eleve);
		eleve.setClassse(classe);
		
		
	}

	

	@Override
	public List<Eleve> listerEleves() {
		Query req=em.createQuery("select e from Eleve e");
		return req.getResultList();
	}

	@Override
	public void addEnseignantToClasse(Long idEnseignant, Long idClasse) {
		// TODO Auto-generated method stub
		Enseignant enseignant=em.find(Enseignant.class, idEnseignant);
		Classe classe=em.find(Classe.class, idClasse);
		enseignant.getClasses().add(classe);
		classe.setEnseignant(enseignant);
		
	}

	@Override
	public void addEleveToParent(Long idEleve, Long idParent) {
		EleveParent eleveParent=geEleveParent(idParent);
		Eleve eleve=getEleve(idEleve);
		eleveParent.getEleves().add(eleve);
		eleve.setEleveParent(eleveParent);
		
	}




	@Override
	public List<Classe> ListerClasseEnseignant(Long idEnseignant) {
         Query req=em.createQuery("select c from Classe c where c.enseignant.id = :x").setParameter("x",idEnseignant);
		
		return req.getResultList();
	}

	@Override
	public List<Eleve> listerEleveParParent(Long idParent) {
		  Query req=em.createQuery("select e from Eleve e where e.eleveParent.id = :x").setParameter("x",idParent);
			
			return req.getResultList();
		
	}

	@Override
	public EleveParent listerParentParEleve(Long idEleve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Note> listerNoteParMatier(Long idEleve, Long idMatiere) {
		 Query req=em.createQuery("select n from Note n where n.eleve.id = :x and n.matiere.idMatiere=:y").setParameter("x",idEleve).setParameter("y", idMatiere);
			
			return req.getResultList();
	}

	@Override
	public void ajouterMessage(Message message,Long idParent,Long idEnseignant){
		Enseignant enseignant= em.find(Enseignant.class, idEnseignant);
		EleveParent eleveParent=em.find(EleveParent.class, idParent);
		enseignant.getMessages().add(message);
		eleveParent.getMessages().add(message);
		message.setEns(enseignant);
		message.setEleveParent(eleveParent);
		em.persist(message);
		
		 
		
	}

	@Override
	public List<Message> listerMessage(Long idParent) {
		Query req=em.createQuery("select m from Message m where m.eleveParent.id = :x ORDER BY m.idMessage DESC" ).setParameter("x",idParent);
		
		return req.getResultList();
	}

	@Override
	public List<Note> listerNoteEleve(Long idEleve) {
	Query req=em.createQuery("select n from Note n where n.eleve.id = :x ORDER BY n.idNote DESC").setParameter("x",idEleve);
		
		return req.getResultList();
	}

	@Override
	public Exercice ajouterExercice(Exercice exercice, Long idClasse, Long idEnseignant,Long idMatiere) {
		// TODO Auto-generated method stub
		Classe classe=em.find(Classe.class,idClasse);
		Matiere matiere=em.find(Matiere.class, idMatiere);
		exercice.setMatiere(matiere);
		Enseignant enseignant=em.find(Enseignant.class,idEnseignant);
		exercice.setClasse(classe);
		exercice.setEnseignant(enseignant);
		em.persist(exercice);
		return exercice;
	}
	@Override
	public List<Exercice> listerExercice(Long idEleve) {
			Eleve eleve=em.find(Eleve.class, idEleve);
		      Long idClasse= eleve.getClassse().getIdClasse();				 
        Query req=em.createQuery("select e from Exercice e where e.classe.idClasse = :x ORDER BY e.idExercice DESC" ).setParameter("x",idClasse);
		
		return req.getResultList();
	}
	@Override
	public List<Exercice> listerExerciceEnseignant(Long idClasse,Long idEnseignant) {
		  Query req=em.createQuery("select e from Exercice e where e.classe.idClasse = :x and e.enseignant.id = :y ORDER BY e.idExercice DESC" ).setParameter("x",idClasse).setParameter("y", idEnseignant);
		
		return req.getResultList();
	}

	@Override
	public void ajouterRemarque(Remarque remarque, Long idEleve, Long idEnseignant) {
		// TODO Auto-generated method stub
		Eleve eleve=em.find(Eleve.class,idEleve);
		Enseignant enseignant=em.find(Enseignant.class,idEnseignant);
		remarque.setEleve(eleve);
		remarque.setEnseignant(enseignant);
		em.persist(remarque);
		
	}

	@Override
	public List<Remarque> listerRemarque(Long idEleve) {
		   Query req=em.createQuery("select r from Remarque r where r.eleve.id = :x ORDER BY r.idRemarque DESC" ).setParameter("x",idEleve);
			
					return req.getResultList();
			       
		
	}

	@Override
	public List<Matiere> listerMatieres() {
		// TODO Auto-generated method stub
		  Query req=em.createQuery("select m from Matiere m");
		return req.getResultList();
	}

	@Override
	public Matiere getMteire(Long idMatiere) {
		// TODO Auto-generated method stub
		return em.find(Matiere.class,idMatiere);
	}

	@Override
	public void addMatierToEnsiegnat(Long idEnsignant, Long idMatiere) {
		Enseignant enseignant=em.find(Enseignant.class, idEnsignant);
		Matiere matiere=em.find(Matiere.class, idMatiere);
		matiere.setEnseignant(enseignant);
		enseignant.getMatieres().add(matiere);
		
	}

	@Override
	public List<Matiere> Matierenseignee(Long idEnsiegnant) {
		 Query req=em.createQuery("select m from Matiere m where m.enseignant.id = :x" ).setParameter("x",idEnsiegnant);
			
			return req.getResultList();
	}





	



}
