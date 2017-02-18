package com.bibal.metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

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
	private String mail;
	private String tel;
	
	@OneToMany
	@JoinColumn(name="idUsager",referencedColumnName="idUsager")
	private List<Reservation> listReservations;
	
	@OneToMany
	@JoinColumn(name="idUsager", referencedColumnName="idUsager")
	private List<Emprunt> listEmprunts;
	
	public Usager() {
		super();
	}
	public Usager(String nom, String prenom, String mail, String tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
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
	};
	
}
