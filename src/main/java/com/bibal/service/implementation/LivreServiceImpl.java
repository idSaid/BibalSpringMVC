package com.bibal.service.implementation;

import java.util.List;

import com.bibal.metier.Livre;
import com.bibal.service.interfaces.LivreService;

public class LivreServiceImpl implements LivreService{

	@Override
	public void addLivre(String nom, String thematique, String ecrivain) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Livre> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livre getById(Long idLivre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Livre> searchByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livre update(Long idLivre, String nom, String thematique, String ecrivain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Livre> searchByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Livre> searchByThematique(String thematique) {
		// TODO Auto-generated method stub
		return null;
	}

}
