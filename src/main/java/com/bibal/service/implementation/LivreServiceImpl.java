package com.bibal.service.implementation;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibal.dao.LivreRepository;
import com.bibal.metier.Livre;
import com.bibal.service.interfaces.LivreService;

@Service
@Transactional
public class LivreServiceImpl implements LivreService{

	@Autowired
	LivreRepository livreRepository;
	
	@Override
	public void addLivre(String nom, String thematique, String ecrivain) {
		Livre livre = new Livre(nom, thematique, ecrivain);
		livreRepository.save(livre);
	}

	@Override
	public List<Livre> findAll() {		
		return livreRepository.findAll();
	}

	@Override
	public Livre getById(Long idLivre) {
		return livreRepository.findOne(idLivre);
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
