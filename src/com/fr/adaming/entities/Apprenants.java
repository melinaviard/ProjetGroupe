package com.fr.adaming.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Apprenants  implements Serializable{
    

   /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Column(name="id_app")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Id
   private int id_app;

   private String diplome;

   private String cV;

   @ManyToOne
    @JoinColumn(name="id_formation")
   @Embedded
   Apprenants apprenants;

   public Apprenants() {
       super();
       // TODO Auto-generated constructor stub
   }

   public Apprenants(Date dateNaissance, String nom, String prenom, int id_app) {
       super(dateNaissance, nom, prenom);
       // TODO Auto-generated constructor stub
   }
        public Apprenants(Date dateNaissance, String nom, String prenom, String diplome, String cV, int id_app) {
           super(dateNaissance, nom, prenom);
           this.diplome = diplome;
           this.cV = cV;
           this.id_app=id_app;
   }

   public Apprenants(String diplome, String cV, int id_app) {
       super();
       this.diplome = diplome;
       this.cV = cV;
       this.id_app=id_app;
   }

   public int getId_app() {
        return id_app;
    }

    public void setId_app(int id_app) {
        this.id_app = id_app;
    }

    public String getDiplome() {
       return diplome;
   }

   public void setDiplome(String diplome) {
       this.diplome = diplome;
   }

   public String getcV() {
       return cV;
   }

   public void setcV(String cV) {
       this.cV = cV;
   }

    @Override
    public String toString() {
        return super.toString() +
        "Apprenants [\ndiplome=" + diplome + "\n cV=" + cV + "\n" + id_app +"index" +
                "]";
    }




}