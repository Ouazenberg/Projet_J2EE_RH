package com.isydata.recrutement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isydata.recrutement.dao.IUtilisateurDao;
import com.isydata.recrutement.entities.Login;
import com.isydata.recrutement.entities.Utilisateur;

@Service
public class UtilisateurServiceImp implements IUtilisateurService{

	@Autowired
	private IUtilisateurDao utilisateurDao;
	
	

	@Transactional
	@Override
	public void register(Utilisateur utilisateur) {
		this.utilisateurDao.register(utilisateur);
		
	}
	@Transactional
	@Override
	public Utilisateur validateUser(Login login) {
		
		return this.utilisateurDao.validateUser(login);
	}

}
