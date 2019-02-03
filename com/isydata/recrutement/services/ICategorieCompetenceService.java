package com.isydata.recrutement.services;

import java.util.List;

import com.isydata.recrutement.entities.CategorieCompetence;

public interface ICategorieCompetenceService {
	public void ajouterCategoieCompetence(CategorieCompetence CategorieCompetence);
	public void updateCategorieCompetence(CategorieCompetence CategorieCompetence);
	public List<CategorieCompetence> listCategorieCompetence();
	public CategorieCompetence getCategorieCompetenceById(int id);
	public void removeCategorieCompetence(int id);


}
