package com.bibal.service.interfaces;

import com.bibal.metier.Emprunt;

public interface EmpruntService {

	public String getDisponibilite(Long idExemplaire);
	public void addEmprunt(Long idUsager, Long idExemplaire);
	public void rendre(String etatExemplaire, Long idExemplaire);
}
