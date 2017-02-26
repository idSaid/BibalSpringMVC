package com.bibal.service.interfaces;

import java.util.List;

import com.bibal.metier.Livre;

public interface LivreService {

	public void addLivre(String nom, String thematique, String ecrivain);
	public List<Livre> findAll();
	public Livre getById(Long id);
	public List<Livre> searchByName(String nom);
	public List<Livre> searchByAuthor(String author);
	public List<Livre> searchByThematique(String thematique);
	public Livre update(Long id, String nom, String thematique, String ecrivain);
	
}
