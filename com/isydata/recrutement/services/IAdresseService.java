package com.isydata.recrutement.services;
import java.util.List;

import com.isydata.recrutement.entities.Adresse;
public interface IAdresseService {

	public void ajouterAdresse(Adresse adr);
	public void updateAdresse(Adresse adr);
	public List<Adresse> listAdresse();
	public Adresse getAdresseById(int id);
	public void removeAdresse(int id);

}
