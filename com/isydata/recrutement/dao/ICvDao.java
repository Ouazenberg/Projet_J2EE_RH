package com.isydata.recrutement.dao;

import java.util.List;

import com.isydata.recrutement.entities.CV;


public interface ICvDao {

	public void ajouterCv(CV cv);
	public void updateCv(CV cv);
	public List<CV> listCv(int flag);
	public List<CV> filtrerCv(String niveauFormation, String disponibilite, String mobilite, String siteSource);
	public List<CV> recherche(String motCle);
	public CV getCvById(int id);
	public void removeCv(int id);

}
