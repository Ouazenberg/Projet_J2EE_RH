package com.isydata.recrutement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IdUtilisateur;
	private String nomUtilisateur;
	private String email;
	private String password;
	
	public Utilisateur(String nomUtilisateur, String email, String password) {
		super();
		
		this.nomUtilisateur = nomUtilisateur;
		this.email = email;
		this.password = password;
	}

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdUtilisateur() {
		return IdUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		IdUtilisateur = idUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
