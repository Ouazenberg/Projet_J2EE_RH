package com.isydata.recrutement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isydata.recrutement.dao.IAdresseDao;
import com.isydata.recrutement.entities.Adresse;
@Service
public class AdresseServiceImp implements IAdresseService {

	@Autowired
	private IAdresseDao adresseDao;
	
	
	public void setAdresseDao(IAdresseDao adresseDao) {
		this.adresseDao = adresseDao;
	}
	
	
	@Override
	@Transactional
	public void ajouterAdresse(Adresse adr) {
		this.adresseDao.ajouterAdresse(adr);
		
	}
	
	@Override
	@Transactional
	public void updateAdresse(Adresse adr) {
		this.adresseDao.updateAdresse(adr);
		
	}
	
	@Override
	@Transactional
	public List<Adresse> listAdresse() {
		
		return this.adresseDao.listAdresse();
	}
	
	@Override
	@Transactional
	public Adresse getAdresseById(int id) {
		
		return this.adresseDao.getAdresseById(id);
	}

	@Override
	@Transactional
	public void removeAdresse(int id) {
		this.adresseDao.removeAdresse(id);
		
	}

}
