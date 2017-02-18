package com.bibal.metier;

import javax.persistence.Entity;

import com.bibal.util.DelaiRetour;

@Entity
public class Livre extends Oeuvre {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8996466503212216697L;

	private DelaiRetour delaiRetour;

	public Livre(DelaiRetour delaiRetour) {
		super();
		this.delaiRetour = DelaiRetour.delaiLivre;
	}
	
}
