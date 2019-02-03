package com.isydata.recrutement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.isydata.recrutement.entities.Candidat;



@Repository
public class CandidatDaoImp implements ICandidatDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	
	@Override
	public void ajouterCandidat(Candidat candidat) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(candidat);
		
	}

	@Override
	public void updateCandidat(Candidat candidat) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(candidat);
		
	}

	@Override
	public List<Candidat> listCandidat() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Candidat> candidatList = session.createQuery("select c from Candidat c").list();
		return candidatList;
	}

	@Override
	public Candidat getCandidatById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Candidat candidat = (Candidat) session.load(Candidat.class, new Integer(id));
		return candidat;
	}

	@Override
	public void removeCandidat(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Candidat candidat = (Candidat) session.load(Candidat.class, new Integer(id));
		if(null != candidat){
			session.delete(candidat);
		
	}
	}
}
