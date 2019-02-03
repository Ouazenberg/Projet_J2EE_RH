
package com.isydata.recrutement.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;





@Entity
public class Adresse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IdAdress ;
	
	
	
	

	private String numRue;
	private String nomRue;
	private String codePostale;
	private String ville;
	
	@OneToMany (mappedBy ="adresse")
	private Collection <Candidat> candidats;

	public int getIdAdress() {
		return IdAdress;
	}

	public void setIdAdress(int idAdress) {
		IdAdress = idAdress;
	}

	public String getNumRue() {
		return numRue;
	}

	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Collection<Candidat> getCandidats() {
		return candidats;
	}

	public void setCandidats(Collection<Candidat> candidats) {
		this.candidats = candidats;
	}

	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adresse(String numRue, String nomRue, String codePostale, String ville) {
		super();
		this.numRue = numRue;
		this.nomRue = nomRue;
		this.codePostale = codePostale;
		this.ville = ville;
	}

	
	
	

}
