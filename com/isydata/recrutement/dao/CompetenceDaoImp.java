package com.isydata.recrutement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.isydata.recrutement.entities.Competence;

@Repository
public class CompetenceDaoImp implements ICompetenceDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void ajouterCompetence(Competence competence) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(competence);
	}

	@Override
	public void updateCompetence(Competence competence) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(competence);
	}

	@Override
	public List<Competence> listCompetence() {
		Session session = this.sessionFactory.getCurrentSession();
		String hql="select p  from Competence p";
		List<Competence> CompetenceList= session.createQuery(hql).list();
		
		return CompetenceList;
	}

	@Override
	public Competence getCompetenceById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Competence competence = (Competence) session.load(Competence.class, new Integer(id));
		return competence;
	}

	@Override
	public void removeCompetence(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Competence competence = (Competence) session.load(Competence.class, new Integer (id));
		if(null != competence) {
			session.delete(competence);
		}
		
	}

}
