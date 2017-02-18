package com.bibal.util;

public enum DelaiRetour {
	
	delaiLivre(15),delaiMagazine(10);
	private int delai;
	
	private DelaiRetour(int delai) {
		this.delai=delai;
	}
	
	public int getDelai() {
		return delai;
	}
	
}
