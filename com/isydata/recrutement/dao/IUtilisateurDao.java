package com.isydata.recrutement.dao;

import java.util.List;

import com.isydata.recrutement.entities.Login;
import com.isydata.recrutement.entities.Utilisateur;



public interface IUtilisateurDao {
	  void register(Utilisateur utilisateur);

	  Utilisateur validateUser(Login login);
}
