package com.fr.adaming.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;





@Entity
public class Consultants implements Serializable {
	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_consultants")
	private int id_consultants;
	

	private String specialite;
	private Date dateNaissance;
	private int nbHour;
	
	@Embedded
	Personne nom;
	@Embedded
	Personne prenom;
	
	@ManyToOne
	@JoinColumn(name="id_formation" )
	private CycleFormation formation;

	public int getId_consultants() {
		return id_consultants;
	}

	public void setId_consultants(int id_consultants) {
		this.id_consultants = id_consultants;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getNbHour() {
		return nbHour;
	}

	public void setNbHour(int nbHour) {
		this.nbHour = nbHour;
	}

	public CycleFormation getFormation() {
		return formation;
	}

	public void setFormation(CycleFormation formation) {
		this.formation = formation;
	}

	

	public Consultants() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consultants( String specialite, Date dateNaissance, int nbHour, Personne nom,
			Personne prenom, CycleFormation formation) {
		super();
		this.specialite = specialite;
		this.dateNaissance = dateNaissance;
		this.nbHour = nbHour;
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
	}

	public Personne getNom() {
		return nom;
	}

	public void setNom(Personne nom) {
		this.nom = nom;
	}

	public Personne getPrenom() {
		return prenom;
	}

	public void setPrenom(Personne prenom) {
		this.prenom = prenom;
	}

	
	
	

}



	


