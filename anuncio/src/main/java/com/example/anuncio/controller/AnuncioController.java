package com.example.anuncio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.anuncio.model.Anuncio;

@Controller
public class AnuncioController {

	@RequestMapping("/anuncio")
	public String guardarAnuncio(Anuncio anuncio, Model model){
		model.addAttribute("anuncio", anuncio);
		return "Anuncio";
	}
}
