package com.bibal.service.interfaces;

import java.util.List;

import com.bibal.metier.Exemplaire;
import com.bibal.metier.Oeuvre;

public interface ExemplaireService {

	public void addExemplaire(Exemplaire exemplaire);
	public List<Exemplaire> findByOeuvre(Oeuvre oeuvre);
	
}
