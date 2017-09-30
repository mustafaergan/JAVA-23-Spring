package com.mustafaergan.ServerManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IletisimController {
	
	@GetMapping(path = "/iletisim.vek23")
	public String helloWorld(Model model) {
		return "contact";
	}
	
	@GetMapping(path = "/iletisimBilgileri.json")
	@ResponseBody
	public String iletisimBilgileri(){
		return "Veri Geldi";
	}

}
