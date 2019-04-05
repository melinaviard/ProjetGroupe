package com.fr.adaming.Interface;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.fr.adaming.entities.ConnectionDB;
import com.fr.adaming.entities.Consultants;




public class ConsultantService {

	//Inserer un nouveau consultant
	private static void ajouter(Session session, Object consultant) {
		Transaction t = session.beginTransaction();
		Consultants consult = (Consultants) consultant;
		session.persist(consult);
		 t.commit();
	}
	
	//Supprimer un consultant
	private static void supprimer(Session session, Object consultant) {
		Transaction t = session.beginTransaction();
		Consultants consult = (Consultants) consultant;
		session.delete(consult);
		 t.commit();
	}
	
	//Consulter tous les consultants
	private static void consulter(Session session, Object consultant) {
		Transaction t = session.beginTransaction();
		List<Consultants> consultants =session.createQuery("from Consultants cons").list();
		System.out.println(consultants);
		 t.commit();
	}
	
	//Rechercher un consultant
	private static void rechercher(Session session, Object consultant) {
		Transaction t = session.beginTransaction();
		Consultants consult = (Consultants) consultant;
		session.persist(consult);
		 t.commit();
		
		
	}
	
}
