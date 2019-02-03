package com.isydata.recrutement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isydata.recrutement.dao.ICandidatDao;
import com.isydata.recrutement.entities.Candidat;
@Service
public class CandidatServiceImp implements ICandidatService{

	@Autowired
	private ICandidatDao candidatDao;
	

	public void setCandidatDao(ICandidatDao candidatDao) {
		this.candidatDao = candidatDao;
	}
	@Transactional
	@Override
	public void ajouterCandidat(Candidat candidat) {
		this.candidatDao.ajouterCandidat(candidat);
	}
	@Transactional
	@Override
	public void updateCandidat(Candidat candidat) {
		this.candidatDao.updateCandidat(candidat);
		
	}
	@Transactional
	@Override
	public List<Candidat> listCandidat() {
		
		return this.candidatDao.listCandidat();
	}
	@Transactional
	@Override
	public Candidat getCandidatById(int id) {
		
		return this.candidatDao.getCandidatById(id);
	}
	@Transactional
	@Override
	public void removeCandidat(int id) {
		
		this.candidatDao.removeCandidat(id);
	}

}
