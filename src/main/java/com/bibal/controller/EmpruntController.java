package com.bibal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bibal.service.interfaces.EmpruntService;

@Configuration
@Controller
@EnableAutoConfiguration
@ComponentScan
public class EmpruntController {

	@Autowired
	private EmpruntService empruntService;

	@RequestMapping("/Emprunts")
	public String Emprunts() {
		return "Emprunts";
	}

	@RequestMapping(value = "/addEmprunt", method = RequestMethod.GET)
	public String addEmprunt(Long idExemplaire, Long idUsager, String page, Long idLivre) {
		empruntService.addEmprunt(idUsager, idExemplaire);
		if (page.equals("detailLivre")) {
			return "redirect:/DetailLivre?idLivre=" + idLivre;
		} else {
			return "";
		}

	}
	
	@RequestMapping(value = "/rendre", method = RequestMethod.GET)
	public String redre(String etatExemplaire, Long idExemplaire, Long idLivre) {
		empruntService.rendre(etatExemplaire, idExemplaire);
		return "redirect:/DetailLivre?idLivre=" + idLivre;
	}
	
	

}
