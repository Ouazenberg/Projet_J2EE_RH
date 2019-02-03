package com.isydata.recrutement.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.persister.entity.Queryable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.isydata.recrutement.entities.CV;


@Repository
public class CvDaoImp implements ICvDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	@Override
	public void ajouterCv(CV cv) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(cv);
	}

	@Override
	public void updateCv(CV cv) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(cv);
		
	}

	@Override
	public List<CV> listCv(int flag) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql="select c  from CV c where flag=?";
		
		List<CV> CvList= session.createQuery(hql).setParameter(0, flag).list();
		
		return CvList;
	}

	@Override
	public CV getCvById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql="select c  from CV c where idCv=?";
		
		List<CV> Cv= session.createQuery(hql).setParameter(0, id).list();
		
		return Cv.get(0);
		 
	}

	@Override
	public void removeCv(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		CV cv = (CV) session.load(CV.class, new Integer (id));
		if(null != cv) {
			session.delete(cv);
		}
		
	}
	@Override
	public List<CV> filtrerCv(String niveauFormation, String disponibilite, String mobilite, String siteSource) {
		
		Session session = this.sessionFactory.getCurrentSession();
		String hql="select c  from CV c where"
				+ " c.candidat.niveauFormation like ? "
				+ "and c.candidat.disponibilite like ? "
				+ "and c.candidat.mobilite like ? "
				+ "and c.siteSource like ? ";
		
		org.hibernate.Query query= session.createQuery(hql);
		query.setParameter(0, "%"+niveauFormation+"%");
		query.setParameter(1, "%"+disponibilite+"%");
		query.setParameter(2, "%"+mobilite+"%");
		query.setParameter(3, "%"+siteSource+"%");
		
		List<CV> listCv= query.list();
		
		return listCv;
	}
	@Override
	public List<CV> recherche(String motCle) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql= "select c from CV c where c.titreIsyData like :x "
				+ "or cv.titreCandidat like :x"
				+ "or cv.siteSource like :x"
				+ "or cv.observation like :x"
				+ "or cv.entretien like :x"
				+ "or cv.candidat like :x";
		org.hibernate.Query query= session.createQuery(hql);
		query.setParameter("x", "%"+motCle+"%"); 
		List<CV> listCv =query.list();
		return listCv; 
	}

}
