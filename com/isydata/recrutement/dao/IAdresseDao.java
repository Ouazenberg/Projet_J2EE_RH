package com.isydata.recrutement.dao;

import java.util.List;

import com.isydata.recrutement.entities.Adresse;


public interface IAdresseDao {
	public void ajouterAdresse(Adresse adresse);
	public void updateAdresse(Adresse adresse);
	public List<Adresse> listAdresse();
	public Adresse getAdresseById(int id);
	public void removeAdresse(int id);

}
