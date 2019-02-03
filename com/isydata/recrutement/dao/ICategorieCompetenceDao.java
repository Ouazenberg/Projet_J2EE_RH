package com.isydata.recrutement.dao;

import java.util.List;

import com.isydata.recrutement.entities.CategorieCompetence;


public interface ICategorieCompetenceDao {
	public void ajouterCategorieCompetence(CategorieCompetence CategorieCompetence);
	public void updateCategorieCompetence(CategorieCompetence CategorieCompetence);
	public List<CategorieCompetence> listCategorieCompetence();
	public CategorieCompetence getCategorieCompetenceById(int id);
	public void removeCategorieCompetence(int id);


}
