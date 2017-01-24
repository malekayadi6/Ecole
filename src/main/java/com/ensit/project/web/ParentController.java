package com.ensit.project.web;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ensit.project.entites.Classe;
import com.ensit.project.entites.Eleve;
import com.ensit.project.entites.EleveParent;
import com.ensit.project.entites.Enseignant;
import com.ensit.project.entites.Exercice;
import com.ensit.project.entites.Message;
import com.ensit.project.entites.Note;
import com.ensit.project.entites.Remarque;
import com.ensit.project.metier.IParentMetier;

@Controller
@RequestMapping(value="/parent")
public class ParentController {
	@Autowired
	private IParentMetier metier;

	public IParentMetier getMetier() {
		return metier;
	}

	public void setMetier(IParentMetier metier) {
		this.metier = metier;
	}
	@RequestMapping(value="home")
	public String listerEnseignant(Model model){
	
		List<Eleve> eleves=metier.listerEleve(1L);
		model.addAttribute("eleves",eleves);
	  return "parent/home";
	}
	@RequestMapping(value="/eleves")
    public String eleves(Model model){

        List<Eleve> eleves=metier.listerEleve(1L);
    	model.addAttribute("eleves",eleves);
    
       
        return "parent/infoEleve";
    }
	@RequestMapping(value="/exercice")
	public String listerExercice(@RequestParam("id") String id,Model model){
          Long idEleve=Long.parseLong(id);
          List<Eleve> eleves=metier.listerEleve(1L);
  		model.addAttribute("eleves",eleves);
		List<Exercice> exercices=metier.listerExercice(idEleve);
	
		model.addAttribute("exercices",exercices);
	  return "parent/exercice";
	}
	@RequestMapping(value="/notes/eleve")
    public String noteEleve(@RequestParam("id") String id, Model model)
    {
        Long idEleve=Long.parseLong(id);
		List<Eleve> eleves=metier.listerEleve(1L);
		List<Note> notes=metier.listerNoteEleve(idEleve);
		model.addAttribute("eleves",eleves);
		model.addAttribute("notes",notes);

	  return "parent/note";
	}
	@RequestMapping(value="/messages")
	public String listerMessages(Model model){
		List<Eleve> eleves=metier.listerEleve(1L);
		List<Message> messages=metier.listerMessage(1L);
		model.addAttribute("messages", messages);
		model.addAttribute("eleves",eleves);
		
	  return "parent/message";
	}
	@RequestMapping(value="/envoyermsg")
    public String msg(Model model){
      
         Message message=new Message();
         List<Enseignant> enseignants=metier.listerEnseignants();
        List<Eleve> eleves=metier.listerEleve(1L);
    	model.addAttribute("eleves",eleves);
        model.addAttribute("enseignants",enseignants);
        model.addAttribute("message",message);
       
        return "parent/envoyerMSG";
    }
	 @RequestMapping(value ="/envoyermsg", method = RequestMethod.POST)
	    public String msg(@Valid @ModelAttribute("massage") Message message, BindingResult result){
		 
		 metier.ajouterMessage(message, 1L, message.getEns().getId());
		
		 return "redirect:/parent/messages";
	 }
		@RequestMapping(value="remarques")
		    public String remarque(@RequestParam("id") String id,Model model){
			Long idEleve=Long.parseLong(id);
		    List<Remarque> remarques=metier.listerRemarque(idEleve);
	        List<Eleve> eleves=metier.listerEleve(1L);
	    	model.addAttribute("eleves",eleves);
			
		
			model.addAttribute("remarques", remarques);
		
			model.addAttribute("eleves", eleves);
		
		  return "parent/remarque";
		}

	
	
	

}
