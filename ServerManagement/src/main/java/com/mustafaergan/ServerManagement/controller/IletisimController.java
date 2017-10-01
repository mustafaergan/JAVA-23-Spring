package com.mustafaergan.ServerManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.mustafaergan.ServerManagement.MyData;
import com.mustafaergan.ServerManagement.entity.Contact;
import com.mustafaergan.ServerManagement.service.SunucuService;

@Controller
public class IletisimController {
	
	@Autowired
	SunucuService sunucuService;
	
	@GetMapping(path = "/iletisim.vek23")
	public String helloWorld(Model model) {
		return "contact";
	}
	
	@GetMapping(path = "/iletisimBilgileri.json")
	@ResponseBody
	public String iletisimBilgileri(@ModelAttribute Contact contact){
		sunucuService.iletisimEkle(contact);
//		System.out.println(contact.getName());
		Gson gson = new Gson();
//		String veri = "veri geldi";
//		MyData mydata = new MyData();
//		String myData = gson.toJson(mydata);
		return gson.toJson("İletişim Bilgisi Alımıştır");
	}

}
