package com.tudonosso.habilidadeementalidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habimenthiago")
public class HabilidadesMentalidades {
	
	@GetMapping
	public String hello() {
		return "Bora manter a persistencia, muito trabalho em equipe, "
				+ "e o que não pode faltar é aquela dose de atencao aos detalhes!!!";
	}

}
