package com.isydata.recrutement.dao;

import java.util.List;


import com.isydata.recrutement.entities.Competence;

public interface ICompetenceDao {

	public void ajouterCompetence(Competence competence);
	public void updateCompetence(Competence competence);
	public List<Competence> listCompetence();
	public Competence getCompetenceById(int id);
	public void removeCompetence(int id);

}
