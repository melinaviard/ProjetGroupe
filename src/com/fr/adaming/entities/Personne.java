package com.fr.adaming.entities;

import java.util.Date;
import java.util.List;

import com.fr.adaming.Interface.GestionFormationI;


public class Personne {

    private String dateNaissance;
    private String nom;
    private String prenom;

    public Personne() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Personne(String dateNaissance, String nom, String prenom) {
        super();
        this.dateNaissance = dateNaissance;
        this.nom = nom;
        this.prenom = prenom;
    }

    public date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return '\n' + prenom + ' ' + nom + " né le " + dateNaissance;
    }
}
	
	

	
	
	
	
	

