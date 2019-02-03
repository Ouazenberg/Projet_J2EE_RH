package com.isydata.recrutement.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Candidat {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCandidat;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private String niveauFormation;
	private String disponibilite;
	private String mobilite;
	private String permis;
	
	@ManyToOne
	@JoinColumn(name="idAdress")
	private Adresse adresse;
	
	@OneToMany (mappedBy ="candidat" )
	private Collection <CV> cvs;

	public Candidat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candidat(String nom, String prenom, String tel, String email,String niveauFormation, String disponibilite, String mobilite,
			String permis, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.niveauFormation = niveauFormation;
		this.disponibilite = disponibilite;
		this.mobilite = mobilite;
		this.permis = permis;
		this.adresse = adresse;
	}

	
	public String getNiveauFormation() {
		return niveauFormation;
	}

	public void setNiveauFormation(String niveauFormation) {
		this.niveauFormation = niveauFormation;
	}

	public int getIdCandidat() {
		return idCandidat;
	}

	public void setIdCandidat(int idCandidat) {
		this.idCandidat = idCandidat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(String disponibilite) {
		this.disponibilite = disponibilite;
	}

	public String getMobilite() {
		return mobilite;
	}

	public void setMobilite(String mobilite) {
		this.mobilite = mobilite;
	}

	public String getPermis() {
		return permis;
	}

	public void setPermis(String permis) {
		this.permis = permis;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Collection<CV> getCvs() {
		return cvs;
	}

	public void setCvs(Collection<CV> cvs) {
		this.cvs = cvs;
	}


}