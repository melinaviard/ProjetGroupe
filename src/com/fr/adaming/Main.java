package com.fr.adaming;
import com.fr.adaming.Interface.ConsultantService;
import com.fr.adaming.Interface.ApprenantService;
import com.fr.adaming.Interface.FormationService;
import com.fr.adaming.entities.Apprenants;
import com.fr.adaming.entities.Consultants;
import com.fr.adaming.entities.CycleFormation;
import com.fr.adaming.entities.ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.omg.Messaging.SyncScopeHelper;

public class Main {

    public static void main(String[] args)  {
    	
    	ConnectionDB.getFactory(); 
             
    	ConsultantService consultantService = new ConsultantService();
        ApprenantService apprenantService = new ApprenantService();
        FormationService formationService = new FormationService(); 
        
     
           
        
        while (true) {
            System.out.println("\n\nEntrer le chiffre \n\t1 si vous souhaitez gérer les consultants \n\t2 pour gérer les apprenants \n\t3 pour gérer les formations");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("\nVous avez choisi de gérer les consultants");
                    System.out.println("\nChoisissez \n\t1 pour ajouter un consultant \n\t2 pour supprimer un consultant \n\t3 pour consulter la liste \n\t4 pour rechercher un consultant");
                    Scanner sc1 = new Scanner(System.in);
                    int b = sc1.nextInt();
                    sc1.nextLine();
                    switch (b) {
                        case 1:
                            System.out.println("Insérez la date de naissance du consultant");
                            String dateNaissance = sc1.nextLine();
                            System.out.println("Insérez le nom du consultant");
                            String nom = sc1.nextLine();
                            System.out.println("Insérez le prénom du consultant");
                            String prenom = sc1.nextLine();
                            System.out.println("Insérez la spécialité du consultant");
                            String specialite = sc1.nextLine();
                            System.out.println("Insérez le nombre d'heure disponible");
                            int nbHour = sc1.nextInt();
                            System.out.println("Insérez l'index");
                            int index = sc1.nextInt();

                            /*r = (ResultSet) st.executeQuery("INSERT INTO consultants (nom,prenom,dateNaissance,specialite,nbH) VALUES ('"+ nom+","+prenom+","+dateNaissance+","+specialite+","+nbHour+")")
                            ;
                            System.out.println ("Le nouveau consultant a été ajouté avec succès");
                            r = st.executeQuery("select * from consultants");*/

                           Consultants consultants = new Consultants(dateNaissance, nom, prenom, specialite, nbHour, index);
                            consultantService.ajouter(consultants, conn);
                            consultantService.consulter(conn);
                            break;
                        case 2:
                        	System.out.println("Rentrez le nom et le prénom du consultant que vous souhaitez supprimer");
                        	String nomSupp = sc1.nextLine();
                              
                              /* pareil ci-dessous ne reco pas "st" */
                        	/* r = st.executeQuery("delete from consultants where (nom like '%"+nomSupp+"%')");
                        	 
                         	System.out.println("Le consultant"+nomSupp+"a été supprimé avec succès");

                        	 r = st.executeQuery("select * from consultants");*/
                        	 
                        	 consultantService.supprimer(consultants, conn);
                        	 consultantService.consulter(conn);
                        	 
                            break;
                        case 3:
                        	System.out.println ("Voici les consultants : \n");
                        	 r = st.executeQuery("select * from consultants");
                        	 consultantService.consulter(conn);
                            break;
                            
                        case 4:
                            System.out.println("Insérez l'index de l'élément à rechercher");
                            int index1 = sc1.nextInt();
                            index--;
                            consultantService.rechercher(consultants, conn);
                          /*   if (index >= 0 && index < listConsult.size()) { */
                            	/*r = st.executeQuery("select * from consultants where (idConsultants ="+index1+")");*/
                          /*  } else {
                                System.out.println("Index non valide.");
                            }*/
                            break; 
                    }
                    break;
                case 2:
                    System.out.println("\nVous avez choisi de gérer les apprenants");
                    System.out.println("\nChoisissez \n\t1 pour ajouter un apprenant \n\t2 pour supprimer un apprenant \n\t3 pour consulter la liste \n\t4 pour rechercher un apprenant");
                    Scanner sc2 = new Scanner(System.in);
                    int c = sc2.nextInt();
                    sc2.nextLine();
                    switch (c) {
                        case 1:
                            System.out.println("Insérez la date de naissance de l'apprenant");
                            String dateNaissance = sc2.nextLine();
                            System.out.println("Insérez le nom de l'apprenant");
                            String nom = sc2.nextLine();
                            System.out.println("Insérez le prénom de l'apprenant");
                            String prenom = sc2.nextLine();
                            System.out.println("Insérez le diplôme de l'apprenant");
                            String diplome = sc2.nextLine();
                            System.out.println("Insérez le cv de l'apprenant");                          
                            String cv = sc2.nextLine();
                            System.out.println("Insérez le cyle de formation de l'apprenant");                            
                            String cycleForm = sc2.nextLine();
                            System.out.println("Insérez l'index");
                            int index = sc2.nextInt();
                            
                            /*r = st.executeQuery("INSERT INTO apprenants (diplome,cycleFormation,nom,prenom,dateNaissance,cv)" + " VALUES ('"+ diplome+","+ cycleForm+","+ nom+","+prenom+","+dateNaissance+","+cv+")");
                            ;
                            System.out.println ("Le nouvel apprenant a été ajouté avec succès");
                            r = st.executeQuery("select * from apprenants");*/
                            
                            Apprenants Apprenants = new Apprenants(dateNaissance, nom, prenom, diplome, cv, index);
                            apprenantService.ajouter(Apprenants, conn);
                            apprenantService.consulter(conn);
                            
                            break;
                        case 2:
                        	/*System.out.println("Rentrez le nom de l'apprenant que vous souhaitez supprimer");
                        	String nomSupp = sc2.nextLine();
                            
                        	 r = st.executeQuery("delete from apprenants where (nom like '%"+nomSupp+"%')");
                        	 
                         	System.out.println("L'apprenant "+nomSupp+" a été supprimé avec succès");

                        	 r = st.executeQuery("select * from apprenants");*/
                        	
                        	apprenantService.supprimer(Apprenants, conn);
                            apprenantService.consulter(conn);
                            break;
                        case 3:
                        	/*System.out.println ("Voici les apprenants : \n");
                       	 r = st.executeQuery("select * from apprenants");*/
                            apprenantService.consulter(conn);
                            break;
                        case 4:
                        	System.out.println("Insérez l'index de l'élément à rechercher");
                            int index1 = sc2.nextInt();
                            index--;
                            apprenantService.rechercher(Apprenants, conn);
                            /*
                            if (index >= 0 && index < listConsult.size()) { */
                            	/*r = st.executeQuery("select * from apprenants where (idApprenants ="+index+")");*/
                           /* } else {
                                System.out.println("Index non valide."); */
                        	
                        	/*System.out.println("Insérez l'index de l'élément à rechercher");
                            Scanner ind2 = new Scanner(System.in);
                            int index = ind2.nextInt();
                            index--;
                            if (index >= 0 && index < listApp.size()) {
                                apprenantService.rechercher(listApp, listApp.get(index));
                            } else {
                                System.out.println("Index non valide.");*/
                               
                            }
                            break;
                    

                    break;
                case 3:
                    System.out.println("\nVous avez choisi de gérer les formations");
                    System.out.println("\nChoisissez \n\t1 pour ajouter une formation \n\t2 pour supprimer une formation \n\t3 pour consulter la liste \n\t4 pour rechercher un apprenant");
                    Scanner sc3 = new Scanner(System.in);
                    int d = sc3.nextInt();
                    sc3.nextLine();
                    switch (d) {
                        case 1:
                            System.out.println("Insérez le titre de la formation");
                            String titre = sc3.nextLine();
                            System.out.println("Insérez la description de la formation");
                            String description = sc3.nextLine();
                            System.out.println("Insérez la date de début de la formation");
                            String debutFormation = sc3.nextLine();
                            System.out.println("Insérez la date de fin de la formation");
                            String finFormation = sc3.nextLine();
                            System.out.println("Insérez le coût de la formation");
                            Double cout = sc3.nextDouble();
                            System.out.println("Insérez l'index");
                            int index = sc3.nextInt();
                            /*(Il faudra rajouter le cout de la formation dans la table, et voir si on garde dateFormation et duree ou si on garde date de début et date de fin comme lors du premier travail en groupe ?)
                             * Dans la version que j'avais il n'y avait que date de début c'est pq j'ai rajouté durée, mais moi perso je préfère date début et date fin ça me semble plus logique :) */
                           /* r = st.executeQuery("INSERT INTO formation (titre, description, debutFormation, finformation, cout) VALUES ('"+ titre+","+description+","+debutFormation+","+finFormation+","+cout+")");
                            ;
                            System.out.println ("La nouvelle formation a été ajoutée avec succès");
                            r = st.executeQuery("select * from formation");*/
                            CycleFormation cycleFormation = new CycleFormation(index, titre, description, debutFormation, finFormation, cout);
                            formationService.ajouter(cycleFormation, conn);
                            formationService.consulter(conn);
                            break;
                        case 2:
                        	/*System.out.println("Rentrez le titre de la formation que vous souhaitez supprimer");
                        	String nomSupp = sc3.nextLine();
                            
                        	 r = st.executeQuery("delete from formation where (nom like '%"+nomSupp+"%')");
                        	 
                         	System.out.println("La formation"+nomSupp+"a été supprimé avec succès");

                        	 r = st.executeQuery("select * from formation");*/
                        	
                            formationService.supprimer(cycleFormation, conn);
                            formationService.consulter(conn);
                            break;
                        case 3:
                        	/*System.out.println ("Voici les formations : \n");
                          	 r = st.executeQuery("select * from formation");*/
                            formationService.consulter(conn);
                            break;
                        case 4:
                        	System.out.println("Insérez l'index de l'élément à rechercher");
                            int index1 = sc3.nextInt();
                            index--;
                            formationService.rechercher(cycleFormation, conn);
                            /*
                            if (index >= 0 && index < listConsult.size()) { */
                            	/*r = st.executeQuery("select * from formation where (idFormation ="+index+")");*/
                           /* } else {
                                System.out.println("Index non valide."); */
                        	
                        	/*System.out.println("Insérez l'index de l'élément à rechercher");
                            Scanner ind3 = new Scanner(System.in);
                            int index = ind3.nextInt();
                            index--;
                            if (index >= 0 && index < listForm.size()) {
                                formationService.rechercher(listForm, listForm.get(index));
                            } else {
                                System.out.println("Index non valide.");*/
                            break;
                            }
                            break;
                    
                   default:
                    System.out.println("Erreur lors de la saisie");
            }
                    
                   
            }
        
         
    
       
      }
 catch (Exception e) {
            e.printStackTrace();
           Connection close;  }
    
}
 
}

