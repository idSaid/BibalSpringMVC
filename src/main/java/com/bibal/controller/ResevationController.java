package com.bibal.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bibal.metier.Livre;
import com.bibal.metier.Usager;
import com.bibal.service.interfaces.LivreService;
import com.bibal.service.interfaces.ReservationService;
import com.bibal.service.interfaces.UsagerService;


@Configuration
@Controller
@EnableAutoConfiguration
@ComponentScan
public class ResevationController
{

	@Autowired
	private ReservationService reservationService;

	@Autowired
	private UsagerService usagerService;

	@Autowired
	private LivreService livreService;

	@RequestMapping("/Reservations")
	public String Reservations()
	{
		return "Reservations";
	}

	@GetMapping("/addReservation")
	public String reserver(Long idUsager, Long idLivre)
	{
		Usager usager = usagerService.getById(idUsager);
		Livre livre = livreService.getById(idLivre);
		reservationService.addReservation(new Date(), usager, livre);
		return "redirect:/DetailLivre?idLivre=" + idLivre;
	}

}
