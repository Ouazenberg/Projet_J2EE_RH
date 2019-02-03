package com.isydata.recrutement.dao;

import java.util.List;

import com.isydata.recrutement.entities.Candidat;

public interface ICandidatDao {
	public void ajouterCandidat(Candidat candidat);
	public void updateCandidat(Candidat candidat);
	public List<Candidat> listCandidat();
	public Candidat getCandidatById(int id);
	public void removeCandidat(int id);

}
