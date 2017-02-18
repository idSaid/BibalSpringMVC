package com.bibal.service;

import java.util.List;

import com.bibal.metier.Usager;

public interface IUsagerService {
	
	public void addUsager(Usager usager);
	public List<Usager> getUsagers();
	public Usager getUsagerById(Long idUsager);

}
