package com.bibal.metier;

import java.util.Date;

import javax.persistence.Entity;

import com.bibal.util.PropertiesManager;
import com.bibal.util.ThemeMagazine;

@Entity	
public class Magazine extends Oeuvre {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9064741753569733463L;

	private int delaiRetour;
	private ThemeMagazine theme;
	private String titre;
	private Date dateSortie;
	private boolean horsSerie;
	private int numeroDeSerie;
	
	public Magazine() {
		super();
		this.delaiRetour=PropertiesManager.getDelai("delaiMagazine");
	}
		
	public Magazine(String nom, ThemeMagazine theme, String titre, Date dateSortie, boolean horsSerie) {
		super(nom);
		this.delaiRetour = PropertiesManager.getDelai("delaiMagazine");
		this.theme = theme;
		this.titre = titre;
		this.dateSortie = dateSortie;
		this.horsSerie = horsSerie;
	}

	public Magazine(String nom, ThemeMagazine theme, String titre, Date dateSortie, boolean horsSerie, int numeroDeSerie) {
		super(nom);
		this.delaiRetour = PropertiesManager.getDelai("delaiMagazine");
		this.theme = theme;
		this.titre = titre;
		this.dateSortie = dateSortie;
		this.horsSerie = horsSerie;
		this.numeroDeSerie = numeroDeSerie;
	}

	public ThemeMagazine getTheme() {
		return theme;
	}

	public void setTheme(ThemeMagazine theme) {
		this.theme = theme;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public boolean isHorsSerie() {
		return horsSerie;
	}

	public void setHorsSerie(boolean horsSerie) {
		this.horsSerie = horsSerie;
	}

	public int getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void setNumeroDeSerie(int numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public int getDelaiRetour() {
		return delaiRetour;
	}
	
	

}
