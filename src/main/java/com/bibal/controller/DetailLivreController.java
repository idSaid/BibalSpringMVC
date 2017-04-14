package com.bibal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bibal.metier.Emprunt;
import com.bibal.metier.Exemplaire;
import com.bibal.metier.Livre;
import com.bibal.service.interfaces.EmpruntService;
import com.bibal.service.interfaces.ExemplaireService;
import com.bibal.service.interfaces.LivreService;


@Configuration
@Controller
@EnableAutoConfiguration
@ComponentScan
public class DetailLivreController
{

	@Autowired
	private ExemplaireService exemplaireService;

	@Autowired
	private LivreService livreService;

	@Autowired
	private EmpruntService empruntService;

	@GetMapping("/DetailLivre")
	public String DetailLivre(@RequestParam("idLivre") Long idLivre, Model model)
	{
		try
		{
			Livre livre = livreService.getById(idLivre);
			model.addAttribute("livre", livre);
			List<Exemplaire> exemplaires = livre.getExemplairesBons();
			String[] disponobilite = getDiponibiliteByExemplaire(exemplaires);
			model.addAttribute("exemplaires", exemplaires);
			model.addAttribute("nbrExempl", exemplaires.size());
			model.addAttribute("nbrExemplDispo", getNbrExemplaireDisponible(disponobilite));
			model.addAttribute("dispo", getDiponibiliteByExemplaire(exemplaires));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

		return "DetailLivre";
	}

	private int getNbrExemplaireDisponible(String[] disponobilite)
	{
		int cmpt = 0;
		for (int i = 0; i < disponobilite.length; i++)
		{
			if (disponobilite[i].equals("Disponible"))
				cmpt++;
		}
		return cmpt;
	}

	private String[] getDiponibiliteByExemplaire(List<Exemplaire> exemplaires)
	{
		String[] disponobilite = new String[exemplaires.size()];
		int size = 0;
		for (Exemplaire exemplaire : exemplaires)
		{
			disponobilite[size] = empruntService.getDisponibilite(exemplaire.getIdExemplaire());
			size++;
		}
		for(int i = 0; i<disponobilite.length;i++) System.out.println(disponobilite[i]);
		return disponobilite;
	}

}
