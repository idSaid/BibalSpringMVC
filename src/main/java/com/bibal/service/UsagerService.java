package com.bibal.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibal.dao.IUsagerRepository;
import com.bibal.metier.Usager;

@Service
@Transactional
public class UsagerService implements IUsagerService {

	@Autowired
	private IUsagerRepository iUsagerRepository;
	
	@Override
	public void addUsager(Usager usager) {
		iUsagerRepository.save(usager);

	}

	@Override
	public List<Usager> getUsagers() {
		return iUsagerRepository.findAll();
	}

	@Override
	public Usager getUsagerById(Long idUsager) {
		return iUsagerRepository.findOne(idUsager);
	}

}
