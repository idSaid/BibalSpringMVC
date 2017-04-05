package com.bibal.metier;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.bibal.util.EtatExemplaire;

@Entity
public class Exemplaire {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idExemplaire;
	private EtatExemplaire etatExemplaire;
	
	@ManyToOne
	@JoinColumn(name="oeuvreId")
	Oeuvre oeuvre;
	
	@OneToMany
	@JoinColumn(name="idExemplaire", referencedColumnName="idExemplaire" )
	private List<Emprunt> listEmprunts;
	
	public Exemplaire() {
		this.etatExemplaire=EtatExemplaire.Bonne;
	}

	public EtatExemplaire getEtatExemplaire() {
		return etatExemplaire;
	}

	public void setEtatExemplaire(EtatExemplaire etatExemplaire) {
		this.etatExemplaire = etatExemplaire;
	}

	public Oeuvre getOeuvre() {
		return oeuvre;
	}

	public void setOeuvre(Oeuvre oeuvre) {
		this.oeuvre = oeuvre;
	}

	public Long getIdExemplaire() {
		return idExemplaire;
	}

	public List<Emprunt> getListEmprunts() {
		return listEmprunts;
	}
	
	
	
}
