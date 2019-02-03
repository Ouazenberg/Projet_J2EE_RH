package com.isydata.recrutement;



import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.isydata.recrutement.entities.Adresse;
import com.isydata.recrutement.entities.CV;
import com.isydata.recrutement.entities.Candidat;
import com.isydata.recrutement.entities.CategorieCompetence;
import com.isydata.recrutement.entities.Competence;
import com.isydata.recrutement.entities.Experience;
import com.isydata.recrutement.entities.Filtrer;
import com.isydata.recrutement.services.IAdresseService;
import com.isydata.recrutement.services.ICandidatService;
import com.isydata.recrutement.services.ICategorieCompetenceService;
import com.isydata.recrutement.services.ICompetenceService;
import com.isydata.recrutement.services.ICvService;
import com.isydata.recrutement.services.IExperienceService;

import Utlis.CvExcel;
import Utlis.CvPdf;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	

	
	@Autowired
	private IAdresseService adresseService;
	@Autowired
	private ICandidatService candidatService;
	@Autowired
	private ICategorieCompetenceService categorieService;
    @Autowired
	private ICompetenceService comptenceService;
	@Autowired
	private ICvService cvService;
	@Autowired
	private IExperienceService experienceService;
	
	Filtrer filter=new Filtrer();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		//déclarer les adresses
		Adresse add1 = new Adresse("51", "Boulevard Foch", "93800", "Epinay sur seine");
		Adresse add2 = new Adresse("52", "Boulevard Foch", "93800", "Epinay sur seine");
		Adresse add3 = new Adresse("53", "Boulevard Foch", "93800", "Epinay sur seine");
		Adresse add4 = new Adresse("53", "Boulevard Foch", "93800", "Epinay sur seine");
		
	    adresseService.ajouterAdresse(add1);
    	adresseService.ajouterAdresse(add2);
	    adresseService.ajouterAdresse(add3);
    	adresseService.ajouterAdresse(add4);
		
//déclarer les candidats
    	
	    Candidat cand1= new Candidat("arkoub","syfax", "1111111", "as@gmail.com","BAC+4", "immediat", "national", "oui", add1);
		Candidat cand2= new Candidat("ouazene", "ferhat", "2222222", "of@gmail.com","BAC+4", "dans 3 mois", "international", "oui", add2);
		Candidat cand3= new Candidat("menasri", "said", "3333333", "ms@gmail.com","BAC+5", "dans 6mois", "international", "oui", add3);
		Candidat cand4= new Candidat("messaoudene", "mounir", "4444444", "mm@gmail.com","BAC+5", "immediat", "national", "oui", add4);
		
		candidatService.ajouterCandidat(cand1);
		candidatService.ajouterCandidat(cand2);
		candidatService.ajouterCandidat(cand3);
		candidatService.ajouterCandidat(cand4);
		
