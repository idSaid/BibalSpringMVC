package com.bibal.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bibal.metier.Usager;
import com.bibal.service.IUsagerService;
import com.mysql.fabric.Response;

@Controller
public class UsagerController {
	
	@Autowired
	private IUsagerService UsagerService;
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}

	@RequestMapping(name="/addUsager")
	public String ajouterUsager(@RequestParam("prenom")String prenom, @RequestParam("nom")String nom,
			@RequestParam("mail")String mail, @RequestParam("tel")String tel){		
		Usager usager = new Usager(nom, prenom, mail, tel);
		UsagerService.addUsager(usager);
		return "index";
	}

}
