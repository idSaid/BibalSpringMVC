package com.bibal.metier;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.bibal.util.EtatExemplaire;

@Entity
public class Emprunt {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEmprunt;
	private Date date;
	private Date dateRetourEffective;
	private EtatExemplaire etatExemplaire;
	
	@ManyToOne
	@JoinColumn(name="idUsager")
	private Usager usager;
	
	@ManyToOne
	@JoinColumn(name="idExemplaire")
	private Exemplaire exemplaire;		
	
	public Emprunt() {
		// TODO Auto-generated constructor stub
	}
	
	public void Empr(Usager usager, Exemplaire exemplaire) {		
		this.usager=usager;
		this.exemplaire=exemplaire;
		this.date=new Date();
	}

}