//déclarer les catégories
		CategorieCompetence cat1= new CategorieCompetence("Informatique");
		CategorieCompetence cat2= new CategorieCompetence("Methodes");
		CategorieCompetence cat3= new CategorieCompetence("Langues");
		CategorieCompetence cat4= new CategorieCompetence("Base de donnees");
		CategorieCompetence cat5= new CategorieCompetence("Environnements");
		CategorieCompetence cat6= new CategorieCompetence("IDE");
		
		
		categorieService.ajouterCategoieCompetence(cat1);
		categorieService.ajouterCategoieCompetence(cat2);
		categorieService.ajouterCategoieCompetence(cat3);
		categorieService.ajouterCategoieCompetence(cat4);
		categorieService.ajouterCategoieCompetence(cat5);
		categorieService.ajouterCategoieCompetence(cat6);
		
 //déclarer les compétences
		
		Competence comp1= new Competence("java", cat1);
		Competence comp2= new Competence("XML", cat1);
		Competence comp3= new Competence("UML", cat2);
		Competence comp4= new Competence("merise", cat2);
		Competence comp5= new Competence("anglais", cat3);
		Competence comp6= new Competence("espagnol", cat3);
		Competence comp7= new Competence("MySql", cat4);
		Competence comp8= new Competence("oracle", cat4);
		Competence comp9= new Competence("linux", cat5);
		Competence comp10= new Competence("windows", cat5);
		Competence comp11= new Competence("eclipse", cat6);
		Competence comp12= new Competence("android studio", cat6);
		
		
		comptenceService.ajouterCompetence(comp1);
		comptenceService.ajouterCompetence(comp2);
		comptenceService.ajouterCompetence(comp3);
		comptenceService.ajouterCompetence(comp4);
		comptenceService.ajouterCompetence(comp5);
		comptenceService.ajouterCompetence(comp6);
		comptenceService.ajouterCompetence(comp7);
		comptenceService.ajouterCompetence(comp8);
		comptenceService.ajouterCompetence(comp9);
		comptenceService.ajouterCompetence(comp10);
		comptenceService.ajouterCompetence(comp11);
		comptenceService.ajouterCompetence(comp12);

	//déclarer les experiences
		Experience exp1= new Experience("isydata", "12 mois", "developement application colad ");
		Experience exp2= new Experience("orange", "12 mois", "chef de projet junior");
		Experience exp3= new Experience("sfr", "3 mois", "stage pratique");
		Experience exp4= new Experience("bouygues", "5 mois", "stage pratique");
		Experience exp5= new Experience("monoprix", "18 mois", "mettre en place un systeme automatisé pour vendre des produits");
		Experience exp6= new Experience("total", "6 mois", "chargé évémentiel et marketing");
		
		experienceService.ajouterExperience(exp1);
		experienceService.ajouterExperience(exp2);
		experienceService.ajouterExperience(exp3);
		experienceService.ajouterExperience(exp4);
		experienceService.ajouterExperience(exp5);
		experienceService.ajouterExperience(exp6);
		
		
		
	ArrayList<Experience> a = new ArrayList<Experience>();
	a.add(exp1); a.add(exp3);
	ArrayList<Experience> b = new ArrayList<Experience>();
	b.add(exp3); b.add(exp2);
	ArrayList<Experience> c = new ArrayList<Experience>();
	c.add(exp4); c.add(exp5);
	ArrayList<Experience> d = new ArrayList<Experience>();
	d.add(exp6);
	
	ArrayList<Competence> c1 = new ArrayList<Competence>();
	c1.add(comp1); c1.add(comp2);c1.add(comp5);c1.add(comp7);c1.add(comp8);c1.add(comp9);
	
	ArrayList<Competence> c2 = new ArrayList<Competence>();
	c2.add(comp1); c2.add(comp2);c2.add(comp5);c2.add(comp6);c2.add(comp7);c2.add(comp10);
	
	ArrayList<Competence> c3 = new ArrayList<Competence>();
	c3.add(comp10); c3.add(comp2);c3.add(comp5);c3.add(comp7);c3.add(comp8);c3.add(comp12);c3.add(comp11);
	
	ArrayList<Competence> c4 = new ArrayList<Competence>();
	c4.add(comp4); c4.add(comp2);c4.add(comp5);c4.add(comp3);c4.add(comp8);c4.add(comp12);

	//ajouter les CVs
		CV cv1= new CV("sar", "ingénieur", "indeed", 1, "non consulté", false, "nouv", cand1, a, c1);
		
		CV cv2= new CV("fro", "ingénieur", "indeed", 1, "non consulté", false, "nouv", cand2, b, c2);
	    CV cv3= new CV("sme", "ingénieur", "linkedin", 1, "non consulté", false, "nouv", cand3, c, c3);
		CV cv4= new CV("mme", "ingénieur", "monster", 1, "non consulté", false, "nouv", cand4, d, c4);
	
	cvService.ajouterCv(cv1);
	cvService.ajouterCv(cv2);
	cvService.ajouterCv(cv3);
	cvService.ajouterCv(cv4);
	
	model.addAttribute("listcv", this.cvService.listCv(1));
	model.addAttribute("listcvfavoris", this.cvService.listCv(2));
	model.addAttribute("listCvarchives", this.cvService.listCv(3));
	model.addAttribute("filt", new Filtrer());
	
		return "home2";
	}
	
	@RequestMapping("/CV/removeCv/{id}")
    public String removeCV(@PathVariable("id") int id){
        this.cvService.removeCv(id);;
        return "redirect:/";
    }
	
	@RequestMapping("/CV/favoris/{id}")
    public String favoris(@PathVariable("id") int id){
        CV cv = cvService.getCvById(id);
        
       cv.setFlag(2);
       this.cvService.updateCv(cv);
        return "redirect:/";
    }
	@RequestMapping("/CV/archive/{id}")
    public String archive(@PathVariable("id") int id){
        CV cv = cvService.getCvById(id);
        
       cv.setFlag(3);
       this.cvService.updateCv(cv);
        return "redirect:/";
    }
	@RequestMapping("/CV/cvHome/{id}")
    public String cvHome(@PathVariable("id") int id){
        CV cv = cvService.getCvById(id);
       cv.setFlag(1);
       this.cvService.updateCv(cv);
        return "redirect:/";
    }
	
	@RequestMapping(value= "/CV/filter", method = RequestMethod.POST)
	public String addReservBun(@ModelAttribute("filt") Filtrer filt, Model model){
		System.out.println(filt.getSiteSource());
		
		List<CV> cvs = this.cvService.filtrerCv(filt.getNiveauFormation(), filt.getDisponibilite(), filt.getMobilite(), filt.getSiteSource());
		model.addAttribute("listcv", cvs);		
		
		return "home2";
	}
	
	@RequestMapping("/Cv/details/{id}")
    public String CvDetails(@PathVariable("id") int id,Model model){

		CV cvv=this.cvService.getCvById(id);
		cvv.setEtat("consulté");
		this.cvService.updateCv(cvv);
		model.addAttribute("cv", this.cvService.getCvById(id));
      
        return "details";
    }
	
	@RequestMapping("/Cv/report/{id}")
    public ModelAndView cvListReport(HttpServletRequest req, HttpServletResponse res) {
        String typeReport=req.getParameter("type");
   
       
        if (typeReport !=null && typeReport.equals("xls")) {
            return new ModelAndView(new CvExcel(), "xlsList",  this.cvService.listCv(1));

        }else if (typeReport !=null && typeReport.equals("pdf")) {
            return new ModelAndView(new CvPdf(), "cvList",  this.cvService.getCvById(1));

        }

      return new ModelAndView("cvListReport", "cvList",  null);
   
    }
	
	@RequestMapping(value = "/Cv/ajouterCV", method = RequestMethod.GET)
	public String home(Model model) {
		return "ajouterCV";
		}
	
}