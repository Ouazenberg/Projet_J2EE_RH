package com.isydata.recrutement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.isydata.recrutement.entities.CV;
import com.isydata.recrutement.entities.Login;
import com.isydata.recrutement.entities.Utilisateur;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;


@Repository
public class UtilisateurDaoImp implements IUtilisateurDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	


	  @Autowired

	  DataSource datasource;


	  public void register(Utilisateur utilisateur) {

		  Session session = this.sessionFactory.getCurrentSession();
			session.persist(utilisateur);
	    }

	    public Utilisateur validateUser(Login login) {

	    	 Session session = this.sessionFactory.getCurrentSession();
	    	String sql = "select * from Utilisateur where nomUtilisateur='" + login.getNomUtilisateur() + ""
	    		+ "' and password='" + login.getPassword() + "'";

	   
		
		
		List<Utilisateur> utilisateurs= session.createQuery(sql).list();
		
	    return utilisateurs.size() > 0 ? utilisateurs.get(0) : null;

	    }

	  }

	  class UserMapper implements RowMapper<Utilisateur> {

	  public Utilisateur mapRow(ResultSet rs, int arg1) throws SQLException {

	    Utilisateur utilisateur = new Utilisateur();

	    utilisateur.setNomUtilisateur(rs.getString("nomUtilisateur"));

	    utilisateur.setEmail(rs.getString("email"));
	    utilisateur.setPassword(rs.getString("password"));

	 	    return utilisateur;

	  }

	}