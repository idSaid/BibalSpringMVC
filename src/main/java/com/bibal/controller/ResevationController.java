package com.bibal.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@Controller
@EnableAutoConfiguration
@ComponentScan
public class ResevationController {

	@RequestMapping("/Reservations")
	public String Reservations(){
		return "Reservations";
	}
	
}
