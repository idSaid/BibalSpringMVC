package com.bibal.metier;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.bibal.util.EtatExemplaire;

@Entity
public class Reservation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8608120265426737130L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idReservation;
	private Date date;
	private EtatExemplaire etat;
	@ManyToOne
	@JoinColumn(name="idUsager")
	private Usager user;
	@ManyToOne
	@JoinColumn(name="idOeuvre")
	private Oeuvre oeuvre;
	
	public Reservation() {
		// TODO Auto-generated constructor stub
	}
	
	public Reservation(Date date, EtatExemplaire etat) {
		super();		
		this.date = date;
		this.etat = etat;
	}
	
	public Long getIdReservation() {
		return idReservation;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public EtatExemplaire getEtat() {
		return etat;
	}

	public void setEtat(EtatExemplaire etat) {
		this.etat = etat;
	}
	
	
	
}
