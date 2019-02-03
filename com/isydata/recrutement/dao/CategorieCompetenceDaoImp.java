package com.isydata.recrutement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.isydata.recrutement.entities.Candidat;
import com.isydata.recrutement.entities.CategorieCompetence;

@Repository
public class CategorieCompetenceDaoImp implements ICategorieCompetenceDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	

	@Override
	public void ajouterCategorieCompetence(CategorieCompetence CategorieCompetence) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(CategorieCompetence);
		
	}

	@Override
	public void updateCategorieCompetence(CategorieCompetence CategorieCompetence) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(CategorieCompetence);
		
	}

	@Override
	public List<CategorieCompetence> listCategorieCompetence() {
		Session session = this.sessionFactory.getCurrentSession();
		List<CategorieCompetence> categorieList = session.createQuery("select c from CategorieCompetence c").list();
		return categorieList;
	}

	@Override
	public CategorieCompetence getCategorieCompetenceById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		CategorieCompetence categorieCompetence = (CategorieCompetence) session.load(CategorieCompetence.class, new Integer(id));
		return categorieCompetence;
	}

	@Override
	public void removeCategorieCompetence(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		CategorieCompetence categorieCompetence = (CategorieCompetence) session.load(CategorieCompetence.class, new Integer(id));
		if(null != categorieCompetence){
			session.delete(categorieCompetence);
		
	}
		
	}

}
