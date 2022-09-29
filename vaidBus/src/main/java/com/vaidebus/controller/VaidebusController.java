package com.vaidebus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vaidebus.model.Orcamento;

@Controller
public class VaidebusController {
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/fretamento")
	public String fretamento() {
		return "fretamento";
	}
	
	@GetMapping("/modalidade") 
		public String modalidades() {
			return "modalidade";
		}
	
	@GetMapping("/vantagens")
	public String vantagens() {
		return "vantagens";
	}
	@GetMapping("/contato")
	public String contato(final Model model) {
		model.addAttribute("contato", new Orcamento());
		return "contato";
	}
	@PostMapping("/orcamento")
	public String orcamento(@ModelAttribute Orcamento orcamento) {
		orcamento.calcular();
		return "orcamento"; 
	}
}
