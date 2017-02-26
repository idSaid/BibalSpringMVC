package com.bibal.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bibal.dao.MagazineRepository;
import com.bibal.metier.Magazine;
import com.bibal.service.interfaces.MagazineService;

public class MagazineServiceImpl implements MagazineService {

	@Autowired
	MagazineRepository magazineRepository;
	
	@Override
	public void addMagazine(String nom, String thematique, String ecrivain) {		
		magazineRepository.save(new Magazine(nom, thematique, ecrivain));
	}

	@Override
	public List<Magazine> findAll() {		
		return magazineRepository.findAll();
	}

	@Override
	public Magazine getById(Long id) {
		return magazineRepository.findOne(id);
	}

	@Override
	public List<Magazine> searchByName(String nom) {
		return magazineRepository.searchByName(nom);
	}

	@Override
	public Magazine update(Long id, String nom, String thematique, String ecrivain) {
		Magazine magazine = getById(id);
		magazine.setNom(nom);
		magazine.setEcrivain(ecrivain);
		magazine.setThematique(thematique);
		return magazine;
	}

	@Override
	public List<Magazine> searchByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Magazine> searchByThematique(String thematique) {
		// TODO Auto-generated method stub
		return null;
	}

}
