package com.fr.adaming.Interface;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.Session;

import com.fr.adaming.entities.Consultants;




public interface GestionFormationI<O extends Object> {

	public Session ajouter( O element, Session session);
	public Session supprimer(O element, Session session);
	public void consulter( Session session);
	public boolean rechercher( O element, Session session);

	// Consultants
		//  Consultant
	private static void ajouter() {
		Consultants cons1= new Consultants();
		cons1.setSpecialite("specialite");
		cons1.setDateNaissance("dateNaissance");
		cons1.setNbHour("nbHour");
		session.persist(cons1);
		 
	}
	
}
	

