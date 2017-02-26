package com.bibal.metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.bibal.util.EtatUsager;

@Entity
public class Usager implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8071716128487923877L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUsager;
	private String nom;
	private String prenom;
	private String photo;
	private String adresse;
	private String mail;
	private String tel;
	private EtatUsager etat;
	
	@OneToMany
	@JoinColumn(name="idUsager",referencedColumnName="idUsager")
	private List<Reservation> listReservations;
	
	@OneToMany
	@JoinColumn(name="idUsager", referencedColumnName="idUsager")
	private List<Emprunt> listEmprunts;
	
	public Usager() {
		super();
		etat = EtatUsager.Client;
	}
	
	public Usager(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;	
		etat = EtatUsager.Client;
	}
	
	public Usager(String nom, String prenom, String mail, String tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
		etat = EtatUsager.Client;
	}	

	public EtatUsager getEtat() {
		return etat;
	}

	public void setEtat(EtatUsager etat) {
		this.etat = etat;
	}

	public Long getIdUsager() {
		return idUsager;
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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public List<Emprunt> getListEmprunts() {
		return listEmprunts;
	}
	
	public List<Reservation> getListReservations() {
		return listReservations;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
}
