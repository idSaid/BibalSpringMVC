package com.bibal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bibal.util.EtatUsager;

@SpringBootApplication
public class BibalApplication implements CommandLineRunner{

/*	@Autowired
	private IUsagerRepository iUsagerRepository;*/
	
	public static void main(String[] args) {
		SpringApplication.run(BibalApplication.class, args);	
	}

	@Override
	public void run(String... arg0) throws Exception {
		/*Usager usager = new Usager("test", "test", "test", "023464534");
		iUsagerRepository.save(usager);*/
		System.out.println(EtatUsager.Client.toString());
	}
}
