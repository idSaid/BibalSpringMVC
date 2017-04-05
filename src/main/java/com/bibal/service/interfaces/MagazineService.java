package com.bibal.service.interfaces;

import java.util.List;

import com.bibal.metier.Magazine;

public interface MagazineService {

	public void addMagazine(String nom, String thematique, String ecrivain);
	public List<Magazine> findAll();
	public Magazine getById(Long id);
	public List<Magazine> searchByName(String nom);
	public List<Magazine> searchByAuthor(String author);
	public List<Magazine> searchByThematique(String thematique);
	public Magazine update(Long id, String nom);
	
}
