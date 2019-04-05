package com.fr.adaming.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fr.adaming.Interface.GestionFormationI;


public class ConnectionDB {
	public static SessionFactory factory;
	public static Session getConnection(){
		factory = new Configuration().configure().buildSessionFactory();
		return factory.openSession();

}
	public static SessionFactory getFactory() {
		return factory;
	}
	public static void setFactory(SessionFactory factory) {
		ConnectionDB.factory = factory;
	}







}

/*
public Statement createStatement() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List ajouter(List maListe, Object element) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List supprimer(List maListe, Object element) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void consulter(List maListe) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean rechercher(List maListe, Object element) {
	// TODO Auto-generated method stub
	return false;
}}*/