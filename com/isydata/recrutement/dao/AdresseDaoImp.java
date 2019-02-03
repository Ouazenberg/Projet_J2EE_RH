package com.isydata.recrutement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.Query;


import com.isydata.recrutement.entities.Adresse;

@Repository
public class AdresseDaoImp implements IAdresseDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
		
	@Override
	public void ajouterAdresse(Adresse adresse) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(adresse);
	}

	@Override
	public void updateAdresse(Adresse adresse) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(adresse);
		
	}

	@Override
	public List<Adresse> listAdresse() {
		Session session = this.sessionFactory.getCurrentSession();
		String hql="select a  from Adresse a";
		List<Adresse> adresseList= session.createQuery(hql).list();
		
		return adresseList;
	
	}

	@Override
	public Adresse getAdresseById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Adresse adresse = (Adresse) session.load(Adresse.class, new Integer(id));
		return adresse;
	}

	@Override
	public void removeAdresse(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Adresse adresse = (Adresse) session.load(Adresse.class, new Integer(id));
		if(null != adresse){
			session.delete(adresse);
		}
	}
}


