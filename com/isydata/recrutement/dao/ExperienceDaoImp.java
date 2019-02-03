package com.isydata.recrutement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.isydata.recrutement.entities.Experience;


@Repository
public class ExperienceDaoImp implements IExperienceDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void ajouterExperience(Experience experience) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(experience);
		
	}

	@Override
	public void updateExperience(Experience experience) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(experience);
		
	}

	@Override
	public List<Experience> listExperience() {
		Session session = this.sessionFactory.getCurrentSession();
		String hql="select e  from Experience e";
		List<Experience> ExperienceList= session.createQuery(hql).list();
		
		return ExperienceList;
	}

	@Override
	public Experience getExperienceById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Experience experience = (Experience) session.load(Experience.class, new Integer(id));
		return experience;
	}

	@Override
	public void removeExperience(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Experience experience = (Experience) session.load(Experience.class, new Integer(id));
		if(null != experience){
			session.delete(experience);
		}
		
	}

}
