package com.bibal.metier;

import javax.persistence.Entity;

import com.bibal.util.PropertiesLoad;

@Entity
public class Livre extends Oeuvre {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8996466503212216697L;

	private int delaiRetour;

	public Livre() {
		super();
		this.delaiRetour = PropertiesLoad.getDelai("delaiLivre");
	}

	public Livre(String nom, String thematique, String ecrivain) {
		super(nom, thematique, ecrivain);
		this.delaiRetour = PropertiesLoad.getDelai("delaiLivre");
	}
	
	
	
}
