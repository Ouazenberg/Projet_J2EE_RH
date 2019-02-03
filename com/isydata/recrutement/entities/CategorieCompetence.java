package com.isydata.recrutement.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CategorieCompetence {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCategorie;
	private String nomCategorie;
	
	@OneToMany(mappedBy="categorieComp")
	private Collection<Competence> competences;

	public CategorieCompetence() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public CategorieCompetence(String nomCategorie) {
		super();
		this.nomCategorie = nomCategorie;
		
	}


	public int getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public Collection<Competence> getCompetences() {
		return competences;
	}

	public void setCompetences(Collection<Competence> competences) {
		this.competences = competences;
	}
	
	
	
	
	

}
