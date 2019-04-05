package com.fr.adaming.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CycleFormation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_formation")
	private int index;
	
	@Column(length=30)
	private String titre;
	
	@Column(length=30)
	private String description;
	
	private Date debutFormation;
	
	private Date finFormation;
	
	private double cout;

	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="cycleFormation", fetch=FetchType.LAZY)
	List<Consultants> consultants = new ArrayList<Consultants>();
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="cycleFormation", fetch=FetchType.LAZY)
	List<Apprenants> apprenants = new ArrayList<Apprenants>();
	
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDebutFormation() {
		return debutFormation;
	}
	public void setDebutFormation(Date debutFormation) {
		this.debutFormation = debutFormation;
	}
	public Date getFinFormation() {
		return finFormation;
	}
	public void setFinFormation(Date finFormation) {
		this.finFormation = finFormation;
	}
	public double getCout() {
		return cout;
	}
	public void setCout(double cout) {
		this.cout = cout;
	}
	
	
	public CycleFormation(int index, String titre, String description, Date debutFormation, Date finFormation, double cout) {
		super();
		this.index = index;
		this.titre = titre;
		this.description = description;
		this.debutFormation = debutFormation;
		this.finFormation = finFormation;
		this.cout = cout;
		
	}
	
	
	
	
	public CycleFormation(String titre, String description, Date debutFormation, Date finFormation, double cout) {
		super();
		this.titre = titre;
		this.description = description;
		this.debutFormation = debutFormation;
		this.finFormation = finFormation;
		this.cout = cout;
	}
	public CycleFormation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CycleFormation [index = " + index + "titre=" + titre + ", description=" + description + ", debutFormation=" + debutFormation
				+ ", finFormation=" + finFormation + ", cout=" + cout + "]";
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public List<Consultants> getConsultants() {
		return consultants;
	}
	public void setConsultants(List<Consultants> consultants) {
		this.consultants = consultants;
	}
	public List<Apprenants> getApprenants() {
		return apprenants;
	}
	public void setApprenants(List<Apprenants> apprenants) {
		this.apprenants = apprenants;
	}



    }