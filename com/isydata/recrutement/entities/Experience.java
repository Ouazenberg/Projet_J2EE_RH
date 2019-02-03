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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Experience {

	

	
	
	
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idExperience;
	private String nomEntreprise;
	private String dureeMission;
	private String description ;
	
	
	@ManyToMany
    @JoinTable(name="cv_experience",
    joinColumns={@JoinColumn(name="idExperience", referencedColumnName="idExperience")},
    inverseJoinColumns={@JoinColumn(name="idCv", referencedColumnName="idCv")})
	private Collection<CV> cvs;


	public Experience() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	public Experience(String nomEntreprise, String dureeMission, String description) {
		super();
		this.nomEntreprise = nomEntreprise;
		this.dureeMission = dureeMission;
		this.description = description;
	}





	public int getIdExperience() {
		return idExperience;
	}


	public void setIdExperience(int idExperience) {
		this.idExperience = idExperience;
	}


	public String getNomEntreprise() {
		return nomEntreprise;
	}


	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}


	public String getDureeMission() {
		return dureeMission;
	}


	public void setDureeMission(String dureeMission) {
		this.dureeMission = dureeMission;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	

	
	public Collection<CV> getCvs() {
		return cvs;
	}


	public void setCvs(Collection<CV> cvs) {
		this.cvs = cvs;
	}


	
	
}
