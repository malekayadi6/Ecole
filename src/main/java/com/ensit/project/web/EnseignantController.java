package com.ensit.project.web;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.asm.commons.Remapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ensit.project.entites.AbsenceEleve;
import com.ensit.project.entites.Classe;
import com.ensit.project.entites.Eleve;
import com.ensit.project.entites.Enseignant;
import com.ensit.project.entites.Exercice;
import com.ensit.project.entites.Matiere;
import com.ensit.project.entites.Note;

import com.ensit.project.entites.Remarque;
import com.ensit.project.form.FormAjoutNote;
import com.ensit.project.form.FormNote;
import com.ensit.project.form.formAbsences;
import com.ensit.project.metier.IEnseignantMetier;
import com.ensit.project.metier.IParentMetier;


	@Controller
	@RequestMapping(value="/ens")
	public class EnseignantController {
		@Autowired
		private IEnseignantMetier metier;

		public IEnseignantMetier getMetier() {
			return metier;
		}
		@RequestMapping(value="home")
		public String home(Model model){
		
			List<Classe> classes=metier.listerClasseEnsiegnant(1L);
	
			model.addAttribute("classes",classes);
	
		
		  return "ens/home";
		}
		
		@RequestMapping(value="remarque")
		public String remarque(@RequestParam("id") String id,Model model){
			Long idEleve=Long.parseLong(id);
			Remarque remarque=new Remarque();
			Eleve eleve=metier.getEleve(Long.parseLong(id));
			remarque.setEleve(eleve);
			List<Classe> classes=metier.listerClasseEnsiegnant(1L);
		
			model.addAttribute("remarque", remarque);
			model.addAttribute("classes",classes);
		
		
		  return "ens/remarque";
		}
			@RequestMapping(value="remarque/add",method=RequestMethod.POST)			
        public String ajouterRemarque(@Valid @ModelAttribute("remarque") Remarque remarque, BindingResult result,Model model){
	           metier.ajouterRemarque(remarque, remarque.getEleve().getId(), 1L);
				
				
		               
		  return "redirect:/ens/remarque?id="+remarque.getEleve().getId();
		}
		@RequestMapping(value="exercices")
		public String listerExercice(@RequestParam("id") String id,Model model){
			Long idClasse=Long.parseLong(id);
			List<Classe> classes=metier.listerClasseEnsiegnant(1L);
			List<Exercice> exercices=metier.listerExerciceEnseignant(idClasse,1L);
			model.addAttribute("classes",classes);
			model.addAttribute("exercices", exercices);
		
		  return "ens/exercice";
		}
		@RequestMapping(value="exercice/add",method=RequestMethod.POST)			
        public String ajouterExercice(@Valid @ModelAttribute("exercice") Exercice exercice, BindingResult result,Model model){
	
		
			//metier.ajouterExercice(exercice, exercice.getClasse().getIdClasse(),exercice.getEnseignant().getId(), exercice.getMatiere().getIdMatiere());
			
		metier.ajouterExercice(exercice, exercice.getClasse().getIdClasse(),1L,exercice.getMatiere().getIdMatiere());
	
			
		
		  return "redirect:/ens/exercice/add?id="+exercice.getClasse().getIdClasse();
		}
		@RequestMapping(value="exercice/add")
		public String addExercice(Model model){
	              
	     	
			List<Classe> classes=metier.listerClasseEnsiegnant(1L);;
			List<Matiere> matieres=metier.matieres();
			Exercice exercice=new Exercice();
			model.addAttribute("exercice", exercice);
			model.addAttribute("matieres", matieres);
			model.addAttribute("classes", classes);
		
		  return "ens/exerciceAdd";
		}
		@RequestMapping(value="notes/Add",method=RequestMethod.POST)			
        public String ajouterNotes(@Valid @ModelAttribute("ajoutNote") FormAjoutNote ajoutNote , BindingResult result,Model model){
			
			List<Eleve> eleves=metier.listerEleveParclasse(Long.parseLong(ajoutNote.getIdClasse()));
			List<Classe> classes=metier.listerClasseEnsiegnant(1L);
			Matiere matiere=metier.getMteire(Long.parseLong(ajoutNote.getIdMatiere()));
			

			List<Note> notes=new ArrayList<Note>();
			for(Eleve eleve:eleves){
				Note note=new Note();
				note.setEleve(eleve);
				note.setType(ajoutNote.getType());
				note.setMatiere(matiere);
				notes.add(note);
			}
			FormNote formNote=new FormNote();
			formNote.setNotes(notes);
			formNote.setIdMatiere(Long.parseLong(ajoutNote.getIdMatiere()));
			model.addAttribute("formNote", formNote);

			
			model.addAttribute("classes", classes);
		
         

			return "ens/noteAdd";
		}
		@RequestMapping(value="/notes/ajouter")
		public String ajouterNote(	
				Model model){
			FormAjoutNote ajoutNote=new FormAjoutNote();
			List<Matiere> matieres=metier.matiereEnseignee(1L);
			List<Classe> classes=metier.listerClasseEnsiegnant(1L);

			model.addAttribute("matieres", matieres);
			model.addAttribute("classes", classes);
			model.addAttribute("ajoutNote", ajoutNote);


			
		    return "ens/noteEns";
		}
		@RequestMapping(value="note/Add",method=RequestMethod.POST)			
        public String noteAdd(@Valid @ModelAttribute("formNote") FormNote formNote , BindingResult result,Model model){
			
		   Note note4=new Note();
		   note4.setNote(54.1);
		   metier.ajouterNote(note4, 2L, 1L);
		   
		  if(formNote.getNotes().isEmpty()){
			   return "redirect:/ens/matieres";
		   }
			for(Note note:formNote.getNotes()){
		          Note note2=new Note();
		          note2.setNote(note.getNote());
		          note2.setType("Test");
					metier.ajouterNote(note2, 1L, 2L);

				//metier.ajouterNote(note2, note.getMatiere().getIdMatiere(), note.getEleve().getId());
				System.out.println("icirr"+formNote.getIdMatiere());
			}	         

			 return "redirect:/ens/notes/ajouter";
		}
		
		  
		/*
		@RequestMapping(value="/notesAdd")
		public String addNote(@Valid @ModelAttribute("exercice") RechMat rechMat,Model model){
			metier.listerEleveParclasse(idClasse);
			List<Classe> classes=metier.listerClasseEnsiegnant(1L);
			RechMat rechMat=new RechMat();
			model.addAttribute("rechMat", rechMat);
            
			model.addAttribute("classes", classes);
			List<Matiere> matieres=metier.matieres();
			model.addAttribute("matieres", matieres);
         

			return "ens/noteAdd";
		}*/
		
		@RequestMapping(value="/eleves")
		public String eleves(@RequestParam("id") String id,Model model){
			Long idClasse=Long.parseLong(id);
			List<Eleve> eleves=metier.listerEleveParclasse(idClasse);
			List<Classe> classes=metier.listerClasseEnsiegnant(1L);
			model.addAttribute("classes", classes);
			model.addAttribute("eleves", eleves);

			return "ens/info";
			
		}
		@RequestMapping(value="/notes")
		public String notes(@RequestParam("id") String id,Model model){
		
		Long idEleve=Long.parseLong(id);
		List<Note> notes=metier.listerNoteEleve(idEleve);
		List<Classe> classes=metier.listerClasseEnsiegnant(1L);
		model.addAttribute("classes", classes);
		model.addAttribute("notes", notes);
		return "ens/note";
		
		}
		@RequestMapping(value="/matieres")
		public String matiere(Model model){
		 
	    List<Matiere> matieres=metier.matiereEnseignee(1L);
		List<Classe> classes=metier.listerClasseEnsiegnant(1L);
		model.addAttribute("classes", classes);

		model.addAttribute("matieres", matieres);
		
		return "ens/matiere";
		
		}
	
		@RequestMapping(value="/notes/eleve")
	    public String noteEleve(@RequestParam("id") String id, Model model)
	    {
	        Long idEleve=Long.parseLong(id);
	    	List<Classe> classes=metier.listerClasseEnsiegnant(1L);
			List<Note> notes=metier.listerNoteEleve(idEleve);
			model.addAttribute("classes", classes);

			model.addAttribute("notes",notes);

		  return "ens/listeNote";
		}
		@RequestMapping(value="/absence/eleves")
	    public String absencesEleves(@RequestParam("id") String id, Model model)
	    {
	        Long idClasse=Long.parseLong(id);
			List<Eleve> eleves=metier.listerEleveParclasse(idClasse);
             formAbsences absences=new formAbsences();
               List<AbsenceEleve> absenceEleves=new ArrayList<AbsenceEleve>();
             for(Eleve eleve:eleves){
                 AbsenceEleve absenceEleve=new AbsenceEleve();
                    absenceEleve.setEleve(eleve);
                    absenceEleves.add(absenceEleve);
                    
             }
             absences.setAbsenceEleves(absenceEleves);
	    	List<Classe> classes=metier.listerClasseEnsiegnant(1L);
		    List<Matiere> matieres=metier.matiereEnseignee(1L);
	    	model.addAttribute("matieres", matieres);

	    	model.addAttribute("classes", classes);
			model.addAttribute("absences",absences);

			model.addAttribute("eleves",eleves);

		  return "ens/absences";
		}
}
