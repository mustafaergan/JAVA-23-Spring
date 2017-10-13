package com.mustafaergan.ServerManagement.controller;

import java.lang.reflect.Type;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mustafaergan.ServerManagement.entity.Server;
import com.mustafaergan.ServerManagement.service.SunucuService;

@Controller
public class SunucularController {
	
	@Autowired
	SunucuService sunucuService;

	@GetMapping(path = "/sunucu.vek23")
	public String helloWorld(Model model) {
		return "about";
	}
	
	@GetMapping(path = "/sunucuekle.vek23")
	public String sunucuEkle(Model model){
		return "sunucuekle";
	}
	
	@GetMapping(path = "/sunucuekle.json")
	@ResponseBody
	public String sunucuEkleJson(@ModelAttribute Server server) {
//		Server server = new Server();
//		server.setName("linux");
//		server.setIp("10.0.4.102");
		sunucuService.sunucuEkle(server);
		Gson gson = new Gson();
		return gson.toJson("Veri Ekleme Başaralı");
	}
	
	@GetMapping(path = "/sunuculist.json")
	@ResponseBody
	public String sunuculist() {
		Gson gson = new Gson();
		List<Server> list = sunucuService.getSunucuList();
		Type listOfTestObject = new TypeToken<List<Server>>(){}.getType();
		String json = gson.toJson(list, listOfTestObject);
		return json;
	}
	
	
	
	
	
	
	
	
}
