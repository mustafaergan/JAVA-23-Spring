package com.mustafaergan.ServerManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnasayfaController {
	
	@GetMapping(path = "/anasayfa.vek23")
	public String helloWorld(Model model) {
		return "index";
	}
	
	@GetMapping(path = "/menu")
	public String menu(Model model) {
		return "menu";
	}
	
	

}
