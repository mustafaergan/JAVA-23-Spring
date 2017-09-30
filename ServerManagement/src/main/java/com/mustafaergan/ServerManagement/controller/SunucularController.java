package com.mustafaergan.ServerManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SunucularController {

	@GetMapping(path = "/sunucu.vek23")
	public String helloWorld(Model model) {
		return "about";
	}
	
	
}
