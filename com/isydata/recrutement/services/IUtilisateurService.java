package com.isydata.recrutement.services;
import java.util.List;

import com.isydata.recrutement.entities.Login;
import com.isydata.recrutement.entities.Utilisateur;

public interface IUtilisateurService {
	  void register(Utilisateur utilisateur);

	  Utilisateur validateUser(Login login);
	
}
