package com.onsr.accidents.business;

public class Utilisateur {
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCin() {
	return cin;
}
public void setCin(int cin) {
	this.cin = cin;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Utilisateur() {
}
public Utilisateur(int cin, String nom, String prenom, String sexe,
		String datenaiss, String adresse, String grade, String situation,
		String login, String motpasse) {
	this.cin = cin;
	this.nom = nom;
	this.prenom = prenom;
	this.sexe = sexe;
	this.datenaiss = datenaiss;
	this.adresse = adresse;
	this.grade = grade;
	this.situation = situation;
	this.login = login;
	this.motpasse = motpasse;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getSexe() {
	return sexe;
}
public void setSexe(String sexe) {
	this.sexe = sexe;
}
public String getDatenaiss() {
	return datenaiss;
}
public void setDatenaiss(String datenaiss) {
	this.datenaiss = datenaiss;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getSituation() {
	return situation;
}
public void setSituation(String situation) {
	this.situation = situation;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getMotpasse() {
	return motpasse;
}
public void setMotpasse(String motpasse) {
	this.motpasse = motpasse;
}
private int cin;
private String nom;
private String prenom;
private String sexe;
private String datenaiss;
private String adresse;
private String grade;
private String situation;
private String login;
private String motpasse;
}
