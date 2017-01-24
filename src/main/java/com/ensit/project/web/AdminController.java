package com.ensit.project.web;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ensit.project.entites.Classe;
import com.ensit.project.entites.Eleve;
import com.ensit.project.entites.EleveParent;
import com.ensit.project.entites.Enseignant;
import com.ensit.project.entites.Matiere;
import com.ensit.project.form.FormAjoutNote;
import com.ensit.project.form.formEnsiegnant;
import com.ensit.project.metier.IAdminMetier;



@Controller
@RequestMapping(value="/admin")
public class AdminController {
	@Autowired
	private IAdminMetier metier;

	public IAdminMetier getMetier() {
		return metier;
	}

	public void setMetier(IAdminMetier metier) {
		this.metier = metier;
	}
	
	@RequestMapping(value="enseignants")
	public String listerEnseignant(Model model){
	  List<Enseignant> enseignants=metier.listerEnseignants();
	  model.addAttribute("enseignants",enseignants);
	  return "enseignant";
	}
	@RequestMapping(value="/enseignant/add")
	public String ajouterEnseignant(Model model){
	  Enseignant enseignant=new Enseignant();
	  ArrayList<Classe> classes=(ArrayList<Classe>) metier.listerClasses();
	  model.addAttribute("enseignant",enseignant);
	  model.addAttribute("classes",classes);
	  return "enseignantAdd";
	}
	 @RequestMapping(value ="/enseignant/add", method = RequestMethod.POST)
	    public String enseignantAddPost(@Valid @ModelAttribute("enseignant") Enseignant enseignant, BindingResult result){

	    /*    if (result.hasErrors()) {

	            return "classAdmin";
	        }*/
		Enseignant ens= metier.addEnseignant(enseignant);
	
       
	    
	 

	        return "redirect:/admin/enseignant/classe?id="+ens.getId();
	    }
	 @RequestMapping(value ="/enseignant/gestion", method = RequestMethod.POST)
	    public String enseignantAddPost(@Valid @ModelAttribute("form") formEnsiegnant form, BindingResult result){

	           
              metier.addEnseignantToClasse(form.getIdEnsiegnant(),form.getIdClasse());

	      metier.addMatierToEnsiegnat(form.getIdEnsiegnant(),form.getIdMatiere());
    
	    
	 

	        return "redirect:/admin/enseignant/classe?id="+form.getIdEnsiegnant();
	    }
	
	  @RequestMapping(value ="/enseignant/classe")
	    public String adminEns(@RequestParam("id") String id, Model model)
	    {      
		      Enseignant enseignant= metier.geEnseignant(Long.parseLong(id));
	           List<Matiere> matieres=metier.matieres();
	           List<Classe> classes=metier.listerClasses();
	           formEnsiegnant form=new formEnsiegnant();
	           model.addAttribute("matieres",matieres);
	     	  model.addAttribute("classes",classes);
	     	  model.addAttribute("form", form);
	     	 model.addAttribute("enseignant", enseignant);
		     	
	     	
	     	 

	        return "ensAdmin";
	    }
	
	
	@RequestMapping(value="/parents")
	public String listerParents(Model model){
	  List<EleveParent> parents=metier.listerEleveParents();
	  model.addAttribute("parents",parents);
	  return "parentAdmin";
	}
	@RequestMapping(value="/parent/add")
	public String ajouterParents(Model model){
		EleveParent parent=new EleveParent();
        model.addAttribute("parent",parent);

	
	  return "parentAdd";
	}
	
	 @RequestMapping(value ="/parent/add", method = RequestMethod.POST)
	    public String studentAddPost(@Valid @ModelAttribute("parent") EleveParent parent, BindingResult result){

                 metier.ajouterParents(parent);
	    
	 

	        return "redirect:/admin/parents";
	    }
	@RequestMapping(value="/classes")
	public String listerClasses(Model model){
		  List<Classe> classes=metier.listerClasses();
		  model.addAttribute("classes",classes);
		  return "classAdmin";
		}
	@RequestMapping(value="/classe/add")
	public String ajouterClasse(Model model){
		 Classe classe=new Classe();
		  model.addAttribute("classe",classe);
		  return "classeAdd";
		}
	 @RequestMapping(value ="/classe/add", method = RequestMethod.POST)
	    public String ajouterClasse(@Valid @ModelAttribute("parent") Classe classe , BindingResult result){

                metier.ajouterClasse(classe);
	    
	 

	        return "redirect:/admin/classes";
	    }
	
	
	 @RequestMapping(value="/eleve/add")
	    public String studentAdd(Model model){
	        List<EleveParent> parents ;

	        parents=metier.listerEleveParents();

	        Eleve eleve =new Eleve();
	        ArrayList<Classe> classes=(ArrayList<Classe>) metier.listerClasses();

	        model.addAttribute("eleve",eleve);
	        model.addAttribute("parents",parents);
	        model.addAttribute("classes",classes);
	        return "studentAdd";
	    }
	  @RequestMapping(value ="/eleve/add", method = RequestMethod.POST)
	    public String studentAddPost(@Valid @ModelAttribute("student") Eleve student, BindingResult result){

	       metier.ajouterEleve(student, student.getClassse().getIdClasse(), student.getEleveParent().getId());
	    

	        return "redirect:/admin/eleve/add";
	    }
	  
	  @RequestMapping(value ="/classe/eleves")
	    public String parentEdit(@RequestParam("id") String id, Model model)
	    {
	        Long idClasse=Long.parseLong(id);
	        ArrayList<Eleve> eleves=(ArrayList<Eleve>) metier.listerEleveParclasse(idClasse);

	        model.addAttribute("eleves",eleves);

	        return "studentAdmin";
	    }
	  @RequestMapping(value="/matieres")
	    public String ListerMatiere(Model model){
               List<Matiere> matieres=metier.matieres();

	        model.addAttribute("matieres",matieres);
	   
	        return "mteiresAdmin";
	    }

	  @RequestMapping(value="/matiere/add")
	    public String ajouterMatiere(Model model){
              Matiere matiere=new Matiere();

	        model.addAttribute("matiere",matiere);
	   
	        return "matiereAdd";
	    }

@RequestMapping(value ="/matiere/add", method = RequestMethod.POST)
public String ajouterClasse(@Valid @ModelAttribute("matiere") Matiere matiere , BindingResult result){

       metier.ajouterMatiere(matiere);


    return "redirect:/admin/matieres";
}

@RequestMapping(value ="/eleves")
public String EleveParent(@RequestParam("id") String id, Model model)
{       Long idParent=Long.parseLong(id);
	List<Eleve> eleves=metier.listerEleve(idParent);

    model.addAttribute("eleves",eleves);

    return "studentAdmin";
}
	

}
