package com.isydata.recrutement.entities;

public class Filtrer {
private String niveauFormation;
private String disponibilite;
private String mobilite;
private String siteSource;

public String getNiveauFormation() {
	return niveauFormation;
}
public void setNiveauFormation(String niveauFormation) {
	this.niveauFormation = niveauFormation;
}
public String getDisponibilite() {
	return disponibilite;
}
public void setDisponibilite(String disponibilite) {
	this.disponibilite = disponibilite;
}
public String getMobilite() {
	return mobilite;
}
public void setMobilite(String mobilite) {
	this.mobilite = mobilite;
}
public String getSiteSource() {
	return siteSource;
}
public void setSiteSource(String siteSource) {
	this.siteSource = siteSource;
}
public Filtrer() {
	super();
	// TODO Auto-generated constructor stub
}
public Filtrer(String niveauFormation, String disponibilite, String mobilite, String siteSource) {
	super();
	this.niveauFormation = niveauFormation;
	this.disponibilite = disponibilite;
	this.mobilite = mobilite;
	this.siteSource = siteSource;
}
}
