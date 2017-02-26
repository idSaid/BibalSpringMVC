package com.bibal.metier;

import javax.persistence.Entity;

import com.bibal.util.PropertiesManager;

@Entity	
public class Magazine extends Oeuvre {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9064741753569733463L;

	int delaiRetour;
	
	public Magazine() {
		super();
		this.delaiRetour=PropertiesManager.getDelai("delaiMagazine");
	}

	public Magazine(String nom, String thematique, String ecrivain) {
		super(nom, thematique, ecrivain);
		this.delaiRetour=PropertiesManager.getDelai("delaiMagazine");
	}

}
