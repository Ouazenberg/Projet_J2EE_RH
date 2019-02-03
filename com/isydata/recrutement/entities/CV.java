package com.isydata.recrutement.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;


@Entity
public class CV {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCv;
	private String titreIsyData;
	private String titreCandidat;
	private String siteSource;
	private String etat;
	private int flag;
	private String observation;
	private boolean entretien; 

	
	@ManyToOne
	@JoinColumn(name="idCandidat")
	private Candidat candidat;
	

	@ManyToMany
    @JoinTable(name="cv_experience",
    joinColumns={@JoinColumn(name="idCv", referencedColumnName="idCv")},
    inverseJoinColumns={@JoinColumn(name="idExperience", referencedColumnName="idExperience")})
	private Collection<Experience> experiences;

	@ManyToMany
    @JoinTable(name="cv_competence",
    joinColumns={@JoinColumn(name="idCv", referencedColumnName="idCv")},
    inverseJoinColumns={@JoinColumn(name="idCompetence", referencedColumnName="idCompetence")})
	private Collection<Competence> competences;

	public CV() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public CV(String titreIsyData, String titreCandidat, String siteSource, int flag, String observation,
			boolean entretien, String etat,Candidat candidat, Collection<Experience> experiences,
			Collection<Competence> competences) {
		super();
		this.titreIsyData = titreIsyData;
		this.titreCandidat = titreCandidat;
		this.siteSource = siteSource;
		this.flag = flag;
		this.observation = observation;
		this.entretien = entretien;
		this.etat = etat;
		this.candidat = candidat;
		this.experiences = experiences;
		this.competences = competences;
	}



	public int getIdCv() {
		return idCv;
	}

	public void setIdCv(int idCv) {
		this.idCv = idCv;
	}

	public String getTitreIsyData() {
		return titreIsyData;
	}

	public void setTitreIsyData(String titreIsyData) {
		this.titreIsyData = titreIsyData;
	}

	public String getEtat() {
		return etat;
	}




	public void setEtat(String etat) {
		this.etat = etat;
	}




	public String getTitreCandidat() {
		return titreCandidat;
	}

	public void setTitreCandidat(String titreCandidat) {
		this.titreCandidat = titreCandidat;
	}

	public String getSiteSource() {
		return siteSource;
	}

	public void setSiteSource(String siteSource) {
		this.siteSource = siteSource;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public boolean isEntretien() {
		return entretien;
	}

	public void setEntretien(boolean entretien) {
		this.entretien = entretien;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public Collection<Experience> getExperiences() {
		return experiences;
	}

	public void setExperiences(Collection<Experience> experiences) {
		this.experiences = experiences;
	}

	public Collection<Competence> getCompetences() {
		return competences;
	}

	public void setCompetences(Collection<Competence> competences) {
		this.competences = competences;
	}
	
			
}
