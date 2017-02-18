package com.bibal.metier;

import java.io.Serializable;

import javax.persistence.Entity;

import com.bibal.util.DelaiRetour;

@Entity	
public class Magazine extends Oeuvre {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9064741753569733463L;

	DelaiRetour delaiRetour;
	
	public Magazine(DelaiRetour delaiRetour) {
		super();
		this.delaiRetour=DelaiRetour.delaiMagazine;
	}
	
}
