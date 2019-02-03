package com.isydata.recrutement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isydata.recrutement.dao.ICvDao;
import com.isydata.recrutement.entities.CV;

@Service
public class CvServiceImp implements ICvService {

	@Autowired
	private ICvDao cvDao;
	
	public void setCvDao(ICvDao cvDao) {
		this.cvDao = cvDao;
	}
	@Override
	@Transactional
	public void ajouterCv(CV cv) {
		this.cvDao.ajouterCv(cv);
		
	}
	@Override
	@Transactional
	public void updateCv(CV cv) {
		this.cvDao.updateCv(cv);
	}
	
	@Override
	@Transactional
	public CV getCvById(int id) {
		return this.cvDao.getCvById(id);
	}
	@Override
	@Transactional
	public void removeCv(int id) {
	this.cvDao.removeCv(id);		
	}
	@Transactional
	@Override
	public List<CV> listCv(int flag) {
		
			return this.cvDao.listCv(flag);
		
	}
	@Transactional
	@Override
	public List<CV> filtrerCv(String niveauFormation, String disponibilite, String mobilite,String siteSource) {
		// TODO Auto-generated method stub
		return this.cvDao.filtrerCv(niveauFormation, disponibilite, mobilite, siteSource);
	}
	@Transactional
	@Override
	public List<CV> recherche(String motCle) {
		
		return this.cvDao.recherche(motCle);
	}
	

}
