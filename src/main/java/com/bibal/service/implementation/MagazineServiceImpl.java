package com.bibal.service.implementation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bibal.dao.MagazineRepository;
import com.bibal.metier.Magazine;
import com.bibal.service.interfaces.MagazineService;
import com.bibal.util.ThemeMagazine;

public class MagazineServiceImpl implements MagazineService {

	SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-aaaa");
	
	@Autowired
	MagazineRepository magazineRepository;
	
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
	public Magazine update(Long id, String nom,String theme, String titre, String dateSortie,String numeroDeSerie) {
		
		Magazine magazine = getById(id);
		magazine.setNom(nom);
		magazine.setTheme(ThemeMagazine.valueOf(theme));
		magazine.setTitre(titre);
		try {
			magazine.setDateSortie(formatter.parse(dateSortie));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		magazine.setHorsSerie(false);		
		magazine.setNumeroDeSerie(Integer.parseInt(numeroDeSerie));
		magazineRepository.save(magazine);
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

	@Override
	public void addMagazineHorsSerie(String nom, String theme, String titre, String dateSortie) {
		
		try {
			magazineRepository.save(new Magazine(nom, ThemeMagazine.valueOf(theme), titre, formatter.parse(dateSortie), true));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}		
		
	}

	@Override
	public void addMagazine(String nom, String theme, String titre, String dateSortie, String numeroDeSerie) {
		
		try {
			magazineRepository.save(new Magazine(nom, ThemeMagazine.valueOf(theme), titre, formatter.parse(dateSortie), false, Integer.valueOf(numeroDeSerie)));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public Magazine updateHorsSerie(Long id, String nom, String theme, String titre, String dateSortie) {
		Magazine magazine = getById(id);
		magazine.setNom(nom);
		magazine.setTheme(ThemeMagazine.valueOf(theme));
		magazine.setTitre(titre);
		try {
			magazine.setDateSortie(formatter.parse(dateSortie));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		magazine.setHorsSerie(false);				
		magazineRepository.save(magazine);
		return magazine;
	}

}
