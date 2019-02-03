package com.isydata.recrutement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isydata.recrutement.dao.IExperienceDao;
import com.isydata.recrutement.entities.Experience;

@Service
public class ExperienceServiceImp implements IExperienceService {

	@Autowired
	private IExperienceDao experienceDao;
	
	
	public void setExperienceDao(IExperienceDao experienceDao) {
		this.experienceDao = experienceDao;
	}
	
	@Override
	@Transactional
	public void ajouterExperience(Experience experience) {
		this.experienceDao.ajouterExperience(experience);
		
	}

	@Override
	@Transactional
	public void updateExperience(Experience experience) {
		this.experienceDao.updateExperience(experience);
		
	}

	@Override
	public List<Experience> listExperience() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Experience getExperienceById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeExperience(int id) {
		// TODO Auto-generated method stub
		
	}

}
