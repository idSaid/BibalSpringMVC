package com.bibal.controller;

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

import com.bibal.metier.Exemplaire;
import com.bibal.metier.Livre;
import com.bibal.service.interfaces.ExemplaireService;
import com.bibal.service.interfaces.LivreService;

@Configuration
@Controller
@EnableAutoConfiguration
@ComponentScan
public class DetailLivreController {

	@Autowired
	private ExemplaireService exemplaireService;

	@Autowired
	private LivreService livreService;

	@GetMapping("/DetailLivre")
	public String DetailLivre(@RequestParam("idLivre") Long idLivre, Model model) {
		try {
			Livre livre = livreService.getById(idLivre);
			model.addAttribute("livre", livre);
			List<Exemplaire> exemplaires = exemplaireService.findByOeuvre(livre);
			model.addAttribute("exemplaires", exemplaires);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return "DetailLivre";
	}

}
