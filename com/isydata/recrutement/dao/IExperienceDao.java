package com.isydata.recrutement.dao;

import java.util.List;

import com.isydata.recrutement.entities.Experience;


public interface IExperienceDao {

	public void ajouterExperience(Experience experience);
	public void updateExperience(Experience experience);
	public List<Experience> listExperience();
	public Experience getExperienceById(int id);
	public void removeExperience(int id);
}
