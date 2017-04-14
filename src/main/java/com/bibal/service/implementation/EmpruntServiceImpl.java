package com.bibal.service.implementation;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibal.dao.EmpruntRepository;
import com.bibal.metier.Emprunt;
import com.bibal.service.interfaces.EmpruntService;


@Service
@Transactional
public class EmpruntServiceImpl implements EmpruntService
{

	@Autowired
	private EmpruntRepository empruntRepository;

	private Date date = new Date();

	@Override
	public String getDisponibilite(Long idExemplaire)
	{
		try
		{
			Emprunt emprunt = empruntRepository.findByExemplaire(idExemplaire);
			if (emprunt == null)
			{
				return "Disponible";
			}
			else
			{
				if (date.after(emprunt.getDateRetourEffective()))
					return "Emprunte";
				else
					return "Disponible";
			}

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			return "Disponible";
		}


	}

}
