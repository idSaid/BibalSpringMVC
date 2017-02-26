package com.bibal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bibal.metier.Usager;
import com.bibal.service.interfaces.UsagerService;


@Controller
public class UsagerController {
	
	@Autowired
	private UsagerService usagerService;
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}

	@RequestMapping("/addUsager")
	public String ajouterUsager(@RequestParam("prenom")String prenom, @RequestParam("nom")String nom,
			@RequestParam("mail")String mail, @RequestParam("tel")String tel){				
		usagerService.addUsager(nom, prenom, mail, tel);
		return "ListeUsagers";
	}
	
	@RequestMapping(value="/searchUsagerByName",method=RequestMethod.GET)
	public String searchUsagerByName(@RequestParam("nom")String nom,Model model){
		List<Usager> usagers = usagerService.searchUsagerByName(nom);
		model.addAttribute("usagers", usagers);
		return "ListeUsagers";
	}
	
	@RequestMapping("/searchUsager")
	public String SearchUsager(Model model){
		model.addAttribute("usagers", null);
		return "ListeUsagers";
	}

}
