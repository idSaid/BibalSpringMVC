package com.bibal.metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Oeuvre implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 740534677215234688L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long idOeuvre;
	private String nom;
	private String thematique;
	private String ecrivain;
	
	@OneToMany
	@JoinColumn(name="idOeuvre", referencedColumnName="idOeuvre")
	private List<Reservation> listeReservations;
	
	@OneToMany
	@JoinColumn(name="idOeuvre", referencedColumnName="idOeuvre")
	private List<Exemplaire> listeExemplaires;
	
	public Oeuvre() {
		// TODO Auto-generated constructor stub
	}

	public Oeuvre(String nom, String thematique, String ecrivain) {
		super();
		this.nom = nom;
		this.thematique = thematique;
		this.ecrivain = ecrivain;
	}
	
	public Long getIdOeuvre() {
		return idOeuvre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getThematique() {
		return thematique;
	}

	public void setThematique(String thematique) {
		this.thematique = thematique;
	}

	public String getEcrivain() {
		return ecrivain;
	}

	public void setEcrivain(String ecrivain) {
		this.ecrivain = ecrivain;
	}
	
	
}
