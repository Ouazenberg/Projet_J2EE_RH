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

import javax.persistence.OneToOne;

@Entity
public class Competence {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCompetence;
	private String competence;
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private CategorieCompetence categorieComp;
	
	@ManyToMany
    @JoinTable(name="cv_competence",
    joinColumns={@JoinColumn(name="idCompetence", referencedColumnName="idCompetence")},
    inverseJoinColumns={@JoinColumn(name="idCv", referencedColumnName="idCv")})
	private Collection<CV> cvs;

	public int getIdCompetence() {
		return idCompetence;
	}

	public void setIdCompetence(int idCompetence) {
		this.idCompetence = idCompetence;
	}

	public String getCompetence() {
		return competence;
	}

	public void setCompetence(String competence) {
		this.competence = competence;
	}

	public CategorieCompetence getCategorieComp() {
		return categorieComp;
	}

	public void setCategorieComp(CategorieCompetence categorieComp) {
		this.categorieComp = categorieComp;
	}

	public Collection<CV> getCvs() {
		return cvs;
	}

	public void setCvs(Collection<CV> cvs) {
		this.cvs = cvs;
	}

	public Competence(String competence, CategorieCompetence categorieComp) {
		super();
		this.competence = competence;
		this.categorieComp = categorieComp;
	}

	public Competence() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

	
	
}