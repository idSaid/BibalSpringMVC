package com.bibal.service.implementation;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibal.dao.ExemplaireRepository;
import com.bibal.metier.Exemplaire;
import com.bibal.metier.Oeuvre;
import com.bibal.service.interfaces.ExemplaireService;

@Service
@Transactional
public class ExemplaireServiceImpl implements ExemplaireService {

	@Autowired
	private ExemplaireRepository exemplaireRepository;
	
	@Override
	public List<Exemplaire> findByOeuvre(Oeuvre oeuvre) {
		return exemplaireRepository.findByOeuvre(oeuvre.getIdOeuvre());		
	}

	@Override
	public void addExemplaire(Exemplaire exemplaire)
	{
		exemplaireRepository.save(exemplaire);
	}

}
