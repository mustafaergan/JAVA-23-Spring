package com.mustafaergan.ServerManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KullanicilarController {

	@GetMapping(path = "/kullanici.vek23")
	public String helloWorld(Model model) {
		return "blog";
	}
	
}
