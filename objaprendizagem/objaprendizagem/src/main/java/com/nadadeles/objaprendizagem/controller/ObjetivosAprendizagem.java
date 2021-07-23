package com.nadadeles.objaprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objaprendizagemthiago")
public class ObjetivosAprendizagem {
	
	@GetMapping
	public String hello() {
		return "Mantenha o foco, com muita persistencia, fazendo o possível para ajudar"
				+ " os demais, assim como os mesmo lhe ajudam";
	}

}
