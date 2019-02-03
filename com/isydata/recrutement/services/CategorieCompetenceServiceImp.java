package com.isydata.recrutement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isydata.recrutement.dao.ICategorieCompetenceDao;
import com.isydata.recrutement.entities.CategorieCompetence;

@Service
public class CategorieCompetenceServiceImp implements ICategorieCompetenceService{

	@Autowired
	private ICategorieCompetenceDao categorieDao;
	

	@Transactional
	@Override
	public void ajouterCategoieCompetence(CategorieCompetence CategorieCompetence) {
		this.categorieDao.ajouterCategorieCompetence(CategorieCompetence);
		
	}

	@Transactional
	@Override
	public void updateCategorieCompetence(CategorieCompetence CategorieCompetence) {
	this.categorieDao.updateCategorieCompetence(CategorieCompetence);
		
	}

	@Transactional
	@Override
	public List<CategorieCompetence> listCategorieCompetence() {
		
		return this.categorieDao.listCategorieCompetence();
	}

	@Transactional
	@Override
	public CategorieCompetence getCategorieCompetenceById(int id) {
		
		return this.categorieDao.getCategorieCompetenceById(id);
	}

	@Transactional
	@Override
	public void removeCategorieCompetence(int id) {
		this.categorieDao.removeCategorieCompetence(id);
		
	}

}
